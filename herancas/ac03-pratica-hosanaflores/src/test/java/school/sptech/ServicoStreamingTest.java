package school.sptech;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import school.sptech.factory.ServicoStreamingFactory;
import school.sptech.provider.servicostreaming.AdicionarProvider;
import school.sptech.provider.servicostreaming.DuracaoTotalPlataformaProvider;
import school.sptech.provider.servicostreaming.ListarFilmesPorGeneroProvider;
import school.sptech.provider.servicostreaming.ListarPorGeneroProvider;
import school.sptech.provider.servicostreaming.ListarPorNotaMaiorProvider;

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

@DisplayName("ServicoStreaming")
public class ServicoStreamingTest {

  static Map<String, Field> campos() throws ReflectiveOperationException {
    Class<ServicoStreaming> clazz = ServicoStreaming.class;

    Map<String, Field> mapCampos = new HashMap<>();
    String[] nomeCampos = { "nome", "midias" };

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
      Class<ServicoStreaming> clazz = ServicoStreaming.class;

      assertAll(
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("nome")),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("midias"))
      );
    }
  }

  @Nested
  @DisplayName("2. Métodos")
  class MetodosTest {

    @Test
    @DisplayName("1. Validar Métodos")
    void test1() {
      Class<ServicoStreaming> clazz = ServicoStreaming.class;

      assertAll(
          () -> assertDoesNotThrow(() -> clazz.getDeclaredMethod("adicionar", Midia.class)),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredMethod("duracaoTotalPlataforma")),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredMethod("listarPorNotaMaior", Double.class)),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredMethod("listarPorGenero", Genero.class)),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredMethod("listarFilmesPorGenero", Genero.class))
      );
    }
  }

  @Nested
  @DisplayName("3. Encapsulamento")
  class EncapsulamentoTest {

    @Test
    @DisplayName("1. Atributos Privados")
    void test1() {
      Class<ServicoStreaming> clazz = ServicoStreaming.class;
      Field[] campos = clazz.getDeclaredFields();

      Stream<Executable> validacoes = Arrays.stream(campos)
          .map(campo -> () -> assertTrue(Modifier.isPrivate(campo.getModifiers())));

      assertAll(validacoes);
    }

    @Test
    @DisplayName("2. Métodos Públicos")
    void test2() {
      Class<ServicoStreaming> clazz = ServicoStreaming.class;

      List<Method> metodos = new ArrayList<>();

      try {
        metodos.add(clazz.getDeclaredMethod("adicionar", Midia.class));
      } catch (ReflectiveOperationException ignored) {}

      try {
        metodos.add(clazz.getDeclaredMethod("duracaoTotalPlataforma"));
      } catch (ReflectiveOperationException ignored) {}

      try {
        metodos.add(clazz.getDeclaredMethod("listarPorNotaMaior", Integer.class));
      } catch (ReflectiveOperationException ignored) {}

      try {
        metodos.add(clazz.getDeclaredMethod("listarPorGenero", Genero.class));
      } catch (ReflectiveOperationException ignored) {}

      try {
        metodos.add(clazz.getDeclaredMethod("listarFilmesPorGenero", Genero.class));
      } catch (ReflectiveOperationException ignored) {}

      Stream<Executable> validacoes = metodos.stream()
          .map(metodo -> () -> {
            assertTrue(Modifier.isPublic(metodo.getModifiers()));
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
    void test1(String nome, List<?> midias, Midia midia, List<?> expected) throws ReflectiveOperationException {
      Class<ServicoStreaming> clazz = ServicoStreaming.class;
      Method metodo = clazz.getDeclaredMethod("adicionar", Midia.class);

      // Case
      Object obj = ServicoStreamingFactory.build(nome, midias);

      // When
      metodo.invoke(obj, midia);

      // Then
      assertAll(
          () -> assertIterableEquals(expected, (List<?>) campos().get("midias").get(obj))
      );
    }
  }

  @Nested
  @DisplayName("5. Métodos - duracaoTotalPlataforma")
  class DuracaoTotalPlataformaTest {

    @ParameterizedTest
    @ArgumentsSource(DuracaoTotalPlataformaProvider.class)
    @DisplayName("Teste 1")
    void test1(String nome, List<?> midias, Integer expected) throws ReflectiveOperationException {
      Class<ServicoStreaming> clazz = ServicoStreaming.class;
      Method metodo = clazz.getDeclaredMethod("duracaoTotalPlataforma");

      // Case
      Object obj = ServicoStreamingFactory.build(nome, midias);

      // When
      Object resposta = metodo.invoke(obj);

      // Then
      assertAll(
          () -> assertEquals(expected, resposta)
      );
    }
  }

  @Nested
  @DisplayName("6. Métodos - listarPorNotaMaior")
  class ListarPorNotaMaiorTest {

    @ParameterizedTest
    @ArgumentsSource(ListarPorNotaMaiorProvider.class)
    @DisplayName("Teste 1")
    void test1(String nome, List<?> midias, Double nota, List<?> expected) throws ReflectiveOperationException {
      Class<ServicoStreaming> clazz = ServicoStreaming.class;
      Method metodo = clazz.getDeclaredMethod("listarPorNotaMaior", Double.class);

      // Case
      Object obj = ServicoStreamingFactory.build(nome, midias);

      // When
      List<?> resposta = (List<?>) metodo.invoke(obj, nota);

      // Then
      assertAll(
          () -> assertIterableEquals(expected, resposta)
      );
    }
  }

  @Nested
  @DisplayName("7. Métodos - listarPorGenero")
  class ListarPorGeneroTest {

    @ParameterizedTest
    @ArgumentsSource(ListarPorGeneroProvider.class)
    @DisplayName("Teste 1")
    void test1(String nome, List<?> midias, String genero, List<?> expected) throws ReflectiveOperationException {
      Class<ServicoStreaming> clazz = ServicoStreaming.class;
      Method metodo = clazz.getDeclaredMethod("listarPorGenero", Genero.class);

      // Case
      Object obj = ServicoStreamingFactory.build(nome, midias);

      // When
      List<?> resposta = (List<?>) metodo.invoke(obj, Genero.valueOf(genero));

      // Then
      assertAll(
          () -> assertIterableEquals(expected, resposta)
      );
    }
  }

  @Nested
  @DisplayName("8. Métodos - listarFilmesPorGenero")
  class ListarFilmesPorGeneroTest {

    @ParameterizedTest
    @ArgumentsSource(ListarFilmesPorGeneroProvider.class)
    @DisplayName("Teste 1")
    void test1(String nome, String genero, List<?> midias, List<?> expected) throws ReflectiveOperationException {
      Class<ServicoStreaming> clazz = ServicoStreaming.class;
      Method metodo = clazz.getDeclaredMethod("listarFilmesPorGenero", Genero.class);

      // Case
      Object obj = ServicoStreamingFactory.build(nome, midias);

      // When
      List<?> resposta = (List<?>) metodo.invoke(obj, Genero.valueOf(genero));

      // Then
      assertAll(
          () -> assertIterableEquals(expected, resposta)
      );
    }
  }
}
