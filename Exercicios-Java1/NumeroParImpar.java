import java.util.Scanner;
	public class NumeroParImpar{
		public static void main(String [] args) {
			Scanner in = new Scanner (System.in);
			
			int numero;
			System.out.print("Digite um n�mero: ");
			numero = in.nextInt();
			
			if (numero % 2 == 0) {
				System.out.println("O n�mero "+numero+" � PAR!");
			} else {
				System.out.println("O n�mero "+numero+" � �MPAR!");
			}
			
			in.close();
		}
	}