package school.sptech;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import school.sptech.factory.LivrariaFactory;
import school.sptech.provider.livraria.AdicionarProvider;
import school.sptech.provider.livraria.BuscarLivrosPorFormatoProvider;
import school.sptech.provider.livraria.BuscarPorQtdPecasMaiorProvider;
import school.sptech.provider.livraria.BuscarPorRaridadeProvider;
import school.sptech.provider.livraria.CalcularTotalLivrosProvider;
import school.sptech.provider.livraria.ExistePorNomeProvider;
import school.sptech.provider.livraria.RemoverProvider;

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

@DisplayName("Livraria")
public class LivrariaTest {

  static Map<String, Field> campos() throws ReflectiveOperationException {
    Class<Livraria> clazz = Livraria.class;

    Map<String, Field> mapCampos = new HashMap<>();
    String[] nomeCampos = { "nome", "produtos" };

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
      Class<Livraria> clazz = Livraria.class;

      assertAll(
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("nome"), "Deve possuir o atributo nome"),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("produtos"), "Deve possuir o atributo produtos")
      );
    }
  }

  @Nested
  @DisplayName("2. Métodos")
  class MetodosTest {

    @Test
    @DisplayName("1. Validar Métodos")
    void test1() {
      Class<Livraria> clazz = Livraria.class;

      assertAll(
          () -> assertDoesNotThrow(() -> clazz.getDeclaredMethod("adicionar", Produto.class), "Deve possuir o método adicionar"),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredMethod("remover", String.class), "Deve possuir o método remover"),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredMethod("calcularTotalLivros"), "Deve possuir o método calcularTotalLivros"),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredMethod("buscarLivrosPorFormato", Formato.class), "Deve possuir o método buscarLivrosPorFormato"),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredMethod("buscarPorRaridade", Raridade.class), "Deve possuir o método buscarPorRaridade"),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredMethod("existePorNome", String.class), "Deve possuir o método existePorNome"),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredMethod("buscarPorQtdPecasMaior", Integer.class), "Deve possuir o método buscarPorQtdPecasMaior")
      );
    }
  }

  @Nested
  @DisplayName("3. Encapsulamento")
  class EncapsulamentoTest {

    @Test
    @DisplayName("1. Atributos Privados")
    void test1() {
      Class<Livraria> clazz = Livraria.class;
      Field[] campos = clazz.getDeclaredFields();

      Stream<Executable> validacoes = Arrays.stream(campos)
          .map((campo) -> () -> assertTrue(Modifier.isPrivate(campo.getModifiers()),
              String.format("%s deve ser privado", campo.getName())));

      assertAll(validacoes);
    }

    @Test
    @DisplayName("2. Métodos Públicos")
    void test2() {
      Class<Livraria> clazz = Livraria.class;

      List<Method> metodos = new ArrayList<>();

      try {
        metodos.add(clazz.getDeclaredMethod("adicionar", Produto.class));
      } catch (ReflectiveOperationException ignored) {}

      try {
        metodos.add(clazz.getDeclaredMethod("remover", String.class));
      } catch (ReflectiveOperationException ignored) {}

      try {
        metodos.add(clazz.getDeclaredMethod("calcularTotalLivros"));
      } catch (ReflectiveOperationException ignored) {}

      try {
        metodos.add(clazz.getDeclaredMethod("buscarLivrosPorFormato", Formato.class));
      } catch (ReflectiveOperationException ignored) {}

      try {
        metodos.add(clazz.getDeclaredMethod("buscarPorRaridade", Raridade.class));
      } catch (ReflectiveOperationException ignored) {}

      try {
        metodos.add(clazz.getDeclaredMethod("existePorNome"));
      } catch (ReflectiveOperationException ignored) {}

      try {
        metodos.add(clazz.getDeclaredMethod("buscarPorQtdPecasMaior", Integer.class));
      } catch (ReflectiveOperationException ignored) {}

      Stream<Executable> validacoes = metodos.stream()
          .map((metodo) -> () -> {
            assertTrue(Modifier.isPublic(metodo.getModifiers()), String.format("%s deve ser público", metodo.getName()));
          });

      assertAll(validacoes);
    }
  }

  @Nested
  @DisplayName("4. Métodos - adicionar")
  class AdicionarTest {

    @ParameterizedTest
    @ArgumentsSource(AdicionarProvider.class)
    @DisplayName("Teste 1")
    void test1(String nome, List<?> produtos, Produto produto, List<?> expected) throws ReflectiveOperationException {
      Class<Livraria> clazz = Livraria.class;
      Method metodo = clazz.getDeclaredMethod("adicionar", Produto.class);

      // Case
      Object obj = LivrariaFactory.build(nome, produtos);

      // When
      metodo.invoke(obj, produto);

      // Then
      assertAll(
          () -> assertIterableEquals(expected, (List<?>) campos().get("produtos").get(obj))
      );
    }
  }

  @Nested
  @DisplayName("5. Métodos - remover")
  class RemoverTest {

    @ParameterizedTest
    @ArgumentsSource(RemoverProvider.class)
    @DisplayName("Teste 1")
    void test1(String nome, List<?> produtos, String nomeProduto, List<?> expected) throws ReflectiveOperationException {
      Class<Livraria> clazz = Livraria.class;
      Method metodo = clazz.getDeclaredMethod("remover", String.class);

      // Case
      Object obj = LivrariaFactory.build(nome, produtos);

      // When
      metodo.invoke(obj, nomeProduto);

      // Then
      assertAll(
          () -> assertIterableEquals(expected, (List<?>) campos().get("produtos").get(obj))
      );
    }
  }

  @Nested
  @DisplayName("6. Métodos - calcularTotalLivros")
  class CalcularTotalLivrosTest {

    @ParameterizedTest
    @ArgumentsSource(CalcularTotalLivrosProvider.class)
    @DisplayName("Teste 1")
    void test1(String nome, List<?> produtos, Double expected) throws ReflectiveOperationException {
      Class<Livraria> clazz = Livraria.class;
      Method metodo = clazz.getDeclaredMethod("calcularTotalLivros");

      // Case
      Object obj = LivrariaFactory.build(nome, produtos);

      // When
      Object response = metodo.invoke(obj);

      // Then
      assertAll(
          () -> assertEquals(expected, (Double) response, 0.1)
      );
    }
  }

  @Nested
  @DisplayName("7. Métodos - buscarLivrosPorFormato")
  class BuscarLivrosPorFormatoTest {

    @ParameterizedTest
    @ArgumentsSource(BuscarLivrosPorFormatoProvider.class)
    @DisplayName("Teste 1")
    void test1(String nome, List<?> produtos, String formato, List<?> expected) throws ReflectiveOperationException {
      Class<Livraria> clazz = Livraria.class;
      Method metodo = clazz.getDeclaredMethod("buscarLivrosPorFormato", Formato.class);

      // Case
      Object obj = LivrariaFactory.build(nome, produtos);

      // When
      List<?> response = (List<?>) metodo.invoke(obj, Formato.valueOf(formato));

      // Then
      assertAll(
          () -> assertIterableEquals(expected, response)
      );
    }
  }

  @Nested
  @DisplayName("8. Métodos - buscarPorRaridade")
  class BuscarPorRaridadeTest {

    @ParameterizedTest
    @ArgumentsSource(BuscarPorRaridadeProvider.class)
    @DisplayName("Teste 1")
    void test1(String nome, List<?> produtos, String raridade, List<?> expected) throws ReflectiveOperationException {
      Class<Livraria> clazz = Livraria.class;
      Method metodo = clazz.getDeclaredMethod("buscarPorRaridade", Raridade.class);

      // Case
      Object obj = LivrariaFactory.build(nome, produtos);

      // When
      List<?> response = (List<?>) metodo.invoke(obj, Raridade.valueOf(raridade));

      // Then
      assertAll(
          () -> assertIterableEquals(expected, response)
      );
    }
  }

  @Nested
  @DisplayName("9. Métodos - existePorNome")
  class ExistsPorNomeTest {

    @ParameterizedTest
    @ArgumentsSource(ExistePorNomeProvider.class)
    @DisplayName("Teste 1")
    void test1(String nome, List<?> produtos, String nomeProduto, Boolean expected) throws ReflectiveOperationException {
      Class<Livraria> clazz = Livraria.class;
      Method metodo = clazz.getDeclaredMethod("existePorNome", String.class);

      // Case
      Object obj = LivrariaFactory.build(nome, produtos);

      // When
      Object response = metodo.invoke(obj, nomeProduto);

      // Then
      assertAll(
          () -> assertEquals(expected, response)
      );
    }
  }

  @Nested
  @DisplayName("10. Métodos - buscarPorQtdPecasMaior")
  class BuscarPorQtdPecasMaiorTest {

    @ParameterizedTest
    @ArgumentsSource(BuscarPorQtdPecasMaiorProvider.class)
    @DisplayName("Teste 1")
    void test1(String nome, List<?> produtos, Integer qtdPecas, List<?> expected) throws ReflectiveOperationException {
      Class<Livraria> clazz = Livraria.class;
      Method metodo = clazz.getDeclaredMethod("buscarPorQtdPecasMaior", Integer.class);

      // Case
      Object obj = LivrariaFactory.build(nome, produtos);

      // When
      List<?> response = (List<?>) metodo.invoke(obj, qtdPecas);

      // Then
      assertAll(
          () -> assertIterableEquals(expected, response)
      );
    }
  }
}
