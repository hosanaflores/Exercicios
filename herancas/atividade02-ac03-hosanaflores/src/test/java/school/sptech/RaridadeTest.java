package school.sptech;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Raridade")
public class RaridadeTest {

  @Nested
  @DisplayName("1. Constantes")
  class ConstantesTest {

    @Test
    @DisplayName("1. Validar Constantes")
    void test1() {
      Class<Raridade> clazz = Raridade.class;

      assertAll(
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("COMUM")),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("RARO")),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("MUITO_RARO"))
      );
    }
  }

  @Nested
  @DisplayName("2. Atributos")
  class AtributosTest {

    @Test
    @DisplayName("1. Validar Atributos")
    void test1() {
      Class<Raridade> clazz = Raridade.class;

      assertAll(
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("adicionalPorcentagem"))
      );
    }
  }

  @Nested
  @DisplayName("3. Encapsulamento")
  class EncapsulamentoTest {

    @Test
    @DisplayName("1. Validar Encapsulamento")
    void test1() throws ReflectiveOperationException {
      Class<Raridade> clazz = Raridade.class;
      Field[] campos = { clazz.getDeclaredField("adicionalPorcentagem") };

      Stream<Executable> validacoes = Arrays.stream(campos)
          .map((campo) -> () -> assertTrue(Modifier.isPrivate(campo.getModifiers()),
              String.format("o atributo %s deve ser privado", campo.getName())));

      Stream<Executable> validacoesFinal = Arrays.stream(campos)
          .map((campo) -> () -> assertTrue(Modifier.isFinal(campo.getModifiers()),
              String.format("o atributo %s deve ser final", campo.getName())));

      assertAll(Stream.concat(validacoes, validacoesFinal));
    }

    @Test
    @DisplayName("2. Atributos devem possuir getters")
    void test3() throws ReflectiveOperationException {
      Class<Raridade> clazz = Raridade.class;
      Field[] campos = { clazz.getDeclaredField("adicionalPorcentagem") };

      Stream<Executable> validacoesGetter = Arrays.stream(campos)
          .map((campo) -> () -> {
            String getName = String.format("get%s", StringUtils.capitalize(campo.getName()));
            assertDoesNotThrow(() -> {
              Method getter = clazz.getDeclaredMethod(getName);
              int getModifier = getter.getModifiers();
              assertTrue(Modifier.isPublic(getModifier), String.format("Getter %s deve ser público", getName));
            }, String.format("Deve possuir o getter %s", getName));
          });

      assertAll(validacoesGetter);
    }
  }

  @Nested
  @DisplayName("4. Adicional Porcentagem")
  class PrecoTest {

    @Test
    @DisplayName("1. Validar Adicional Porcentagem")
    void test1() {
      Field campo = assertDoesNotThrow(() -> Raridade.class.getDeclaredField("adicionalPorcentagem"));
      campo.setAccessible(true);

      assertAll(
          () -> assertEquals(0.0, campo.get(Raridade.valueOf("COMUM"))),
          () -> assertEquals(10.0, campo.get(Raridade.valueOf("RARO"))),
          () -> assertEquals(20.0, campo.get(Raridade.valueOf("MUITO_RARO")))
      );
    }
  }
}
