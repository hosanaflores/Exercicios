import java.util.Scanner;
public class salarioDependentes {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		double salario, VALOR_GOV = 18.55, salarioFinal;
		int dependentes;
		
		System.out.println("Informe qual � o seu sal�rio atual: ");
		salario = in.nextDouble();
		
		System.out.println("Informe a quantidade de dependentes que voc� possui: ");
		dependentes = in.nextInt();
		
		salarioFinal = (dependentes*VALOR_GOV)+salario;
		
		System.out.println("O sal�rio final � de: " +salarioFinal+ " reais ");
		
		in.close();
	}

}

//Criar um programa que leia o sal�rio de uma pessoa
//e o n�mero de dependentes que ela tem. Sabendo-se que o 
//governo paga R$ 18,55 por cada dependente, indicar o sal�rio 
//final da pessoa. 