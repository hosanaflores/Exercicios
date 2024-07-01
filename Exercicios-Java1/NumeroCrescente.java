import java.util.Scanner;
public class NumeroCrescente {
	public static void main(String [] args) {
		Scanner in = new Scanner (System.in);
		
		int numero1, numero2, numero3;
		
		System.out.println("Digite um número");
		numero1 = in.nextInt();
		System.out.println("Digite um número");
		numero2 = in.nextInt();
		System.out.println("Digite um número");
		numero3 = in.nextInt();
		
		for ( int i = 1; i <=3; i++) {
			if (numero1<numero2) {
				System.out.println(numero1+"Maior que "+numero2);
			} 
		} 
	}

}
