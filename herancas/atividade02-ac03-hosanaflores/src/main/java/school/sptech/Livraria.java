package school.sptech;

import org.w3c.dom.ls.LSProgressEvent;

import java.text.FieldPosition;
import java.util.ArrayList;
import java.util.List;

public class Livraria {

    private String nome;
    private List<Produto> produtos;
    private List<JogoTabuleiro> jogos;

    public Livraria(String nome) {
        this.nome = nome;
        this.produtos = new ArrayList<>();
    }

    public Livraria() {

    }


    public void adicionar (Produto produto){
        produtos.add(produto);
    }

    public void remover (String nome) {
        for (int i = produtos.size() - 1; i >= 0; i--) {
            if (produtos.get(i).getNome().equals(nome)) {
                produtos.remove(i);
            }
        }
    }

    public Double calcularTotalLivros(){
        // deve calcular o preço total de todos os livros da livraria.
        Double precoTotal = 0.0;
        for (Produto produtoDaVez : produtos){
            if(produtoDaVez instanceof Livro){
                precoTotal += produtoDaVez.calcularPreco();
            }
        }
        return precoTotal;
    }

    public List<Livro> buscarLivrosPorFormato(Formato formato){
        List<Livro> livrosPorFormato = new ArrayList<>();
        for(Produto produtoDaVez : produtos){
            if(produtoDaVez instanceof Livro){
               Livro livro = (Livro) produtoDaVez;
                if(livro.getFormato().equals(formato)){
                    livrosPorFormato.add(livro);
                }
            }
        }
        return livrosPorFormato;
    }

    public List<Produto> buscarPorRaridade(Raridade raridade){
        //deve retornar uma lista com os produtos que possuem a raridade passada como argumento.
        List<Produto> produtoRaridade = new ArrayList<>();
        for(Produto produtoDaVez : produtos){
            if(produtoDaVez.getRaridade().equals(raridade)){
                produtoRaridade.add(produtoDaVez);
            }
        }
        return produtoRaridade;
    }

    public Boolean existePorNome(String nome) {
        //deve retornar true se existir um produto com o nome passado como argumento.
        Boolean exists = false;
        for (Produto produtoDaVez : produtos) {
            if (produtoDaVez.getNome().equals(nome)) {
                exists = true;
            }
        }
        return exists;
    }

    public List<JogoTabuleiro> buscarPorQtdPecasMaior(Integer qtd){
        List<JogoTabuleiro> pecasMaiores = new ArrayList<>();
        for(Produto produtoDaVez : produtos){
            if(produtoDaVez instanceof JogoTabuleiro){
                JogoTabuleiro jogo = (JogoTabuleiro) produtoDaVez;
                if(jogo.getQtdPecas() > qtd){
                    pecasMaiores.add(jogo);
                }
            }
        }

        return pecasMaiores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
