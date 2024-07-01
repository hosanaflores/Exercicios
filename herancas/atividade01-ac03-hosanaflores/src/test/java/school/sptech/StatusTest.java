package school.sptech;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@DisplayName("Status")
public class StatusTest {

  @Nested
  @DisplayName("1. Constantes")
  class ConstantesTest {

    @Test
    @DisplayName("1. Validar Constantes")
    void test1() {
      Class<Status> clazz = Status.class;

      assertAll(
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("PENDENTE")),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("EM_PREPARO")),
          () -> assertDoesNotThrow(() -> clazz.getDeclaredField("CONCLUIDO"))
      );
    }
  }
}
