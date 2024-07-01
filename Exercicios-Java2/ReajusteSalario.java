import java.util.Scanner;
public class ReajusteSalario {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		double salario, salarioFinal, reajuste, REAJUSTE = 10;
		
		System.out.println("Informe qual é o seu salário atual: ");
		salario = in.nextDouble();
		
		reajuste = (salario*REAJUSTE)/100;
		
		salarioFinal = (salario+reajuste);
		
		System.out.println("O seu salário atual com reajuste de "+REAJUSTE+
				" % é: " +salarioFinal+ " reais");
	
		in.close();
	}

}
//Criar um programa que leia o salário de uma pessoa. 
//Calcular e apresentar o novo salário aplicando um reajuste 
//de 10% no salário lido. 
