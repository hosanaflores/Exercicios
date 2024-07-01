package school.sptech;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Midia")
class MidiaTest {

  @Nested
  @DisplayName("1. Atributos")
  class AtributosTest {

    @Test
    @DisplayName("1. Validar Atributos")
    void test1() {
      Class<Midia> clazz = Midia.class;

      assertAll(
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("nome")),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("nota")),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("classificacaoEtaria")),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("genero"))
      );
    }
  }

  @Nested
  @DisplayName("2. Métodos")
  class MetodosTest {

    @Test
    @DisplayName("1. Validar Métodos")
    void test1() {
      Class<Midia> clazz = Midia.class;

      assertAll(
          () -> assertDoesNotThrow(() -> clazz.getDeclaredMethod("calcularDuracaoTotal"))
      );
    }

    @Test
    @DisplayName("2. Métodos devem ser abstratos")
    void test2() {
      Class<Midia> clazz = Midia.class;

      assertAll(
          () -> assertTrue(Modifier.isAbstract(clazz.getDeclaredMethod("calcularDuracaoTotal").getModifiers()))
      );
    }
  }

  @Nested
  @DisplayName("3. Encapsulamento")
  class EncapsulamentoTest {

    @Test
    @DisplayName("1. Atributos Protegidos")
    void test1() {
      Class<Midia> clazz = Midia.class;
      Field[] campos = clazz.getDeclaredFields();

      Stream<Executable> validacoes = Arrays.stream(campos)
          .map(campo -> () -> assertTrue(Modifier.isProtected(campo.getModifiers())));

      assertAll(validacoes);
    }

    @Test
    @DisplayName("2. Métodos Públicos")
    void test2() {
      Class<Midia> clazz = Midia.class;

      List<Method> metodos = new ArrayList<>();

      try {
        metodos.add(clazz.getDeclaredMethod("calcularDuracaoTotal"));
      } catch (ReflectiveOperationException ignored) {}

      Stream<Executable> validacoes = metodos.stream()
          .map((metodo) -> () -> {
            assertTrue(Modifier.isPublic(metodo.getModifiers()));
          });

      assertAll(validacoes);
    }

    @Test
    @DisplayName("3. Atributos devem possuir getters e setters")
    void test3() {
      Class<Midia> clazz = Midia.class;
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

    @Test
    @DisplayName("4. Classe deve ser abstrata")
    void test4() {
      Class<Midia> clazz = Midia.class;
      assertAll(
          () -> assertTrue(Modifier.isAbstract(clazz.getModifiers())));
    }
  }
}
