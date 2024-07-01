import java.util.Scanner;
	public class PrincipalContaSimplificada {

		public static void main(String[] args) {
			
			Scanner in = new Scanner (System.in);
			ContaSimplificada cs = new ContaSimplificada();
			
			String nome;
			double saldo, limite;
			
			System.out.print("Digite seu nome:");
			cs.nomeCorrentista = in.nextLine();
			
			System.out.print("Digite o seu saldo:");
			cs.saldo = in.nextDouble();
			
			System.out.print("Digite o seu limite:");
			cs.limiteChequeEspecial = in.nextDouble();
			
			
			
			//MÉTODO DEPOSITAR//
			System.out.println("Digite o valor que deseja depositar: ");
			cs.depositaValor(in.nextDouble());
			System.out.println("O saldo atual é igual a R$: "+cs.exibirSaldo());
			
			//MÉTODO SACAR SEM RETORNO//
			System.out.println("Digite o valor que deseja sacar: ");
			cs.retiraValor(in.nextDouble());
			System.out.println("O saldo atual é igual a R$: "+cs.exibirSaldo());
			
			in.close();
		}
	}

