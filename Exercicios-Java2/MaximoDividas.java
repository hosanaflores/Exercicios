import java.util.Scanner;
public class MaximoDividas {
	public static void main(String [] args) {
		Scanner in = new Scanner (System.in);
		
		double salario, maximoDividas, PORCENTAGEM = 30;
		
		System.out.println("Informe quanto voc� recebe mensalmente R$: ");
		salario = in.nextDouble();
		
		maximoDividas = (salario*PORCENTAGEM)/100;
		
		System.out.println("O valor m�ximo que voc� pode ter de d�vida �: " 
		+maximoDividas+ " R$");
		
		in.close();
	}
}

//Criar um programa que leia o sal�rio de uma pessoa.
//Sabendo-se que para viver sem d�vidas a pessoa pode 
//comprometer apenas 30% da sua renda com d�vidas, informar 
//o valor m�ximo de d�vidas que o usu�rio poder� contrair mensalmente. 