import java.util.Scanner;
public class SalarioMinimo {
	public static void main(String [] args) {
		Scanner leia = new Scanner(System.in);
		
		double salario;
		
		System.out.println("Informe qual � o seu sal�rio atual: ");
		salario = leia.nextDouble();
		
		if(salario < 1320) {
		System.out.println("Seu sal�rio est� abaixo do sal�rio m�nimo!");
		
		} else {
			System.out.println("Seu sal�rio est� de acordo com a lei!");
		}
		
		leia.close();
	}

}

//Criar um programa que leia o sal�rio de um usu�rio 
//e informe se o sal�rio lido est� abaixo ou acima do sal�rio m�nimo,
//que atualmente � de R$1320.