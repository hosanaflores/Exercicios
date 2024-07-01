package school.sptech;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@DisplayName("Genero")
public class GeneroTest {

  @Nested
  @DisplayName("1. Constantes")
  class ConstantesTest {

    @Test
    @DisplayName("1. Validar Constantes")
    void test1() {
      Class<Genero> clazz = Genero.class;

      assertAll(
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("ACAO")),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("AVENTURA")),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("COMEDIA")),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("DRAMA")),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("ROMANCE")),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("TERROR"))
      );
    }
  }
}
