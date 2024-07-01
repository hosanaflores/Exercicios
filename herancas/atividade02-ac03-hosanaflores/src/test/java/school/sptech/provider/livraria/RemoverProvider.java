package school.sptech.provider.livraria;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import school.sptech.factory.JogoTabuleiroFactory;
import school.sptech.factory.LivroFactory;

import java.util.List;
import java.util.stream.Stream;

public class RemoverProvider implements ArgumentsProvider {

  @Override
  public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
    Object l1 = LivroFactory.build("O Senhor dos Anéis", "COMUM", "Martins Fontes", "J. R. R. Tolkien", 1200, "CAPA_DURA");
    Object l2 = LivroFactory.build("O Hobbit", "MUITO_RARO", "Martins Fontes", "J. R. R. Tolkien", 300, "COMUM");
    Object l3 = LivroFactory.build("O Silmarillion", "COMUM", "Martins Fontes", "J. R. R. Tolkien", 500, "COMUM");
    Object l4 = LivroFactory.build("O Código Da Vinci", "COMUM", "Arqueiro", "Dan Brown", 400, "COMUM");
    Object l5 = LivroFactory.build("Anjos e Demônios", "COMUM", "Arqueiro", "Dan Brown", 350, "COMUM");
    Object l6 = LivroFactory.build("Fortaleza Digital", "COMUM", "Arqueiro", "Dan Brown", 300, "COMUM");
    Object l7 = LivroFactory.build("Ponto de Impacto", "COMUM", "Arqueiro", "Dan Brown", 250, "COMUM");
    Object l8 = LivroFactory.build("O Símbolo Perdido", "COMUM", "Arqueiro", "Dan Brown", 300, "COMUM");
    Object l9 = LivroFactory.build("Inferno", "RARO", "Arqueiro", "Dan Brown", 350, "DIGITAL");
    Object l10 = LivroFactory.build("Origem", "RARO", "Arqueiro", "Dan Brown", 400, "DIGITAL");
    Object l11 = LivroFactory.build("O Cemitério", "RARO", "Suma", "Stephen King", 400, "DIGITAL");
    Object l12 = LivroFactory.build("It: A Coisa", "RARO", "Suma", "Stephen King", 500, "CAPA_DURA");
    Object l13 = LivroFactory.build("O Iluminado", "COMUM", "Suma", "Stephen King", 400, "CAPA_DURA");
    Object l14 = LivroFactory.build("Doutor Sono", "COMUM", "Suma", "Stephen King", 350, "DIGITAL");
    Object l15 = LivroFactory.build("A Dança da Morte", "MUITO_RARO", "Suma", "Stephen King", 500, "DIGITAL");
    Object l16 = LivroFactory.build("Cujo", "MUITO_RARO", "Suma", "Stephen King", 300, "DIGITAL");

    Object j1 = JogoTabuleiroFactory.build("War", "COMUM", 100);
    Object j2 = JogoTabuleiroFactory.build("Banco Imobiliário", "COMUM", 50);
    Object j3 = JogoTabuleiroFactory.build("Detetive", "COMUM", 80);
    Object j4 = JogoTabuleiroFactory.build("Jogo da Vida", "RARO", 60);
    Object j5 = JogoTabuleiroFactory.build("Cara a Cara", "RARO", 40);
    Object j6 = JogoTabuleiroFactory.build("Imagem & Ação", "RARO", 70);
    Object j7 = JogoTabuleiroFactory.build("Jogo da Mesada", "MUITO_RARO", 30);
    Object j8 = JogoTabuleiroFactory.build("Jogo da Forca", "MUITO_RARO", 20);
    Object j9 = JogoTabuleiroFactory.build("Jogo da Velha", "MUITO_RARO", 10);
    Object j10 = JogoTabuleiroFactory.build("Batalha Naval", "MUITO_RARO", 90);

    return Stream.of(
        Arguments.of("Livraria SPTech", List.of(), "O Senhor dos Anéis", List.of()),
        Arguments.of("Livraria SPTech", List.of(l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16), "O Senhor dos Anéis", List.of(l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16)),
        Arguments.of("Livraria SPTech", List.of(l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16), "O Hobbit", List.of(l1, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16)),
        Arguments.of("Livraria SPTech", List.of(l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16), "O Silmarillion", List.of(l1, l2, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16)),
        Arguments.of("Livraria SPTech", List.of(l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16), "O Código Da Vinci", List.of(l1, l2, l3, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16)),
        Arguments.of("Livraria SPTech", List.of(l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16), "Anjos e Demônios", List.of(l1, l2, l3, l4, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16))
    );
  }
}
