package school.sptech.provider.filme;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class CalcularDuracaoTotalProvider implements ArgumentsProvider {

  @Override
  public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
    return Stream.of(
        Arguments.of("Um sonho de liberdade", 9.5, 16, "DRAMA", "Frank Darabont", 142, 10, 152),
        Arguments.of("O Poderoso Chefão", 9.0, 14, "DRAMA", "Francis Ford Coppola", 175, 10, 185),
        Arguments.of("O Poderoso Chefão II", 8.9, 14, "DRAMA", "Francis Ford Coppola", 202, 10, 212),
        Arguments.of("Batman: O Cavaleiro das Trevas", 9.2, 12, "ACAO", "Christopher Nolan", 152, 10, 162),
        Arguments.of("12 Homens e uma Sentença", 8.9, 12, "DRAMA", "Sidney Lumet", 96, 10, 106),
        Arguments.of("Sexta-Feira 13", 6.5, 18, "TERROR", "Sean S. Cunningham", 95, 10, 105),
        Arguments.of("A Lista de Schindler", 8.9, 14, "DRAMA", "Steven Spielberg", 195, 10, 205),
        Arguments.of("O Senhor dos Anéis: O Retorno do Rei", 8.9, 12, "ACAO", "Peter Jackson", 201, 10, 211),
        Arguments.of("O Exorcista", 8.0, 18, "TERROR", "William Friedkin", 122, 10, 132),
        Arguments.of("Pulp Fiction: Tempo de Violência", 8.9, 18, "DRAMA", "Quentin Tarantino", 154, 10, 164),
        Arguments.of("O Senhor dos Anéis: A Sociedade do Anel", 8.8, 12, "ACAO", "Peter Jackson", 178, 10, 188),
        Arguments.of("Forrest Gump: O Contador de Histórias", 8.8, 12, "DRAMA", "Robert Zemeckis", 142, 10, 152),
        Arguments.of("O Iluminado", 8.4, 16, "TERROR", "Stanley Kubrick", 146, 10, 156)
    );
  }
}
