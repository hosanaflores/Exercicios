package school.sptech;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@DisplayName("Formato")
public class FormatoTest {

  @Nested
  @DisplayName("1. Constantes")
  class ConstantesTest {

    @Test
    @DisplayName("1. Validar Constantes")
    void test1() {
      Class<Formato> clazz = Formato.class;

      assertAll(
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("DIGITAL")),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("COMUM")),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("CAPA_DURA"))
      );
    }
  }
}
