import java.util.Scanner;
public class VerificaSalarioMinimo {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		double salario, salarioMinimo, falta;
		
		System.out.println("Informe qual � o seu sal�rio atual: ");
		salario = in.nextDouble();
		
		System.out.println("Informe qual � o sal�rio m�nimo atual: ");
		salarioMinimo = in.nextDouble();
		
		falta = salarioMinimo - salario;
		
		if (salario < salarioMinimo) {
		System.out.println("Falta: R$ " +falta+" para voc� ganhar o sal�rio m�nimo!");
		
		}else {
			System.out.println("Seu sal�rio est� de acordo com a lei!");
		}
		
		in.close();
	}

}

//Criar um programa que leia o valor do sal�rio de uma pessoa e o valor do sal�rio m�nimo. 
//Informar se o sal�rio da pessoa est� de acordo com a lei (no Brasil ningu�m pode ganhar menos que um sal�rio m�nimo).
//Caso o sal�rio esteja abaixo do m�nimo, informar quanto falta para que o trabalhador receba o valor correto. 
