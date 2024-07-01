package ex01;

import ex01.Bolo;

public class TesteConfeitaria {

    public static void main(String[] args) {

        Bolo bolo01 = new Bolo("Morango", 30.0, 2, 4);

            //Vou mudar isso
           // bolo01.sabor = "Morango";
          //bolo01.valor = 10.0;
         // bolo01.quantidadeVendida = 5;
        // bolo01.quantidadeEmEstoque = 50;

        System.out.println(bolo01.venderBolo(4));
        System.out.println(bolo01.aumentarEstoque(4));

        System.out.println(bolo01.quantidadeDisponivel());
        System.out.println(bolo01.totalVendido());

        //Apresentando
        System.out.println("Sabor do bolo: "+ bolo01.getSabor());
        System.out.println("Valor: "+bolo01.getValor());
        System.out.println("Quantidade vendida: "+bolo01.getQuantidadeVendida());
        System.out.println("Quantidade em Estoque: "+bolo01.getQuantidadeEmEstoque());




    }

}
