import java.util.Scanner;
public class ChuteNumeroDo {
	public static void main(String [] args) {
		Scanner in = new Scanner (System.in);
		
		int i=1, chute=0, numero=5;

			
		do {
		
			System.out.println("Digite um número");
			chute = in.nextInt();
			
		if (chute==numero) {
			System.out.println("PARABÉNS, VOCÊ ACERTOU :) !!!!");
			
			
		} else if (chute<numero) {
			System.out.println("Você digitou ABAIXO do esperado"); 
		
		
		} else { 
			System.out.println("Você chutou ACIMA do esperado");
				i++;
			} 
	  } while (chute!=numero);
	
   }
	
}

//Escreva um programa que, ao iniciar gere um valor aleatório de 1 a 10 
//e permite que o usuário chute um número até que o valor aleatório gerado 
//no início do programa seja chutado corretamente. O programa deve informar
//caso o chute tenha sido acima, abaixo ou igual ao valor aleatório gerado 
//no início do programa.

