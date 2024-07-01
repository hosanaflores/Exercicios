package school.sptech.provider.pedidodelivery;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.List;
import java.util.stream.Stream;

public class CalcularFreteProvider implements ArgumentsProvider {

  @Override
  public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
    return Stream.of(
        Arguments.of("Paulo", "PENDENTE", List.of(), 20.0, 10.0),
        Arguments.of("Pedro", "PENDENTE", List.of(), 5.0, 7.0),
        Arguments.of("Bianca", "PENDENTE", List.of(), 10.0, 10.0),
        Arguments.of("Maria", "PENDENTE", List.of(), 3.0, 5.0),
        Arguments.of("João", "PENDENTE", List.of(), 15.0, 10.0),
        Arguments.of("Lucas", "PENDENTE", List.of(), 5.1, 7.0)
    );
  }
}
