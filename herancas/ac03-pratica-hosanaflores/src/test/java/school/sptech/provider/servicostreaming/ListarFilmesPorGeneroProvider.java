package school.sptech.provider.servicostreaming;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import school.sptech.factory.FilmeFactory;
import school.sptech.factory.SerieFactory;

import java.util.List;
import java.util.stream.Stream;

public class ListarFilmesPorGeneroProvider implements ArgumentsProvider {

  @Override
  public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
    Object f1 = FilmeFactory.build("Um sonho de liberdade", 9.5, 16, "DRAMA", "Frank Darabont", 142, 10);
    Object f2 = FilmeFactory.build("O Poderoso Chefão", 9.0, 14, "DRAMA", "Francis Ford Coppola", 175, 10);
    Object f3 = FilmeFactory.build("O Poderoso Chefão II", 8.9, 14, "DRAMA", "Francis Ford Coppola", 202, 10);
    Object f4 = FilmeFactory.build("Batman: O Cavaleiro das Trevas", 9.2, 12, "ACAO", "Christopher Nolan", 152, 10);
    Object f5 = FilmeFactory.build("12 Homens e uma Sentença", 8.9, 12, "DRAMA", "Sidney Lumet", 96, 10);
    Object f6 = FilmeFactory.build("Sexta-Feira 13", 6.5, 18, "TERROR", "Sean S. Cunningham", 95, 10);
    Object f7 = FilmeFactory.build("A Lista de Schindler", 8.9, 14, "DRAMA", "Steven Spielberg", 195, 10);
    Object f8 = FilmeFactory.build("O Senhor dos Anéis: O Retorno do Rei", 8.9, 12, "ACAO", "Peter Jackson", 201, 10);
    Object f9 = FilmeFactory.build("O Exorcista", 8.0, 18, "TERROR", "William Friedkin", 122, 10);
    Object f10 = FilmeFactory.build("Pulp Fiction: Tempo de Violência", 8.9, 18, "DRAMA", "Quentin Tarantino", 154, 10);

    Object s1 = SerieFactory.build("Breaking Bad", 9.5, 16, "DRAMA", 62, 5, 50);
    Object s2 = SerieFactory.build("Game of Thrones", 9.3, 18, "DRAMA", 60, 8, 60);
    Object s3 = SerieFactory.build("The Walking Dead", 8.2, 11, "TERROR", 45, 11, 41);
    Object s4 = SerieFactory.build("Stranger Things", 8.7, 3, "TERROR", 50, 3, 50);
    Object s5 = SerieFactory.build("The Big Bang Theory", 8.1, 12, "COMEDIA", 280, 12, 22);
    Object s6 = SerieFactory.build("Friends", 8.9, 10, "COMEDIA", 234, 10, 22);
    Object s7 = SerieFactory.build("How I Met Your Mother", 8.3, 9, "COMEDIA", 208, 9, 22);
    Object s8 = SerieFactory.build("The Office", 8.9, 9, "COMEDIA", 188, 9, 22);
    Object s9 = SerieFactory.build("Grey's Anatomy", 7.6, 17, "DRAMA", 431, 20, 40);
    Object s10 = SerieFactory.build("Supernatural", 8.4, 15, "TERROR", 327, 15, 42);

    return Stream.of(
        Arguments.of("Netflix", "DRAMA", List.of(), List.of()),
        Arguments.of("Netflix", "DRAMA", List.of(f1), List.of(f1)),
        Arguments.of("Netflix", "COMEDIA", List.of(f1, s1), List.of()),
        Arguments.of("Netflix", "TERROR", List.of(f1, s1, f2, s2, f3, s3, f4, s4, f10, s10), List.of()),
        Arguments.of("Netflix", "ACAO", List.of(f1, s1, f2, s2, f3, s3, f4, s4, f10, s10), List.of(f4)),
        Arguments.of("Netflix", "DRAMA", List.of(f1, s1, f2, s2, f3, s3, f4, s4, f10, s10), List.of(f1, f2, f3, f10))
    );
  }
}
