//Exibir o maior dos dois n�meros...Criar um programa que recebe dois 
//valores e exibe qual � o maior entre eles

import java.util.Scanner;
public class MaiorMenor {
	public static void main(String [] args) {
		Scanner input = new Scanner (System.in);
		
		int primeiroNumero, segundoNumero;
		
		System.out.println("Informe o 1o n�mero: ");
		primeiroNumero = input.nextInt();
		System.out.println("Informe o 2o n�mero: ");
		segundoNumero = input.nextInt();
		
		if (primeiroNumero>segundoNumero) {
			System.out.println("O maior n�mero �: " +primeiroNumero);
			
		} else {
			System.out.println("O maior n�mero �: " +segundoNumero);
		
			input.close();
		}
	}
}

