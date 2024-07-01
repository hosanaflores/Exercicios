//leia um vetor A de 5 elementos, um vetor B com 5 elementos e calcule 
//e apresente o vetor C que será a soma de cada elemento de A com B


import java.util.Scanner;
	public class Vetor01 {
		public static void main(String args []) {
			Scanner in = new Scanner(System.in);
			
			final int TAM=5;
			int a[], b[], c[], i;
			a = new int [TAM];
			b = new int [TAM];
			c = new int [TAM];
			
			//Laço para a leitura do Vetor A:
			
			for(i=0; i<TAM; i++) {
				
				System.out.println("Digite o " +(i+1)+ " valor do vetor A: ");
				a[i] = in.nextInt();
				
			}
			
			//Laço para a leitura do Vetor B:
			
			for (i=0; i<TAM; i++) {
				
				System.out.println("Digite o " +(i+1)+ " valor do vetor B: ");
				b[i] = in.nextInt();
				
				//Fazendo a soma: 
				
				c[i] = a[i]+b[i];
				
			}
			    //Apresentando o vetor C:
			
			System.out.print("\nC = [ ");
			
			for (i=0; i<TAM; i++) {
				
				System.out.print(c[i]+ " ");
				
			}
			System.out.print("] ");
			
			in.close();
		}
	}