//import java.util.Scanner;
//import java.util.Scanner;
//public class Antigo {
//
//        public static void main(String[] args) {
//
//            Scanner in = new Scanner(System.in);
//            Integer escolha;
//            Double valorSaque;
//            Double valorDeposito  = 0.0;
//            Double saldoAtual = 0.0;
//            Double saldoRendimentos;
//
//            do {
//                System.out.println("SPTech Investimentos\n" +
//                        "Olá, o que deseja fazer: ");
//
//                System.out.println(" 1 - Depositar\n" +
//                        " 2 - Sacar\n" +
//                        " 3 - Simular rendimentos\n" +
//                        " 0 - Sair");
//
//                escolha = in.nextInt();
//
//                if(escolha.equals(1) ) { // Depositar
//                    System.out.println("Digite o valor do depósito");
//                    valorDeposito = in.nextDouble();
//                    if (valorDeposito > 0) {
//                        saldoAtual += valorDeposito;
//                        System.out.println("Depósito realizado! Saldo atual: " + saldoAtual);
//                    } else {
//                        System.out.println("valor inválido");
//                    }
//                }
//
//                if(escolha.equals(2)) {
//                    System.out.println("Informe o valor que deseja retirar");
//                    valorSaque = in.nextDouble();
//                    if (valorSaque > 0 && saldoAtual >= valorSaque) {
//                        saldoAtual -= valorSaque;
//                        System.out.println("Saque realizado!\n Seu saldo atual é de : " + saldoAtual);
//
//                    } else {
//                        System.out.println("valor inválido");
//                    }
//
//                }
//
//                if(escolha.equals(3)){
//                    System.out.println("Saldo atual: "+saldoAtual);
//                    double valor;
//                    saldoRendimentos = saldoAtual;
//
//                    if(saldoAtual != 0){
//                        for (int i = 0; i < 12; i++) {
//                            valor = saldoRendimentos * 10.0 / 100.0;
//                            saldoRendimentos+=valor;
//                            System.out.println(saldoRendimentos);
//                        }
//                    }else{
//                        System.out.println("Saldo Zerado, opção inválida.");
//                    }
//
//                }
//
//
//            }while(escolha != 0);
//
//        }
//    }