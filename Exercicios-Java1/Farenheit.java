import java.util.Scanner;
public class Farenheit {

	public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		
		double celsius, farenheit;
		
		System.out.println("Informe a temperatura em Celsius: ");
		celsius = in.nextDouble();
		
		farenheit = celsius * 1.8 + 32;
		
		System.out.println("A temperatura convertida é: " +farenheit);
	}
	
}
