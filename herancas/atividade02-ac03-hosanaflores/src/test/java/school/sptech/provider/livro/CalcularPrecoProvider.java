package school.sptech.provider.livro;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class CalcularPrecoProvider implements ArgumentsProvider {

  @Override
  public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
    return Stream.of(
        Arguments.of("O Senhor dos Anéis", "COMUM", "Martins Fontes", "J. R. R. Tolkien", 1200, "CAPA_DURA", 480.0),
        Arguments.of("O Hobbit", "MUITO_RARO", "Martins Fontes", "J. R. R. Tolkien", 300, "COMUM", 108.0),
        Arguments.of("O Silmarillion", "COMUM", "Martins Fontes", "J. R. R. Tolkien", 500, "COMUM", 150.0),
        Arguments.of("O Código Da Vinci", "COMUM", "Arqueiro", "Dan Brown", 400, "COMUM", 120.0),
        Arguments.of("Anjos e Demônios", "COMUM", "Arqueiro", "Dan Brown", 350, "COMUM", 105.0),
        Arguments.of("Fortaleza Digital", "COMUM", "Arqueiro", "Dan Brown", 300, "COMUM", 90.0),
        Arguments.of("Ponto de Impacto", "COMUM", "Arqueiro", "Dan Brown", 250, "COMUM", 75.0),
        Arguments.of("O Símbolo Perdido", "COMUM", "Arqueiro", "Dan Brown", 300, "COMUM", 90.0),
        Arguments.of("Inferno", "RARO", "Arqueiro", "Dan Brown", 350, "DIGITAL", 77.0),
        Arguments.of("Origem", "RARO", "Arqueiro", "Dan Brown", 400, "DIGITAL", 88.0),
        Arguments.of("O Cemitério", "RARO", "Suma", "Stephen King", 400, "DIGITAL", 88.0),
        Arguments.of("It: A Coisa", "RARO", "Suma", "Stephen King", 500, "CAPA_DURA", 220.0),
        Arguments.of("O Iluminado", "COMUM", "Suma", "Stephen King", 400, "CAPA_DURA", 160.0),
        Arguments.of("Doutor Sono", "COMUM", "Suma", "Stephen King", 350, "DIGITAL", 70.0),
        Arguments.of("A Dança da Morte", "MUITO_RARO", "Suma", "Stephen King", 500, "DIGITAL", 120.0),
        Arguments.of("Cujo", "MUITO_RARO", "Suma", "Stephen King", 300, "DIGITAL", 72.0)
    );
  }
}
