//Criar uma matriz 4x4 de inteiros sendo que cada elemento da matriz será
//preenchido com o dobro do elemento anterior (o elemento[0][0] será o 2).

import java.util.Scanner;
public class Matriz05 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int proximo[][], numero, anterior = 2,  linha, coluna;
		proximo = new int [4][4];	
	
		System.out.println("Entre com o valor");
		numero =  in.nextInt();
		
		//Fazendo a leitura dos valores da matriz a 
		for(linha=0; linha<4; linha++) { //Controlando a LINHA da matriz 
			for (coluna =0; coluna<4; coluna++) { //Controlando a COLUNA 
                
				proximo[linha][coluna] =  numero*2;	
				anterior  = numero;
				numero = proximo[linha][coluna];
				
			}		
			
		}
		
		// fazendo a apresentação da matriz 
		
		for (linha=0; linha<4; linha++) {
			System.out.println();
			for (coluna=0; coluna<4; coluna++) {
				System.out.print(proximo[linha][coluna]+" ");
			}
		}
	}
}
