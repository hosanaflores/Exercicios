import java.util.Scanner;
public class ChuteNumeroFor {
	public static void main(String [] args) {
		Scanner in = new Scanner (System.in);
		
		int chute=0, numero=5;

			
		for (int i=1; chute!=numero; i++ ) {
		
			System.out.println("Digite um n�mero");
			chute = in.nextInt();
		
		if (chute>numero) {
			System.out.println("Voc� digitou ACIMA do esperado");
			
		} else if (chute<numero) {
			System.out.println("Voc� digitou ABAIXO do esperado"); 
		
		
		} else { 
			System.out.println("PARAB�NS, VOC� ACERTOU!!!!!");
				
			} 
	 }
	
  }

}
	

//Escreva um programa que, ao iniciar gere um valor aleat�rio de 1 a 10 
//e permite que o usu�rio chute um n�mero at� que o valor aleat�rio gerado 
//no in�cio do programa seja chutado corretamente. O programa deve informar
//caso o chute tenha sido acima, abaixo ou igual ao valor aleat�rio gerado 
//no in�cio do programa.

