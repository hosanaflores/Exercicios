package ex01;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Bolo {
   private String sabor;
   private Double valor;
   private Integer quantidadeVendida;
   private Integer quantidadeEmEstoque;

    public Bolo (String sabor, Double valor, Integer quantidadeVendida, Integer quantidadeEmEstoque){
        this.sabor = sabor;
        this.valor = valor;
        this.quantidadeVendida = quantidadeVendida;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public Bolo(){

    }

    Integer venderBolo(Integer quantidadeDesejada){
        if(quantidadeDesejada >= 0 && quantidadeDesejada <= quantidadeEmEstoque -  quantidadeVendida){
            quantidadeVendida += quantidadeDesejada;
        }
        return quantidadeVendida;
    }

    Integer aumentarEstoque(Integer quantidadeAdicionadaEstoque){
        if(quantidadeAdicionadaEstoque > 0){
            quantidadeEmEstoque += quantidadeAdicionadaEstoque;
        }
        return  quantidadeEmEstoque;
    }

    Integer quantidadeDisponivel(){
        Integer unidadesDisponivel = quantidadeEmEstoque - quantidadeVendida;
        return unidadesDisponivel;
    }

    Double totalVendido(){
        Double quantidadeDinheiro  = quantidadeVendida * valor;
        return quantidadeDinheiro;
    }


    // MÉTODOS CORRETOS AGORA
    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(Integer quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

    public Integer getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(Integer quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
}
