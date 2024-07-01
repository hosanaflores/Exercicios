import java.util.Scanner;
public class Uri1012 {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		double A,B,C,TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO;
		final double PI = 3.14159;
		
		A = in.nextDouble();
		B = in.nextDouble();
		C = in.nextDouble();
	
		TRIANGULO = A*C / 2.0;
		CIRCULO = PI * C * C;
		TRAPEZIO = (A + B) * C / 2.0;
		QUADRADO = B * B;
		RETANGULO = A * B;
		System.out.printf("TRIANGULO: %.3f %n", TRIANGULO);
        System.out.printf("CIRCULO: %.3f %n", CIRCULO);
        System.out.printf("TRAPEZIO: %.3f %n", TRAPEZIO);
        System.out.printf("QUADRADO: %.3f %n", QUADRADO);
        System.out.printf("RETANGULO: %.3f %n", RETANGULO);  
		in.close();
	}
}
//Está correto.