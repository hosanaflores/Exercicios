//Criar um vetor A que leia 10 valores inteiros. 
//Calcule e apresente a média dos dez
//valores lidos.

import java.util.Scanner;
public class Vetor07 {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		final int TAM = 10; //Minha Constante Declarada
		int a[], b[], i; //Indicando que precisa-se guardar um espaço dentro delas
	
		a = new int [TAM];
		b = new int [TAM];
		
		//Laço para a leitura do Vetor A:
		
		for (i=0; i<TAM; i++) {
			//inicializador começa com 0
			//teste lógico = enquanto i for menor que TAM...
			//Acrescentar de 1 em 1.
			
			System.out.println("Digite o " +(i+1)+" valor do vetor A: ");
			a[i]= in.nextInt();
		    
		}
		
		System.out.printf("A = [ ");
			//Apresentando o vetor A 
		
		for (i=0; i<TAM; i++) {
			
			System.out.printf(a[i]+ " ");
			
		   
		}
		
		System.out.printf(" ] ");
		
		System.out.printf("MÉDIA = [ ");
		for (i=0; i<TAM; i++) {
			
			a[i]= a[i]/2;
			
			System.out.printf(+a[i]+" ");
		}
		System.out.printf(" ]");
		in.close();
	}

}
