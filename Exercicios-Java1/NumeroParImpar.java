import java.util.Scanner;
	public class NumeroParImpar{
		public static void main(String [] args) {
			Scanner in = new Scanner (System.in);
			
			int numero;
			System.out.print("Digite um número: ");
			numero = in.nextInt();
			
			if (numero % 2 == 0) {
				System.out.println("O número "+numero+" é PAR!");
			} else {
				System.out.println("O número "+numero+" é ÍMPAR!");
			}
			
			in.close();
		}
	}