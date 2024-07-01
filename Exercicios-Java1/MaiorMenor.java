//Exibir o maior dos dois números...Criar um programa que recebe dois 
//valores e exibe qual é o maior entre eles

import java.util.Scanner;
public class MaiorMenor {
	public static void main(String [] args) {
		Scanner input = new Scanner (System.in);
		
		int primeiroNumero, segundoNumero;
		
		System.out.println("Informe o 1o número: ");
		primeiroNumero = input.nextInt();
		System.out.println("Informe o 2o número: ");
		segundoNumero = input.nextInt();
		
		if (primeiroNumero>segundoNumero) {
			System.out.println("O maior número é: " +primeiroNumero);
			
		} else {
			System.out.println("O maior número é: " +segundoNumero);
		
			input.close();
		}
	}
}

