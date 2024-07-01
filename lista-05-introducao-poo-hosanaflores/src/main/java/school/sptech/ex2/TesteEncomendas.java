package school.sptech.ex2;

import java.security.spec.ECField;

public class TesteEncomendas {

  public static void main(String[] args) {

    Encomenda encomenda01 = new Encomenda();

    encomenda01.tamanho = "P";
    encomenda01.freteDoProduto = 20.0;
    encomenda01.valorProduto = 10.50;
    encomenda01.distancia = 50.55;
    encomenda01.enderecoDestinatario = "Rua Haddock Lobo";
    encomenda01.enderecoRemetente = "Avenida Paulista - MASP";

    System.out.println(encomenda01.calcularFrete());

    encomenda01.aplicarCupomDeDesconto(10);

    System.out.println(encomenda01.valorTotalDaEncomenda());

  }
}
