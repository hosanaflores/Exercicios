import java.util.Scanner;
	public class NumeroPrimo{
		public static void main(String [] args) {
			
			Scanner in = new Scanner (System.in);
			int numeroPrimo;
			int numeroDivisores = 0;
			
			System.out.print("Digite um n�mero: ");
			numeroPrimo = in.nextInt();
			
			for (int i = 1; i <= numeroPrimo; i++) {
				if (numeroPrimo % i == 0) {
					numeroDivisores++;
				}
				
			}
			
			if (numeroDivisores == 2) {
				System.out.println("O n�mero digitado � primo!");
			} else {
				System.out.println("O n�mero digitado n�o � primo!");
			}
			in.close();
		}
	}