//Matriz da minha cabeça...

import java.util.Scanner;
public class Matriz03 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int a [][], linha, coluna;
		a = new int [4][4];
		
		//Fazendo a leitura dos valores da matriz a 
		
		for(linha=0; linha<4; linha++) { //Controlando a LINHA da matriz 
			for (coluna =0; coluna<4; coluna++) { //Controlando a COLUNA 
				System.out.println("Entre com o valor da coluna "+coluna+" linha "+linha);
				a[linha][coluna] =  in.nextInt();
				a[linha][coluna] = a[linha][coluna]*a[linha][coluna];
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
