//Criar um vetor A que leia 10 posi��es de inteiro.
// Imprimir um vetor B que ser� o vetor A invertido 
//(ou seja a ultima posi��o de A ser� a 1� de B, a pen�ltima 
//de A ser� a 2� de B e assim sucessivamente)

import java.util.Scanner;
public class Vetor04 {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		final int TAM=10;
		int a[], b[], i;
		a = new int [TAM];
		b = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			
			System.out.println("Digite o " +(i+1)+ " valor do vetor A: ");
			a[i] = in.nextInt();
		}
		
		System.out.printf("B = [ ");
		
		for (i=0; i<TAM; i--) {
			
			b[i]= a[i];
			
		
			System.out.printf(b[i]+ " ");
			
		}
		
		System.out.println("]");
		 
		in.close();
	}

}
//C�digo que eu estava tentando invers�o...(errado)