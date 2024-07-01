import java.util.Scanner;
public class SalarioProfessor {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		
		double horaAula, aulasMes, inss, salarioTotal, desconto, salarioLiquido;
		
		System.out.println("Informe quanto voc� ganha por hora-aula: ");
		horaAula = ler.nextDouble();
		
		System.out.println("Informe a quantidade de aulas que voc� d� no m�s: ");
		aulasMes = ler.nextDouble();

		System.out.println("Informe a porcentagem do INSS: ");
		inss = ler.nextDouble();
		
		salarioTotal = horaAula * aulasMes;
		desconto = (salarioTotal * inss) / 100;
		salarioLiquido = salarioTotal - desconto;
		
		System.out.println("Seu sal�rio l�quido � de: " +salarioLiquido+ " R$");
		
		ler.close();
	}
}

//Criar um programa que calcule o sal�rio l�quido de um professor. 
//Para fazer esse programa voc� dever� ler o valor da hora aula,
//o n�mero de aulas dadas no m�s e o percentual de desconto do INSS. 
//O sal�rio l�quido ser� obtido multiplicando-se o n�mero de aulas dadas 
//pelo valor da hora aula e descontando o percentual do INSS.
