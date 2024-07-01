import java.util.Scanner;
public class Uri1002 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		double pi = 3.14159, raio;
		
		System.out.println("Informe o RAIO: ");
		raio = in.nextDouble();
		
		pi = pi*raio*raio;
		
		System.out.printf("A = %.4f " ,pi);
		in.close();
	}
}      

//Está correto