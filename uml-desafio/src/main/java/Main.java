public class Main {
    public static void main(String[] args) {

        Loja loja01 = new Loja("Lojas Americanas", 10);

        System.out.println(loja01);

        loja01.realizarVenda(50.0, 10.0);
        loja01.realizarVenda(50.0, 10.0);
        loja01.realizarVenda(50.0, 10.0);
        loja01.realizarVenda(50.0, 10.0);
        loja01.realizarVenda(50.0, 10.0);

        loja01.realizarVenda(50.0, 10.0);
        loja01.realizarVenda(50.0, 10.0);
        loja01.realizarVenda(50.0, 10.0);
        loja01.realizarVenda(50.0, 10.0);
        loja01.realizarVenda(50.0, 10.0);

        System.out.println(loja01);

    }
}
