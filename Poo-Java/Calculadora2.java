import java.util.Scanner;
	public class Calculadora2 {
		Scanner in = new Scanner(System.in);
	
		double numero1, numero2, resultado;
	
	//SEM RETORNO E SEM PARAMETRO//
	public void Somar() { 
		System.out.println("Digite o primeiro n�mero: ");
		numero1 = in.nextDouble();
		System.out.println("Digite o segundo n�mero: ");
		numero2 = in.nextDouble();
		resultado = numero1+numero2;
		System.out.println("A soma dos n�meros �: "+resultado);
	}
	
	//M�TODO COM RETORNO E SEM PARAMETRO//
	public double Substrair () {
		System.out.println("Digite o primeiro n�mero: ");
		numero1 = in.nextDouble();
		System.out.println("Digite o segundo n�mero: ");
		numero2 = in.nextDouble();
		return numero1-numero2;
		
	}
	//M�TODO SEM RETORNO E COM PARAMETRO//
	public void Multiplicar (double numero1, double numero2) {
		double resultado = numero1*numero2;
		System.out.println("A multiplica��o dos n�meros �: "+resultado);
	}
	
	//M�TODO COM RETORNO E COM PARAMETRO//
	public double Dividir(double numero1, double numero2) {
		double resultado = numero1/numero2;
		return resultado;	
	}
}
