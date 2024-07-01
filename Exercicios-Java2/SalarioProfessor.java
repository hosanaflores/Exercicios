import java.util.Scanner;
public class SalarioProfessor {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		
		double horaAula, aulasMes, inss, salarioTotal, desconto, salarioLiquido;
		
		System.out.println("Informe quanto você ganha por hora-aula: ");
		horaAula = ler.nextDouble();
		
		System.out.println("Informe a quantidade de aulas que você dá no mês: ");
		aulasMes = ler.nextDouble();

		System.out.println("Informe a porcentagem do INSS: ");
		inss = ler.nextDouble();
		
		salarioTotal = horaAula * aulasMes;
		desconto = (salarioTotal * inss) / 100;
		salarioLiquido = salarioTotal - desconto;
		
		System.out.println("Seu salário líquido é de: " +salarioLiquido+ " R$");
		
		ler.close();
	}
}

//Criar um programa que calcule o salário líquido de um professor. 
//Para fazer esse programa você deverá ler o valor da hora aula,
//o número de aulas dadas no mês e o percentual de desconto do INSS. 
//O salário líquido será obtido multiplicando-se o número de aulas dadas 
//pelo valor da hora aula e descontando o percentual do INSS.
