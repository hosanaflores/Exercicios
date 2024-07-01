package school.sptech;

import java.util.ArrayList;
import java.util.List;

public abstract class Produto {

    private String nome;
    private Raridade raridade;

    public Produto(String nome) {
        this.nome = nome;
    }

    public Produto() {
    }

    public abstract Double calcularPreco();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Raridade getRaridade() {
        return raridade;
    }

    public void setRaridade(Raridade raridade) {
        this.raridade = raridade;
    }
}
