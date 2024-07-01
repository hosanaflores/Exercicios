//Eu inventei

import java.util.Scanner;
public class Matriz04 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int a[][], b[][], c[][], d[][], numero, anterior = 0,  linha, coluna;
		a = new int [4][4];
		b = new int [4][4];
		c = new int [4][4];
		d = new int [4][4];
	
	
		System.out.println("Entre com o valor");
		numero =  in.nextInt();
		
		//Fazendo a leitura dos valores da matriz a 
		for(linha=0; linha<4; linha++) { //Controlando a LINHA da matriz 
			for (coluna =0; coluna<4; coluna++) { //Controlando a COLUNA 
                
				a[linha][coluna] = anterior + numero;		
				anterior  = numero;
				numero = a[linha][coluna];
			}		
			
		}
		
		// fazendo a apresentação da matriz 
		
		for (linha=0; linha<4; linha++) {
			System.out.println();
			for (coluna=0; coluna<4; coluna++) {
				System.out.print(a[linha][coluna] +" ");
			}
		}
	}

}

