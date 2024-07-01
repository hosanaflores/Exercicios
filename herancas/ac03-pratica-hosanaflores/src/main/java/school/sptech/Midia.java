package school.sptech;

import java.util.ArrayList;
import java.util.List;

public abstract class Midia {
    protected String nome;
    protected Double nota;
    protected Integer classificacaoEtaria;
   protected Genero genero;
    public Midia(String nome, Double nota, Integer classificacaoEtaria) {
        this.nome = nome;
        this.nota = nota;
        this.classificacaoEtaria = classificacaoEtaria;
    }

    public Midia() {

    }

    public abstract Integer calcularDuracaoTotal();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Integer getClassificacaoEtaria() {
        return classificacaoEtaria;
    }

    public void setClassificacaoEtaria(Integer classificacaoEtaria) {
        this.classificacaoEtaria = classificacaoEtaria;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
