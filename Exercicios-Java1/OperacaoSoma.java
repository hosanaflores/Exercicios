import java.util.Scanner;
public class OperacaoSoma {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		double A, B, SOMA;
	
		System.out.println("Informe um n�mero qualquer: ");
		A = in.nextDouble();
		System.out.println("Informe outro n�mero que desejar: ");
		B = in.nextDouble();
		SOMA = A+B;
		System.out.println("A soma dos dois n�meros � de: " +SOMA);
		
		in.close();
	}
}
