//Criar um vetor A que leia 10 posições de inteiro.
// Imprimir um vetor B que será o vetor A invertido 
//(ou seja a ultima posição de A será a 1ª de B, a penúltima de A
//será a 2ª de B e assim sucessivamente)

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


//Está correto (prof video)