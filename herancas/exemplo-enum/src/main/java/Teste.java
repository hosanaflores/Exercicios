import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNl = new Scanner(System.in);

        System.out.println("Bem vindo a NutriTech!");

        System.out.println("Digite seu nome: ");
        String nomeDigitado = leitorNl.nextLine();

        System.out.println("Digite a sua altura: ");
        Double alturaDigitada = leitor.nextDouble();

        System.out.println("Digite o peso: ");
        Double pesoDigitado = leitor.nextDouble();

        System.out.println("Digite seu plano escolhido: (Bronze, Prata ou Ouro): ");
        String planoDigitado = leitorNl.nextLine();

        Plano planoEscolhido = null;
        for (Plano planoDaVez : Plano.values()){ // da para fazer um while
            if (planoDaVez.getTitulo().equals(planoDigitado)){
                planoEscolhido = planoDaVez;
            }
        }

        if(planoEscolhido == null){
            System.out.println("Plano não existente! Digite Bronze, Prata ou Ouro!");
        }else{
            Cliente cliente = new Cliente(nomeDigitado, alturaDigitada, pesoDigitado, planoEscolhido);

            System.out.println("Cadastro efetuado");
            System.out.println(cliente);
        }
    }
}
