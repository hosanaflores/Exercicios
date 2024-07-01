package school.sptech;

import java.util.List;

public class ItemPedido {
    private Sabor sabor;
    private Integer quantidade;

    public ItemPedido(Sabor sabor, Integer quantidade) {
        this.sabor = sabor;
        this.quantidade = quantidade;
    }

    public ItemPedido() {
    }

    public Double calcularSubtotal(){
       return getSabor().getPreco() * getQuantidade();
    }

    public Sabor getSabor() {
        return sabor;
    }

    public void setSabor(Sabor sabor) {
        this.sabor = sabor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
