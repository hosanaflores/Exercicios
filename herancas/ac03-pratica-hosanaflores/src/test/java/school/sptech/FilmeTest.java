package school.sptech;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import school.sptech.factory.FilmeFactory;
import school.sptech.provider.filme.CalcularDuracaoTotalProvider;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Filme")
public class FilmeTest {

  @Nested
  @DisplayName("1. Atributos")
  class AtributosTest {

    @Test
    @DisplayName("1. Validar Atributos")
    void test1() {
      Class<Filme> clazz = Filme.class;

      assertAll(
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("diretor")),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("duracao")),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("duracaoCreditos"))
      );
    }
  }

  @Nested
  @DisplayName("2. Métodos")
  class MetodosTest {

    @Test
    @DisplayName("1. Validar Métodos")
    void test1() {
      Class<Filme> clazz = Filme.class;

      assertAll(
          () -> assertDoesNotThrow(() -> clazz.getDeclaredMethod("calcularDuracaoTotal"))
      );
    }
  }

  @Nested
  @DisplayName("3. Encapsulamento")
  class EncapsulamentoTest {

    @Test
    @DisplayName("1. Atributos Privados")
    void test1() {
      Class<Filme> clazz = Filme.class;
      Field[] campos = clazz.getDeclaredFields();

      Stream<Executable> validacoes = Arrays.stream(campos)
          .map(campo -> () -> assertTrue(Modifier.isPrivate(campo.getModifiers()),
              String.format("%s deve ser privado", campo.getName())));

      assertAll(validacoes);
    }

    @Test
    @DisplayName("2. Métodos Públicos")
    void test2() {
      Class<Filme> clazz = Filme.class;

      List<Method> metodos = new ArrayList<>();

      try {
        metodos.add(clazz.getDeclaredMethod("calcularDuracaoTotal"));
      } catch (ReflectiveOperationException ignored) {}

      Stream<Executable> validacoes = metodos.stream()
          .map(metodo -> () -> {
            assertTrue(Modifier.isPublic(metodo.getModifiers()));
          });

      assertAll(validacoes);
    }

    @Test
    @DisplayName("3. Atributos devem possuir getters e setters")
    void test3() {
      Class<Filme> clazz = Filme.class;
      Field[] campos = clazz.getDeclaredFields();

      Stream<Executable> validacoesGetter = Arrays.stream(campos)
          .map(campo -> () -> {
            String getName = String.format("get%s", StringUtils.capitalize(campo.getName()));
            assertDoesNotThrow(() -> {
              Method getter = clazz.getDeclaredMethod(getName);
              int getModifier = getter.getModifiers();
              assertTrue(Modifier.isPublic(getModifier));
            });
          });

      Stream<Executable> validacoesSetter = Arrays.stream(campos)
          .map(campo -> () -> {
            String setName = String.format("set%s", StringUtils.capitalize(campo.getName()));
            assertDoesNotThrow(() -> {
              Method setter = clazz.getDeclaredMethod(setName, campo.getType());
              int setModifier = setter.getModifiers();
              assertTrue(Modifier.isPublic(setModifier));
            });
          });

      assertAll(Stream.concat(validacoesGetter, validacoesSetter));
    }
  }

  @Nested
  @DisplayName("4. Método - calcularDuracaoTotal")
  class MetodoCalcularTotalTest {

    @ParameterizedTest
    @ArgumentsSource(CalcularDuracaoTotalProvider.class)
    @DisplayName("Teste 1")
    void test1(String nome, Double nota, Integer classificacaoEtaria,
               String genero, String diretor, Integer duracao,
               Integer duracaoCreditos, Integer expected) throws ReflectiveOperationException {
      Class<Filme> clazz = Filme.class;
      Method metodo = clazz.getDeclaredMethod("calcularDuracaoTotal");

      // Case
      Object obj = FilmeFactory.build(nome, nota, classificacaoEtaria, genero, diretor, duracao, duracaoCreditos);

      // When
      Object resposta = metodo.invoke(obj);

      // Then
      assertAll(() -> assertEquals(expected, resposta));
    }
  }
}
