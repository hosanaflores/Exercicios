//Criar um programa que leia um vetor A com 10 posições de inteiro 
//e imprima na tela um vetor b sendo que cada elemento de B seja 
//o quadrado de A

import java.util.Scanner;
	public class Vetor02 {
		public static void main(String args []) {
			Scanner in = new Scanner(System.in);
			
			final int TAM=10;
			int a[], b[], i;
			a = new int [TAM];
			b = new int [TAM];
		
			
			//Laço para a leitura do Vetor A:
			
			for(i=0; i<TAM; i++) {
				
				System.out.println("Digite o " +(i+1)+ " valor do vetor A: ");
				a[i] = in.nextInt();
				
				
			}
			    //Apresentando o vetor B:
			
			System.out.print("\nB = [");
			
			for (i=0; i<TAM; i++) {
				
				b[i] = a[i]*a[i];
				
				System.out.print(b[i]+ " ");
				
				
			}
			System.out.print("] ");
			
			in.close();
		}
	}