import java.util.Scanner;
public class NeutroPositivoNegativo {
	public static void main(String [] args) {
		Scanner in = new Scanner (System.in);
		
		double numero;
		
		System.out.println("Informe um número: ");
		numero = in.nextDouble();
		
		if(numero == 0 ) {
			System.out.println("O número informado é neutro!");
		}else if(numero > 0) {
			System.out.println("O número informado é positivo!");
		}else {
			System.out.println("O número informado é negativo!");
		}
		
		in.close();
	}

}

//Criar um programa que leia um número e informe se o mesmo é neutro (zero),
//positivo ou negativo.