import java.util.Scanner;
public class ChuteNumeroDo {
	public static void main(String [] args) {
		Scanner in = new Scanner (System.in);
		
		int i=1, chute=0, numero=5;

			
		do {
		
			System.out.println("Digite um n�mero");
			chute = in.nextInt();
			
		if (chute==numero) {
			System.out.println("PARAB�NS, VOC� ACERTOU :) !!!!");
			
			
		} else if (chute<numero) {
			System.out.println("Voc� digitou ABAIXO do esperado"); 
		
		
		} else { 
			System.out.println("Voc� chutou ACIMA do esperado");
				i++;
			} 
	  } while (chute!=numero);
	
   }
	
}

//Escreva um programa que, ao iniciar gere um valor aleat�rio de 1 a 10 
//e permite que o usu�rio chute um n�mero at� que o valor aleat�rio gerado 
//no in�cio do programa seja chutado corretamente. O programa deve informar
//caso o chute tenha sido acima, abaixo ou igual ao valor aleat�rio gerado 
//no in�cio do programa.

