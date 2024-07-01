import java.util.Scanner;
public class MaximoDividas {
	public static void main(String [] args) {
		Scanner in = new Scanner (System.in);
		
		double salario, maximoDividas, PORCENTAGEM = 30;
		
		System.out.println("Informe quanto você recebe mensalmente R$: ");
		salario = in.nextDouble();
		
		maximoDividas = (salario*PORCENTAGEM)/100;
		
		System.out.println("O valor máximo que você pode ter de dívida é: " 
		+maximoDividas+ " R$");
		
		in.close();
	}
}

//Criar um programa que leia o salário de uma pessoa.
//Sabendo-se que para viver sem dívidas a pessoa pode 
//comprometer apenas 30% da sua renda com dívidas, informar 
//o valor máximo de dívidas que o usuário poderá contrair mensalmente. 