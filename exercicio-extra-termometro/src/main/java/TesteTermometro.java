public class TesteTermometro {
    public static void main(String[] args) {

        Termometro termometro01 = new Termometro();


        System.out.println(termometro01.aumentaTemperatura(5.0));
        System.out.println(termometro01.diminuiTemperatura(0.0));
        System.out.println("temperatura atual convertida: "+termometro01.exibeFahreinheit());
    }
}
