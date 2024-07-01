package school.sptech.provider.serie;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class CalcularDuracaoTotalProvider implements ArgumentsProvider {

  @Override
  public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
    return Stream.of(
        Arguments.of("Breaking Bad", 9.5, 16, "DRAMA", 62, 5, 50, 3100),
        Arguments.of("Game of Thrones", 9.3, 18, "DRAMA", 60, 8, 60, 3600),
        Arguments.of("The Walking Dead", 8.2, 11, "TERROR", 45, 11, 41, 1845),
        Arguments.of("Stranger Things", 8.7, 3, "TERROR", 50, 3, 50, 2500),
        Arguments.of("The Big Bang Theory", 8.1, 12, "COMEDIA", 280, 12, 22, 6160),
        Arguments.of("Friends", 8.9, 10, "COMEDIA", 234, 10, 22, 5148),
        Arguments.of("How I Met Your Mother", 8.3, 9, "COMEDIA", 208, 9, 22, 4576),
        Arguments.of("The Office", 8.9, 9, "COMEDIA", 188, 9, 22, 4136),
        Arguments.of("Grey's Anatomy", 7.6, 17, "DRAMA", 431, 20, 40, 17240),
        Arguments.of("Supernatural", 8.4, 15, "TERROR", 327, 15, 42, 13734),
        Arguments.of("The Originals", 8.2, 5, "TERROR", 50, 5, 50, 2500)
    );
  }
}
