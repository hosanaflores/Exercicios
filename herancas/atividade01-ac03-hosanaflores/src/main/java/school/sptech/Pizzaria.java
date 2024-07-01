package school.sptech;

import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Pizzaria {

    private String nome;
    private String telefone;

   private List<Pedido> pedidos;

    public Pizzaria(String nome, String telefone, List<Pedido> pedidos) {
        this.nome = nome;
        this.telefone = telefone;
        this.pedidos = new ArrayList<>();

    }

    public Pizzaria() {

    }

    public void adicionarPedido(Pedido pedido){
        pedidos.add(pedido);
    }

    public Integer qtdPedidos(Status status){
        Integer quantidadePorStatus = 0;
        for(Pedido pedidoDaVez : pedidos){
            if(pedidoDaVez.getStatus().equals(status)){
                quantidadePorStatus++;
            }
        }
        return quantidadePorStatus;
    }

    public Integer qtdPedidosDelivery(){
            Integer qtdPedidosDelivery = 0;
            for(Pedido pedidoDeliveryDaVez : pedidos){
                if(pedidoDeliveryDaVez instanceof PedidoDelivery){
                    qtdPedidosDelivery++;
                }
            }
            return qtdPedidosDelivery;
    }

    public Integer qtdUnidadesVendidas(Sabor sabor){
        Integer unidades = 0;
       for(Pedido pedidoDavez : pedidos){
           for (ItemPedido itemAtual : pedidoDavez.getItens()) {
               if(itemAtual.getSabor().equals(sabor)){
                   unidades += itemAtual.getQuantidade();
               }
           }
       }
        return unidades;
    }

    public Double calcularFaturamento(){
        Double faturamentoTotal = 0.0;
        for(Pedido pedidoDaDez : pedidos){
            if (pedidoDaDez.getStatus().equals(Status.CONCLUIDO)){
                faturamentoTotal += pedidoDaDez.calcularTotal();
            }
        }
        return faturamentoTotal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
