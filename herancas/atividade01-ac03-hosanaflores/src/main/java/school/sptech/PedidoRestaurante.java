package school.sptech;

public class PedidoRestaurante extends Pedido{

    private Double gorjeta;
    private Boolean mesaEspecial;

    public PedidoRestaurante(Double gorjeta, Boolean mesaEspecial) {
        this.gorjeta = gorjeta;
        this.mesaEspecial = mesaEspecial;
    }

    public PedidoRestaurante() {
    }


    //  calcularTotal:
    // calcula o total do pedido com base nos itens adicionados mais gorjeta.
    // caso o pedido inclua a mesa especial adicione mais R$ 20,00 ao total do pedido.
    @Override
    public Double calcularTotal() {
        Double valorItensAddGorjeta = 0.0;
        for(ItemPedido itemPedidoDaVez : itens){
            valorItensAddGorjeta += itemPedidoDaVez.getSabor().getPreco() * itemPedidoDaVez.getQuantidade();
        }
        if(mesaEspecial.equals(true)){
            return valorItensAddGorjeta + 20.0 + getGorjeta();
        }
      return valorItensAddGorjeta + getGorjeta();
    }

    public Double getGorjeta() {
        return gorjeta;
    }

    public void setGorjeta(Double gorjeta) {
        this.gorjeta = gorjeta;
    }

    public Boolean getMesaEspecial() {
        return mesaEspecial;
    }

    public void setMesaEspecial(Boolean mesaEspecial) {
        this.mesaEspecial = mesaEspecial;
    }
}
