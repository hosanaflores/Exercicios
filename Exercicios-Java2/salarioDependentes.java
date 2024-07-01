import java.util.Scanner;
public class salarioDependentes {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		double salario, VALOR_GOV = 18.55, salarioFinal;
		int dependentes;
		
		System.out.println("Informe qual é o seu salário atual: ");
		salario = in.nextDouble();
		
		System.out.println("Informe a quantidade de dependentes que você possui: ");
		dependentes = in.nextInt();
		
		salarioFinal = (dependentes*VALOR_GOV)+salario;
		
		System.out.println("O salário final é de: " +salarioFinal+ " reais ");
		
		in.close();
	}

}

//Criar um programa que leia o salário de uma pessoa
//e o número de dependentes que ela tem. Sabendo-se que o 
//governo paga R$ 18,55 por cada dependente, indicar o salário 
//final da pessoa. 