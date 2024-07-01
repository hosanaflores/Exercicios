import java.util.Scanner;
	public class FibonacciFor {
		public static void main(String [] args) {
			
			Scanner in = new Scanner(System.in);
			
			int numero, i, proximo, anterior = 0, atual = 1;
			
			//O número de termos é informado pelo usuário
			System.out.println("Informe o número de termos: "); //Exibição da mensagem 
			
			numero = in.nextInt(); //Guardando o número que o usuário digitou.
			
			for (i=1; i<=numero; i++) {
				
				System.out.printf(atual+ " ");
				
				proximo = anterior + atual;
				anterior = atual;
				atual = proximo;
				
				in.close();
			}	
			
		}
}
