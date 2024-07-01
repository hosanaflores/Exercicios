package school.sptech;

public class PedidoDelivery extends Pedido{

    private Double distanciaKm;

    public PedidoDelivery(Double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public PedidoDelivery() {
    }

    //calcularTotal:
    //calcula o total do pedido com base nos itens adicionados mais frete.
    //retorna o valor total do pedido.
    @Override
    public Double calcularTotal() {
        Double valorItensAdd = 0.0;
        for(ItemPedido itemPedidoDaVez : itens){
           valorItensAdd += itemPedidoDaVez.getSabor().getPreco() * itemPedidoDaVez.getQuantidade();
        }
      return valorItensAdd + calcularFrete();
    }

    public Double calcularFrete(){
        Double valorFrete;
        if(distanciaKm < 5){
            valorFrete = 5.00;
        }else if(distanciaKm >= 5 && distanciaKm < 10){
            valorFrete = 7.00;
        }else{
            valorFrete = 10.00;
        }
        return valorFrete;
    }


    public Double getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(Double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }


}
