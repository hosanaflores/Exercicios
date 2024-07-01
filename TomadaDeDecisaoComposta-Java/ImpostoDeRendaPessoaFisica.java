import java.util.Scanner;
public class ImpostoDeRendaPessoaFisica {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		double salario, reais;
		
		System.out.println("Informe qual é o seu salário: ");
		salario = in.nextDouble();
		
		if(salario <= 1434.59) {
			System.out.println("Não precisa!");
		}else if(salario >= 1434.60 && salario <= 2150.00) {
			reais = salario * 7.5 / 100 - 107.59;
			System.out.printf("O desconto do IRPF são: R$ %.2f " ,reais);
		}else if(salario >= 2150.01 && salario <= 2866.70) {
			reais = salario * 15.0 / 100 - 268.84;
			System.out.printf("O desconto do IRPF são: R$ %.2f ",reais);
		}else if(salario >= 2866.71 && salario <= 3582.00) {
			reais = salario * 22.5 / 100 - 483.84;
			System.out.printf("O desconto do IRPF são: R$ %.2f ",reais);
		}else {
			reais = salario * 27.5 / 100 - 662.94;
			System.out.printf("O desconto do IRPF são: R$ %.2f ",reais);
		}
		in.close();
	}
}

/*
 
Criar um programa que leia o salário de um empregado 
e apresente o desconto do IRPF segundo a tabela abaixo: 

BASE DE CÁLCULO MENSAL EM R$ | Alíquota % 	| Parcela a deduzir do imposto 
-Até 1.434,59 				 |      -     	| 			-		
-De 1.434,60 até 2.150,00	 |		7,5		|		107,59
-De 2.150,01 até 2.866,70	 |		15,0	|		268,84  
-De 2.866,71 até 3.582,00	 |		22,5	|		483,84
-Acima de 3.582,00			 |		27,5	|		662,94	

*/