import java.util.Scanner;
	public class Fibonacci {
		public static void main(String[] args) {
			Scanner ler = new Scanner (System.in);
			int atual = 1, anterior = 0, i = 1, numero, proximo;
			
			
			System.out.println("Digite um número: ");
			numero = ler.nextInt();
			
			do {
				System.out.println(atual+ " ");
				proximo = anterior+atual;
				anterior = atual;
				atual = proximo;
			    i++;
			    
			}while (i <= numero);
		
			i++;
			ler.close();
		}
		
	}
	