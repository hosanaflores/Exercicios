import java.util.Scanner;
public class SalarioLiquido {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		double salario, inss, salarioLiquido;
		
		System.out.println("Ol�! Informe o seu sal�rio por favor: ");
		salario = in.nextDouble();
		
		if(salario <= 2500) {
			inss = (salario*9)/100;
			salarioLiquido = salario - inss;
			System.out.println("Seu sal�rio l�quido � de: " +salarioLiquido+
					"\nE o valor do INSS �: "+inss);
		}else {
			inss = (salario*11)/100;
			salarioLiquido = salario - inss;
			System.out.println("Seu sal�rio l�quido � de: "+salarioLiquido+
					"\nE o valor do INSS �: "+inss);
		}
		in.close();
	}
}
