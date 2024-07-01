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

@DisplayName("Sabor")
public class SaborTest {

  @Nested
  @DisplayName("1. Constantes")
  class ConstantesTest {

    @Test
    @DisplayName("1. Validar Constantes")
    void test1() {
      Class<Sabor> clazz = Sabor.class;

      assertAll(
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("CALABRESA")),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("MUSSARELA")),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("FRANGO")),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("CARNE")),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("PALMITO")),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("CHOCOLATE"))
      );
    }
  }

  @Nested
  @DisplayName("2. Atributos")
  class AtributosTest {

    @Test
    @DisplayName("1. Validar Atributos")
    void test1() {
      Class<Sabor> clazz = Sabor.class;

      assertAll(
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("preco"))
      );
    }
  }

  @Nested
  @DisplayName("3. Encapsulamento")
  class EncapsulamentoTest {

    @Test
    @DisplayName("1. Validar Encapsulamento")
    void test1() throws ReflectiveOperationException {
      Class<Sabor> clazz = Sabor.class;
      Field[] campos = { clazz.getDeclaredField("preco") };

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
      Class<Sabor> clazz = Sabor.class;
      Field[] campos = { clazz.getDeclaredField("preco") };

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
  @DisplayName("4. Preços")
  class PrecoTest {

    @Test
    @DisplayName("1. Validar Preços")
    void test1() {
      Field campo = assertDoesNotThrow(() -> Sabor.class.getDeclaredField("preco"));
      campo.setAccessible(true);

      assertAll(
          () -> assertEquals(35.0, campo.get(Sabor.valueOf("CALABRESA"))),
          () -> assertEquals(30.0, campo.get(Sabor.valueOf("MUSSARELA"))),
          () -> assertEquals(35.0, campo.get(Sabor.valueOf("FRANGO"))),
          () -> assertEquals(40.0, campo.get(Sabor.valueOf("CARNE"))),
          () -> assertEquals(40.0, campo.get(Sabor.valueOf("PALMITO"))),
          () -> assertEquals(50.0, campo.get(Sabor.valueOf("CHOCOLATE")))
      );
    }
  }
}
