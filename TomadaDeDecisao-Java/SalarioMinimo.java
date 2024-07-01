import java.util.Scanner;
public class SalarioMinimo {
	public static void main(String [] args) {
		Scanner leia = new Scanner(System.in);
		
		double salario;
		
		System.out.println("Informe qual é o seu salário atual: ");
		salario = leia.nextDouble();
		
		if(salario < 1320) {
		System.out.println("Seu salário está abaixo do salário mínimo!");
		
		} else {
			System.out.println("Seu salário está de acordo com a lei!");
		}
		
		leia.close();
	}

}

//Criar um programa que leia o salário de um usuário 
//e informe se o salário lido está abaixo ou acima do salário mínimo,
//que atualmente é de R$1320.