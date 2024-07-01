import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        OperacoesBancarias operacoesBancarias01 = new OperacoesBancarias();
        ContaBancaria contaBancaria01 = new ContaBancaria();

        ContaPoupanca contapoupanca01 = new ContaPoupanca(); //criei para utilizar herança
        ContaCorrente contacorrente01 = new ContaCorrente(); //criei para utilizar herança

        Scanner in = new Scanner(System.in);
        Integer escolha = 0;

        System.out.println("Informe qual conta deseja realizar operações bancárias: \n Digite 7 para Conta Poupança ou 9 para Conta Corrente");
        Integer escolhaConta;
        escolhaConta = in.nextInt();


        do {
            if (escolhaConta.equals(7)) {
                System.out.println("SPTech Investimentos\n" +
                        "Olá, o que deseja fazer: ");

                System.out.println(" 1 - Depositar\n" +
                        " 2 - Sacar\n" +
                        " 3 - Simular rendimentos\n" +
                        " 4-  Reservar na Poupança \n" +
                        " 0 - Sair");

                escolha = in.nextInt();

                if (escolha.equals(1)) { // Depositar
                    System.out.println("Digite o valor do depósito");
                    operacoesBancarias01.setValorDeposito(in.nextDouble());
                    contapoupanca01.Depositar(operacoesBancarias01.getValorDeposito());
                }

                 else if (escolha.equals(2)) { // Sacar
                    System.out.println("Informe o valor que deseja retirar");
                    operacoesBancarias01.setValorSaque(in.nextDouble());
                    contapoupanca01.Sacar(operacoesBancarias01.getValorSaque());
                }

                else  if (escolha.equals(3)) { // Rendimento
                    System.out.println("Saldo atual: " + contaBancaria01.getSaldoAtual());
                    contapoupanca01.Render();
                }

               else if (escolha.equals(4)){
                    System.out.println("Informe quanto você deseja reservar na sua Conta Poupança: ");
                    contapoupanca01.reservarDinheiro(in.nextDouble());
                    System.out.println("Você reservou: "+contapoupanca01.getReservaMonetaria());
                }


            } else if (escolhaConta.equals(9)) {
                System.out.println("SPTech Investimentos\n" +
                        "Olá, o que deseja fazer: ");

                System.out.println(" 1 - Depositar\n" +
                        " 2 - Sacar\n" +
                        " 3 - Simular rendimentos\n" +
                        " 4 - Pedir Limite de crédito\n" +
                        " 0 - Sair");

                escolha = in.nextInt();

                if (escolha.equals(1)) { // Depositar
                    System.out.println("Digite o valor do depósito");
                    operacoesBancarias01.setValorDeposito(in.nextDouble());
                    contacorrente01.Depositar(operacoesBancarias01.getValorDeposito());
                }

               else if (escolha.equals(2)) { // Sacar
                    System.out.println("Informe o valor que deseja retirar");
                    operacoesBancarias01.setValorSaque(in.nextDouble());
                    contacorrente01.Sacar(operacoesBancarias01.getValorSaque());
                }

              else  if (escolha.equals(3)) { // Rendimento
                    System.out.println("Saldo atual: " + contaBancaria01.getSaldoAtual());
                    contacorrente01.Render();
                }
              else if (escolha.equals(4)){
                    System.out.println("Qual limite você deseja ter: ");
                    Double limite;
                    limite = in.nextDouble();
                    contacorrente01.aumentarLimite(limite);
                }
            }

            } while (escolha != 0) ;
    }
}