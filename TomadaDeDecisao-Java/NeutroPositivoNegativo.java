import java.util.Scanner;
public class NeutroPositivoNegativo {
	public static void main(String [] args) {
		Scanner in = new Scanner (System.in);
		
		double numero;
		
		System.out.println("Informe um n�mero: ");
		numero = in.nextDouble();
		
		if(numero == 0 ) {
			System.out.println("O n�mero informado � neutro!");
		}else if(numero > 0) {
			System.out.println("O n�mero informado � positivo!");
		}else {
			System.out.println("O n�mero informado � negativo!");
		}
		
		in.close();
	}

}

//Criar um programa que leia um n�mero e informe se o mesmo � neutro (zero),
//positivo ou negativo.