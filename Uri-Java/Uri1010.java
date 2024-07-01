import java.util.Scanner;
	public class Uri1010 {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		int cod1, cod2, pe1, pe2;
		double valor1, valor2, resultado1, resultado2, total;
		
		cod1 = in.nextInt();
		pe1 = in.nextInt();
		valor1 = in.nextDouble();
		cod2 = in.nextInt();
		pe2 = in.nextInt();
		valor2 = in.nextDouble();
		
		resultado1 = pe1*valor1;
		resultado2 = pe2*valor2;
		total = resultado1+resultado2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f " ,total);
		
		in.close();
	}
}
//Está correto.