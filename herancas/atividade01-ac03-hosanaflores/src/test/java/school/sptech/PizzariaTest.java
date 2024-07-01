package school.sptech;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import school.sptech.factory.PizzariaFactory;
import school.sptech.provider.pizzaria.AdicionarPedidoProvider;
import school.sptech.provider.pizzaria.CalcularFaturamentoProvider;
import school.sptech.provider.pizzaria.QtdPedidosDeliveryProvider;
import school.sptech.provider.pizzaria.QtdPedidosProvider;
import school.sptech.provider.pizzaria.QtdUnidadesVendidasProvider;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Pizzaria")
public class PizzariaTest {

  static Map<String, Field> campos() throws ReflectiveOperationException {
    Class<Pizzaria> clazz = Pizzaria.class;

    Map<String, Field> mapCampos = new HashMap<>();
    String[] nomeCampos = { "nome", "telefone", "pedidos" };

    for (String campoNome : nomeCampos) {
      Field campo = clazz.getDeclaredField(campoNome);
      campo.trySetAccessible();

      mapCampos.put(campoNome, campo);
    }

    return mapCampos;
  }

  @Nested
  @DisplayName("1. Atributos")
  class AtributosTest {

    @Test
    @DisplayName("1. Validar Atributos")
    void test1() {
      Class<Pizzaria> clazz = Pizzaria.class;

      assertAll(
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("nome"), "Deve possuir o atributo nome"),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("telefone"), "Deve possuir o atributo telefone"),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("pedidos"), "Deve possuir o atributo pedidos")
      );
    }
  }

  @Nested
  @DisplayName("2. Métodos")
  class MetodosTest {

    @Test
    @DisplayName("1. Validar Métodos")
    void test1() {
      Class<Pizzaria> clazz = Pizzaria.class;

      assertAll(
          () -> assertDoesNotThrow(() -> clazz.getDeclaredMethod("adicionarPedido", Pedido.class), "Deve possuir o método adicionarPedido"),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredMethod("qtdPedidos", Status.class), "Deve possuir o método qtdPedidos"),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredMethod("qtdPedidosDelivery"), "Deve possuir o método qtdPedidosDelivery"),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredMethod("qtdUnidadesVendidas", Sabor.class), "Deve possuir o método qtdUnidadesVendidas"),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredMethod("calcularFaturamento"), "Deve possuir o método calcularFaturamento")
      );
    }
  }

  @Nested
  @DisplayName("3. Encapsulamento")
  class EncapsulamentoTest {

    @Test
    @DisplayName("1. Atributos Privados")
    void test1() {
      Class<Pizzaria> clazz = Pizzaria.class;
      Field[] campos = clazz.getDeclaredFields();

      Stream<Executable> validacoes = Arrays.stream(campos)
          .map((campo) -> () -> assertTrue(Modifier.isPrivate(campo.getModifiers()),
              String.format("%s deve ser privado", campo.getName())));

      assertAll(validacoes);
    }

    @Test
    @DisplayName("2. Métodos Públicos")
    void test2() {
      Class<Pizzaria> clazz = Pizzaria.class;

      List<Method> metodos = new ArrayList<>();

      try {
        metodos.add(clazz.getDeclaredMethod("adicionarPedidos", Pedido.class));
      } catch (ReflectiveOperationException ignored) {}

      try {
        metodos.add(clazz.getDeclaredMethod("qtdPedidos", Status.class));
      } catch (ReflectiveOperationException ignored) {}

      try {
        metodos.add(clazz.getDeclaredMethod("qtdPedidosDelivery"));
      } catch (ReflectiveOperationException ignored) {}

      try {
        metodos.add(clazz.getDeclaredMethod("qtdUnidadesVendidas", Sabor.class));
      } catch (ReflectiveOperationException ignored) {}

      try {
        metodos.add(clazz.getDeclaredMethod("calcularFaturamento"));
      } catch (ReflectiveOperationException ignored) {}

      Stream<Executable> validacoes = metodos.stream()
          .map((metodo) -> () -> {
            assertTrue(Modifier.isPublic(metodo.getModifiers()), String.format("%s deve ser público", metodo.getName()));
          });

      assertAll(validacoes);
    }
  }

  @Nested
  @DisplayName("4. Métodos - adicionarPedido")
  class AdicionarPedidoTest {

    @ParameterizedTest
    @ArgumentsSource(AdicionarPedidoProvider.class)
    @DisplayName("Teste 1")
    void test1(String nome, String telefone, List<?> pedidos, Pedido pedido, List<?> expected) throws ReflectiveOperationException {
      Class<Pizzaria> clazz = Pizzaria.class;
      Method metodo = clazz.getDeclaredMethod("adicionarPedido", Pedido.class);

      // Case
      Object obj = PizzariaFactory.build(nome, telefone, pedidos);

      // When
      metodo.invoke(obj, pedido);

      // Then
      assertAll(
          () -> assertIterableEquals(expected, (List<?>) campos().get("pedidos").get(obj))
      );
    }
  }

  @Nested
  @DisplayName("5. Métodos - qtdPedidos")
  class QtdPedidosTest {

    @ParameterizedTest
    @ArgumentsSource(QtdPedidosProvider.class)
    @DisplayName("Teste 1")
    void test1(String nome, String telefone, List<?> pedidos, String status, Integer expected) throws ReflectiveOperationException {
      Class<Pizzaria> clazz = Pizzaria.class;
      Method metodo = clazz.getDeclaredMethod("qtdPedidos", Status.class);

      // Case
      Object obj = PizzariaFactory.build(nome, telefone, pedidos);

      // When
      Integer result = (Integer) metodo.invoke(obj, Status.valueOf(status));

      // Then
      assertEquals(expected, result, "Deve retornar a quantidade de pedidos com o status informado");
    }
  }

  @Nested
  @DisplayName("6. Métodos - qtdPedidosDelivery")
  class QtdPedidosDeliveryTest {

    @ParameterizedTest
    @ArgumentsSource(QtdPedidosDeliveryProvider.class)
    @DisplayName("Teste 1")
    void test1(String nome, String telefone, List<?> pedidos, Integer expected) throws ReflectiveOperationException {
      Class<Pizzaria> clazz = Pizzaria.class;
      Method metodo = clazz.getDeclaredMethod("qtdPedidosDelivery");

      // Case
      Object obj = PizzariaFactory.build(nome, telefone, pedidos);

      // When
      Integer result = (Integer) metodo.invoke(obj);

      // Then
      assertEquals(expected, result, "Deve retornar a quantidade de pedidos com delivery");
    }
  }

  @Nested
  @DisplayName("7. Métodos - qtdUnidadesVendidas")
  class QtdUnidadesVendidasTest {

    @ParameterizedTest
    @ArgumentsSource(QtdUnidadesVendidasProvider.class)
    @DisplayName("Teste 1")
    void test1(String nome, String telefone, List<?> pedidos, String sabor, Integer expected) throws ReflectiveOperationException {
      Class<Pizzaria> clazz = Pizzaria.class;
      Method metodo = clazz.getDeclaredMethod("qtdUnidadesVendidas", Sabor.class);

      // Case
      Object obj = PizzariaFactory.build(nome, telefone, pedidos);

      // When
      Integer result = (Integer) metodo.invoke(obj, Sabor.valueOf(sabor));

      // Then
      assertEquals(expected, result, "Deve retornar a quantidade de unidades vendidas do sabor informado");
    }
  }

  @Nested
  @DisplayName("8. Métodos - calcularFaturamento")
  class CalcularFaturamentoTest {

    @ParameterizedTest
    @ArgumentsSource(CalcularFaturamentoProvider.class)
    @DisplayName("Teste 1")
    void test1(String nome, String telefone, List<?> pedidos, Double expected) throws ReflectiveOperationException {
      Class<Pizzaria> clazz = Pizzaria.class;
      Method metodo = clazz.getDeclaredMethod("calcularFaturamento");

      // Case
      Object obj = PizzariaFactory.build(nome, telefone, pedidos);

      // When
      Double result = (Double) metodo.invoke(obj);

      // Then
      assertEquals(expected, result, "Deve retornar o faturamento total");
    }
  }
}
