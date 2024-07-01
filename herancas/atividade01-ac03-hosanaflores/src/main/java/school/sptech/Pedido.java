package school.sptech;

import org.w3c.dom.ls.LSException;

import javax.swing.table.TableCellEditor;
import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.List;

public abstract class Pedido {

    protected String cliente;
    protected Status status;

    protected List<ItemPedido> itens;

    public Pedido(String cliente, Status status) {
        this.cliente = cliente;
        this.status = status;
        this.itens = new ArrayList<>();
    }

    public Pedido() {
        this.itens = new ArrayList<>();
    }

    public abstract Double calcularTotal();

    public void adicionarItem(Sabor sabor, Integer quantidade){
        ItemPedido item = new ItemPedido(sabor, quantidade);
        itens.add(item);
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }
}
