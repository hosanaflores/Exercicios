//Criar um vetor A que leia 10 posi��es de inteiro.
// Imprimir um vetor B que ser� o vetor A invertido 
//(ou seja a ultima posi��o de A ser� a 1� de B, a pen�ltima de A
//ser� a 2� de B e assim sucessivamente)

import java.util.Scanner;
public class Vetor05 {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		final int TAM=10;
		int a[], b[], i , j;
		
		a = new int[TAM];
		b = new int[TAM];
		j = 9;
		for (i=0; i<TAM; i++) {
			
			System.out.println("Digite o " +(i+1)+ " valor do vetor A: ");
			
			a[i] = in.nextInt();
			b[j] = a[i];
			 
		}
		
		System.out.print(" \n Vetor A = [ ");
		
		for (i=0; i<TAM; i++) {
			System.out.print(a[i]+ " ");
			
			
		}
		
		System.out.print(" ] ");
		
		System.out.print("\n Vetor B = [ ");
		
		for (i=0; i<TAM; i++) {
			System.out.print(b[i]+ " ");
			
			
		}
		System.out.print(" ] ");
		in.close();
	}
	
}     


//Est� correto (prof video)