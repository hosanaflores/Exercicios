package school.sptech.ex1;

public class Bolo {

    String sabor;
    Double valor;
    Integer quantidadeVendida;
    Integer quantidadeEmEstoque;

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
}
