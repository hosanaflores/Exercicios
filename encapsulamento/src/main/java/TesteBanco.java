public class TesteBanco {
    public static void main(String[] args) {

        ContaBancaria conta01 = new ContaBancaria("Bob", "0123"); // instanciar é a mesma coisa que criar... é realizado quando utilizo o new
        //Construtor é chamado sempre na instancia

        ContaBancaria conta02 = new ContaBancaria();

        conta01.sacar(10.5);

       // System.out.println("Saldo conta 01: " + conta01.saldo);


    }
}
