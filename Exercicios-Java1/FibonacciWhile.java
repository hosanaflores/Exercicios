import java.util.Scanner; //Fazer leitura 
	public class FibonacciWhile { //Classe
		public static void main (String [] args) { //método main
			Scanner in = new Scanner(System.in); //Objeto da leitura
			
			int i=1, numero, anterior=0, atual=1, proximo; //Variaveis declaradas
			
			System.out.println("Informe o número de termos: "); //Exibição no display
			numero = in.nextInt(); //Guardando o número que o usuário digitou
			
			while (i<=numero) { //Enquanto i <= numero...

				System.out.printf(atual+ " "); //Mostrando resultado
				
				proximo = anterior+atual; // 
				anterior = atual; //  
				atual = proximo; //  
				i++;
			
				in.close();
			}
			
			
		}
		
}
