//Ler um vetor A de 10 posi��es de inteiro,
// ler um vetor B com 10 posi��es de inteiro
//e apresentar o um vetor C que ser� a soma de A com B

import java.util.Scanner;
public class Vetor03 {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		final int TAM=10; //Minha constante
		int a[], b[], c[], i; //Indicando que precisa-se guardar um espa�o dentro delas
		
		a = new int [TAM]; //Indicando pra variavel que ela deve ter tamanho 10
		b = new int [TAM];
		c = new int [TAM];
		
		//La�o para a leitura do Vetor A:
		
		for (i=0; i <TAM; i++) {
			
			System.out.println("Digite o " +(i+1)+ " valor do vetor A: ");
			a[i] = in.nextInt();
			
		}
		  //La�o para a leitura do vetor B:
		
		for (i=0; i<TAM; i++ ) {
			
			System.out.println("Digite o " +(i+1)+ " valor do vetor B: ");
			b[i] = in.nextInt();
			
			//Fazendo a soma
			
			c[i] = a[i]+b[i];
		}
		    
		    //Apresentando o vetor C
		
		System.out.print("C = [ ");
		
		for (i=0; i<TAM; i++) {
			
			System.out.printf(c[i]+ " ");
		}
		 
		System.out.print(" ]"); 
		
		in.close();
	}

}
//N�o entendi o que foi feito aqui