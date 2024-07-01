import java.util.Scanner;
public class VerificaSalarioMinimo {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		double salario, salarioMinimo, falta;
		
		System.out.println("Informe qual é o seu salário atual: ");
		salario = in.nextDouble();
		
		System.out.println("Informe qual é o salário mínimo atual: ");
		salarioMinimo = in.nextDouble();
		
		falta = salarioMinimo - salario;
		
		if (salario < salarioMinimo) {
		System.out.println("Falta: R$ " +falta+" para você ganhar o salário mínimo!");
		
		}else {
			System.out.println("Seu salário está de acordo com a lei!");
		}
		
		in.close();
	}

}

//Criar um programa que leia o valor do salário de uma pessoa e o valor do salário mínimo. 
//Informar se o salário da pessoa está de acordo com a lei (no Brasil ninguém pode ganhar menos que um salário mínimo).
//Caso o salário esteja abaixo do mínimo, informar quanto falta para que o trabalhador receba o valor correto. 
