import java.util.Scanner; //Fazer leitura 
	public class FibonacciWhile { //Classe
		public static void main (String [] args) { //m�todo main
			Scanner in = new Scanner(System.in); //Objeto da leitura
			
			int i=1, numero, anterior=0, atual=1, proximo; //Variaveis declaradas
			
			System.out.println("Informe o n�mero de termos: "); //Exibi��o no display
			numero = in.nextInt(); //Guardando o n�mero que o usu�rio digitou
			
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
