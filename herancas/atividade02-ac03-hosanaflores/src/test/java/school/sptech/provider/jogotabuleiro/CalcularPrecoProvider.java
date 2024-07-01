package school.sptech.provider.jogotabuleiro;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class CalcularPrecoProvider implements ArgumentsProvider {

  @Override
  public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
    return Stream.of(
        Arguments.of("War", "COMUM", 100, 50.0),
        Arguments.of("Banco Imobiliário", "COMUM", 50, 25.0),
        Arguments.of("Detetive", "COMUM", 80, 40.0),
        Arguments.of("Jogo da Vida", "RARO", 60, 33.0),
        Arguments.of("Cara a Cara", "RARO", 40, 22.0),
        Arguments.of("Imagem & Ação", "RARO", 70, 38.5),
        Arguments.of("Jogo da Mesada", "MUITO_RARO", 30, 18.0),
        Arguments.of("Jogo da Forca", "MUITO_RARO", 20, 12.0),
        Arguments.of("Jogo da Velha", "MUITO_RARO", 10, 6.0),
        Arguments.of("Batalha Naval", "MUITO_RARO", 90, 54.0)
    );
  }
}
