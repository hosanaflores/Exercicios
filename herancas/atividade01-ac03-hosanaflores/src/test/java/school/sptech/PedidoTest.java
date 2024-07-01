package school.sptech;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import school.sptech.factory.PedidoDeliveryFactory;
import school.sptech.factory.PedidoRestauranteFactory;
import school.sptech.provider.pedido.AdicionarItemProvider;

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

@DisplayName("Pedido")
public class PedidoTest {

  Map<String, Field> campos() throws ReflectiveOperationException {
    Class<Pedido> clazz = Pedido.class;

    Map<String, Field> mapCampos = new HashMap<>();
    String[] nomeCampos = { "cliente", "status", "itens" };

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
      Class<Pedido> clazz = Pedido.class;

      assertAll(
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("cliente"), "Deve possuir o atributo cliente"),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("status"), "Deve possuir o atributo status"),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("itens"), "Deve possuir o atributo itens")
      );
    }
  }

  @Nested
  @DisplayName("2. Métodos")
  class MetodosTest {

    @Test
    @DisplayName("1. Validar Métodos")
    void test1() {
      Class<Pedido> clazz = Pedido.class;

      assertAll(
        () -> assertDoesNotThrow(() -> clazz.getDeclaredMethod("calcularTotal"), "Deve possuir o método calcularTotal"),
        () -> assertDoesNotThrow(() -> clazz.getDeclaredMethod("adicionarItem", Sabor.class, Integer.class), "Deve possuir o método adicionarItem")
      );
    }

    @Test
    @DisplayName("2. Métodos devem ser abstratos")
    void test2() {
      Class<Pedido> clazz = Pedido.class;

      assertAll(
          () -> assertTrue(Modifier.isAbstract(clazz.getDeclaredMethod("calcularTotal").getModifiers()), "O método calcularTotal deve ser abstrato")
      );
    }
  }

  @Nested
  @DisplayName("3. Encapsulamento")
  class EncapsulamentoTest {

    @Test
    @DisplayName("1. Atributos Protegidos")
    void test1() {
      Class<Pedido> clazz = Pedido.class;
      Field[] campos = clazz.getDeclaredFields();

      Stream<Executable> validacoes = Arrays.stream(campos)
          .map((campo) -> () -> assertTrue(Modifier.isProtected(campo.getModifiers()),
              String.format("%s deve ser protegido", campo.getName())));

      assertAll(validacoes);
    }

    @Test
    @DisplayName("2. Métodos Públicos")
    void test2() {
      Class<Pedido> clazz = Pedido.class;

      List<Method> metodos = new ArrayList<>();

      try {
        metodos.add(clazz.getDeclaredMethod("calcularTotal"));
      } catch (ReflectiveOperationException ignored) {}

      try {
        metodos.add(clazz.getDeclaredMethod("adicionarItem", Sabor.class, Integer.class));
      } catch (ReflectiveOperationException ignored) {}

      Stream<Executable> validacoes = metodos.stream()
          .map((metodo) -> () -> {
            assertTrue(Modifier.isPublic(metodo.getModifiers()), String.format("%s deve ser público", metodo.getName()));
          });

      assertAll(validacoes);
    }

    @Test
    @DisplayName("3. Atributos devem possuir getters e setters")
    void test3() {
      Class<Pedido> clazz = Pedido.class;
      Field[] campos = clazz.getDeclaredFields();

      Stream<Executable> validacoesGetter = Arrays.stream(campos)
          .map((campo) -> () -> {
            String getName = String.format("get%s", StringUtils.capitalize(campo.getName()));
            assertDoesNotThrow(() -> {
              Method getter = clazz.getDeclaredMethod(getName);
              int getModifier = getter.getModifiers();
              assertTrue(Modifier.isPublic(getModifier), String.format("Getter %s deve ser público", getName));
            }, String.format("Deve possuir o getter %s", getName));
          });

      Stream<Executable> validacoesSetter = Arrays.stream(campos)
          .map((campo) -> () -> {
            String setName = String.format("set%s", StringUtils.capitalize(campo.getName()));
            assertDoesNotThrow(() -> {
              Method setter = clazz.getDeclaredMethod(setName, campo.getType());
              int setModifier = setter.getModifiers();
              assertTrue(Modifier.isPublic(setModifier), String.format("Setter %s deve ser público", setName));
            }, String.format("Deve possuir o setter %s", setName));
          });

      assertAll(Stream.concat(validacoesGetter, validacoesSetter));
    }

    @Test
    @DisplayName("4. Classe deve ser abstrata")
    void test4() {
      Class<Pedido> clazz = Pedido.class;
      assertAll(
          () -> assertTrue(Modifier.isAbstract(clazz.getModifiers()), "A classe deve ser abstrata"));
    }
  }

  @Nested
  @DisplayName("4. Método - adicionarItem")
  class AdicionarItemTest {

    @ParameterizedTest
    @ArgumentsSource(AdicionarItemProvider.class)
    @DisplayName("Teste 1 - PedidoDelivery")
    void test1(String cliente, String status, List<?> itens, String sabor, Integer quantidade, List<?> expected) throws ReflectiveOperationException {
      Class<Pedido> clazz = Pedido.class;
      Method method = clazz.getDeclaredMethod("adicionarItem", Sabor.class, Integer.class);

      // Case
      Object pedido = PedidoDeliveryFactory.build(cliente, status, itens, 0.0);

      // When
      method.invoke(pedido, Sabor.valueOf(sabor), quantidade);

      // Then
      List<?> itensPedido = (List<?>) clazz.getDeclaredField("itens").get(pedido);
      List<?> itensAnteriores = itensPedido.subList(0, itensPedido.size() - 1);
      List<?> itensAnterioresEsperados = expected.subList(0, expected.size() - 1);
      Object itemAdicionado = itensPedido.subList(itensPedido.size() - 1, itensPedido.size()).stream().findFirst().orElse(null);
      Object itemAdicionadoEsperado = expected.subList(expected.size() - 1, expected.size()).stream().findFirst().orElse(null);

      Field campoSabor = ItemPedido.class.getDeclaredField("sabor");
      campoSabor.trySetAccessible();

      Field campoQuantidade = ItemPedido.class.getDeclaredField("quantidade");
      campoQuantidade.trySetAccessible();

      assertAll(
          () -> assertIterableEquals(itensAnterioresEsperados, itensAnteriores),
          () -> assertEquals(campoSabor.get(itemAdicionadoEsperado), campoSabor.get(itemAdicionado)),
          () -> assertEquals(campoQuantidade.get(itemAdicionadoEsperado), campoQuantidade.get(itemAdicionado))
      );
    }

    @ParameterizedTest
    @ArgumentsSource(AdicionarItemProvider.class)
    @DisplayName("Teste 2 - PedidoRestaurante")
    void test2(String cliente, String status, List<?> itens, String sabor, Integer quantidade, List<?> expected) throws ReflectiveOperationException {
      Class<Pedido> clazz = Pedido.class;
      Method method = clazz.getDeclaredMethod("adicionarItem", Sabor.class, Integer.class);

      // Case
      Object pedido = PedidoRestauranteFactory.build(cliente, status, itens, 0.0, false);

      // When
      method.invoke(pedido, Sabor.valueOf(sabor), quantidade);

      // Then
      List<?> itensPedido = (List<?>) clazz.getDeclaredField("itens").get(pedido);
      List<?> itensAnteriores = itensPedido.subList(0, itensPedido.size() - 1);
      List<?> itensAnterioresEsperados = expected.subList(0, expected.size() - 1);
      Object itemAdicionado = itensPedido.subList(itensPedido.size() - 1, itensPedido.size()).stream().findFirst().orElse(null);
      Object itemAdicionadoEsperado = expected.subList(expected.size() - 1, expected.size()).stream().findFirst().orElse(null);

      Field campoSabor = ItemPedido.class.getDeclaredField("sabor");
      campoSabor.trySetAccessible();

      Field campoQuantidade = ItemPedido.class.getDeclaredField("quantidade");
      campoQuantidade.trySetAccessible();

      assertAll(
          () -> assertIterableEquals(itensAnterioresEsperados, itensAnteriores),
          () -> assertEquals(campoSabor.get(itemAdicionadoEsperado), campoSabor.get(itemAdicionado)),
          () -> assertEquals(campoQuantidade.get(itemAdicionadoEsperado), campoQuantidade.get(itemAdicionado))
      );
    }
  }
}
