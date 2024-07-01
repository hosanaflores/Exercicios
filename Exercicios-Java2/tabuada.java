import java.util.Scanner;
public class tabuada {
	public static void main(String [] args) {
		Scanner in = new Scanner (System.in);
		
		int number, num1, num2, num3, num4, num5, num6, num7, num8, num9, num10,
		UM = 1, DOIS = 2, TRES = 3, QUATRO = 4, CINCO = 5, SEIS = 6, SETE = 7,
		OITO = 8, NOVE = 9, DEZ = 10;
		
		System.out.println("Informe o número da tabuada que deseja saber: ");
		number = in.nextInt();
		
		num1 = number * UM;
		num2 = number * DOIS;
		num3 = number * TRES;
		num4 = number * QUATRO;
		num5 = number * CINCO;
		num6 = number * SEIS;
		num7 = number * SETE;
		num8 = number * OITO;
		num9 = number * NOVE;
		num10 = number * DEZ;
		
		System.out.println("Tabuada do número " +number+ " é essa: ");
		System.out.println(+number+ " X " +UM+ " = " +num1);
		System.out.println(+number+ " X " +DOIS+ " = " +num2);
		System.out.println(+number+ " X " +TRES+ " = " +num3);
		System.out.println(+number+ " X " +QUATRO+ " = " +num4);
		System.out.println(+number+ " X " +CINCO+ " = " +num5);
		System.out.println(+number+ " X " +SEIS+ " = " +num6);
		System.out.println(+number+ " X " +SETE+ " = " +num7);
		System.out.println(+number+ " X " +OITO+ " = " +num8);
		System.out.println(+number+ " X " +NOVE+ " = " +num9);
		System.out.println(+number+ " X " +DEZ+ " = " +num10);
		in.close();
	
	}

}
//Criar um algoritmo que apresente a tabuada de
//um número inteiro informado pelo usuário sem usar for
