package ex02;

import ex02.Encomenda;

public class TesteEncomenda {
    public static void main(String[] args) {

        Encomenda encomenda01 = new Encomenda("P", "Rua Haddock Lobo", "Avenida Paulista MASP",
                50.55, 10.50
                );


        encomenda01.calcularFrete();
        encomenda01.aplicarCupomDeDesconto(10);
        encomenda01.valorTotalDaEncomenda();

        System.out.println(encomenda01.getTamanho());
        System.out.println(encomenda01.getEnderecoRemetente());
        System.out.println(encomenda01.getEnderecoDestinatario());
        System.out.println(encomenda01.getDistancia());
        System.out.println(encomenda01.getValorProduto());
        System.out.println(encomenda01.getFreteDoProduto());


    }
}
