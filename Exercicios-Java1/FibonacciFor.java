import java.util.Scanner;
	public class FibonacciFor {
		public static void main(String [] args) {
			
			Scanner in = new Scanner(System.in);
			
			int numero, i, proximo, anterior = 0, atual = 1;
			
			//O n�mero de termos � informado pelo usu�rio
			System.out.println("Informe o n�mero de termos: "); //Exibi��o da mensagem 
			
			numero = in.nextInt(); //Guardando o n�mero que o usu�rio digitou.
			
			for (i=1; i<=numero; i++) {
				
				System.out.printf(atual+ " ");
				
				proximo = anterior + atual;
				anterior = atual;
				atual = proximo;
				
				in.close();
			}	
			
		}
}
