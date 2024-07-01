import java.util.Scanner;
public class SalarioProfessor {
	public static void main(String [] args ) {
		Scanner in = new Scanner(System.in);
		
		double ValorHoraAula, PercentualDesconto;
		double SalarioBruto, SalarioLiquido, SalarioFinal;
		int NumeroHorasTrabalhadas;
		System.out.println("Informe o valor recebido por HORA-AULA: ");
		ValorHoraAula = in.nextDouble();
		
		System.out.println("Informe o número de HORAS TRABALHADAS: ");
		NumeroHorasTrabalhadas = in.nextInt();
		
		System.out.println("Informe o PERCENTUAL DE DESCONTO do INSS: ");
		PercentualDesconto = in.nextDouble();
		
		SalarioBruto = ValorHoraAula * NumeroHorasTrabalhadas;
		SalarioLiquido = PercentualDesconto/100*SalarioBruto;
		SalarioFinal = SalarioBruto-SalarioLiquido;
		System.out.println("O salário final com desconto do INSS é de: " +SalarioFinal);
		
	 in.close();	
	}
}
