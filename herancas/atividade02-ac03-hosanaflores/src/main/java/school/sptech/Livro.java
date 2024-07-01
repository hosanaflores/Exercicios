package school.sptech;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;

public class Livro extends Produto{
    private String editora;
    private String autor;
    private Integer qtdPaginas;
    private Formato formato;

    public Livro(String editora, String autor, Integer qtdPaginas) {
        this.editora = editora;
        this.autor = autor;
        this.qtdPaginas = qtdPaginas;
    }

    public Livro() {
    }

    @Override
    public Double calcularPreco() {
        Double preco = 0.0;
        Double porcentagem = 0.0;
        Double precoAdicional = 0.0;
        Double precoFinal = 0.0;

         if(formato.equals(Formato.DIGITAL)){
             preco = qtdPaginas * 0.20;
             porcentagem = getRaridade().getAdicionalPorcentagem();
             precoAdicional = preco * porcentagem / 100.0;
             precoFinal = preco + precoAdicional;
         }else if(formato.equals(Formato.COMUM)){
                 preco = qtdPaginas * 0.30;
                 porcentagem = getRaridade().getAdicionalPorcentagem();
                 precoAdicional = preco * porcentagem / 100.0;
                 precoFinal = preco + precoAdicional;
         }else if(formato.equals(Formato.CAPA_DURA)){
             preco = qtdPaginas * 0.40;
             porcentagem = getRaridade().getAdicionalPorcentagem();
             precoAdicional = preco * porcentagem / 100.0;
             precoFinal = preco + precoAdicional;
     }
        return precoFinal;
    }


    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(Integer qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }
}
