import java.util.Scanner;
public class Uri1011 {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		int entre;
		final double PI = 3.14159;
		double resultado;
		
		entre = in.nextInt();
		
		resultado = (4/3.0) * PI * entre * entre * entre;

		System.out.printf("VOLUME = %.3f " ,resultado);
		
		in.close();
	}
}
//Está correto...