//Criar um vetor A que leia 10 valores inteiros. 
//Calcule e apresente a média dos dez
//valores lidos.

import java.util.Scanner;
public class Vetor06 {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		final int TAM = 10; //Minha Constante Declarada
		int a[], b[], c[], i; //Indicando que precisa-se guardar um espaço dentro delas
	
		a = new int [TAM];
		b = new int [TAM]; //Indicando pra variavel que ela deve ter tamanho 10
		c = new int [TAM]; 
		
		//Laço para a leitura do Vetor A:
		
		for (i=0; i<TAM; i++) {
			//inicializador começa com 0
			//teste lógico = enquanto i for menor que TAM...
			//Acrescentar de 1 em 1.
			
			System.out.println("Digite o " +(i+1)+" valor do vetor A: ");
			a[i]= in.nextInt();
			
		}
		
		//Laço para a leitura do vetor B:
		
		for (i=0; i<TAM; i++) {
			
			System.out.println("Digite o " +(i+1)+" valor do vetor B: ");
			b[i] = in.nextInt();
			
			
			//Fazendo a multiplicação
			
			c[i] = (a[i]+b[i])/10;
			
		}
		
			//Apresentando o vetor C 
		
		System.out.printf("C = [ ");
		
		for (i=0; i<TAM; i++) {
			
			System.out.printf(c[i]+ " ");
		
		}
		
		System.out.printf(" ] ");
		
		in.close();
	}

}
//Está errado...