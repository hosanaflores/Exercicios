import java.util.Scanner;
public class ChuteNumeroFor {
	public static void main(String [] args) {
		Scanner in = new Scanner (System.in);
		
		int chute=0, numero=5;

			
		for (int i=1; chute!=numero; i++ ) {
		
			System.out.println("Digite um número");
			chute = in.nextInt();
		
		if (chute>numero) {
			System.out.println("Você digitou ACIMA do esperado");
			
		} else if (chute<numero) {
			System.out.println("Você digitou ABAIXO do esperado"); 
		
		
		} else { 
			System.out.println("PARABÉNS, VOCÊ ACERTOU!!!!!");
				
			} 
	 }
	
  }

}
	

//Escreva um programa que, ao iniciar gere um valor aleatório de 1 a 10 
//e permite que o usuário chute um número até que o valor aleatório gerado 
//no início do programa seja chutado corretamente. O programa deve informar
//caso o chute tenha sido acima, abaixo ou igual ao valor aleatório gerado 
//no início do programa.

