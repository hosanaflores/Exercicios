import java.util.Scanner;
public class ReajusteSalario {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		double salario, salarioFinal, reajuste, REAJUSTE = 10;
		
		System.out.println("Informe qual � o seu sal�rio atual: ");
		salario = in.nextDouble();
		
		reajuste = (salario*REAJUSTE)/100;
		
		salarioFinal = (salario+reajuste);
		
		System.out.println("O seu sal�rio atual com reajuste de "+REAJUSTE+
				" % �: " +salarioFinal+ " reais");
	
		in.close();
	}

}
//Criar um programa que leia o sal�rio de uma pessoa. 
//Calcular e apresentar o novo sal�rio aplicando um reajuste 
//de 10% no sal�rio lido. 
