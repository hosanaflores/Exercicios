//Criar um vetor A que leia 10 valores inteiros. 
//Calcule e apresente a m�dia dos dez
//valores lidos.

import java.util.Scanner;
public class Vetor07 {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		final int TAM = 10; //Minha Constante Declarada
		int a[], b[], i; //Indicando que precisa-se guardar um espa�o dentro delas
	
		a = new int [TAM];
		b = new int [TAM];
		
		//La�o para a leitura do Vetor A:
		
		for (i=0; i<TAM; i++) {
			//inicializador come�a com 0
			//teste l�gico = enquanto i for menor que TAM...
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
		
		System.out.printf("M�DIA = [ ");
		for (i=0; i<TAM; i++) {
			
			a[i]= a[i]/2;
			
			System.out.printf(+a[i]+" ");
		}
		System.out.printf(" ]");
		in.close();
	}

}
