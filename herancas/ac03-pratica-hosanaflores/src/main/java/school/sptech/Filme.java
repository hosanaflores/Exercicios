package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Filme extends Midia{
    private String diretor;
    private Integer duracao;
    private Integer duracaoCreditos;

    public Filme(String diretor, Integer duracao, Integer duracaoCreditos) {
        this.diretor = diretor;
        this.duracao = duracao;
        this.duracaoCreditos = duracaoCreditos;
    }

    public Filme() {
    }

    @Override
    public Integer calcularDuracaoTotal() {
        return duracao + duracaoCreditos;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public Integer getDuracaoCreditos() {
        return duracaoCreditos;
    }

    public void setDuracaoCreditos(Integer duracaoCreditos) {
        this.duracaoCreditos = duracaoCreditos;
    }
}
