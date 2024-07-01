package school.sptech.ex1;

public class TesteConfeitaria {

  public static void main(String[] args) {

    Bolo bolo01 = new Bolo();

    bolo01.sabor = "Morango";
    bolo01.valor = 10.0;
    bolo01.quantidadeVendida = 5;
    bolo01.quantidadeEmEstoque = 50;

    System.out.println(bolo01.venderBolo(5));
    System.out.println(bolo01.aumentarEstoque(25));

    System.out.println(bolo01.quantidadeDisponivel());
    System.out.println(bolo01.totalVendido());

  }
}
