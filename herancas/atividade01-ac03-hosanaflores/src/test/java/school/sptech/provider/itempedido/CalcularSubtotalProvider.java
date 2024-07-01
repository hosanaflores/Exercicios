package school.sptech.provider.itempedido;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class CalcularSubtotalProvider implements ArgumentsProvider {

  @Override
  public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
    return Stream.of(
        Arguments.of("CALABRESA", 2, 70.0),
        Arguments.of("MUSSARELA", 3, 90.0),
        Arguments.of("FRANGO", 1, 35.0),
        Arguments.of("CARNE", 4, 160.0),
        Arguments.of("PALMITO", 2, 80.0),
        Arguments.of("CHOCOLATE", 3, 150.0)
    );
  }
}
