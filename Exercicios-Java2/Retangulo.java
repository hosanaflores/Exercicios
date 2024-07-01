import java.util.Scanner;
public class Retangulo {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		double base, altura, perimetro, area;

		System.out.println("Digite a base: ");
		base = in.nextDouble();

		System.out.println("Digite a altura: ");
		altura = in.nextDouble();

		area = (base*altura);
		perimetro = (2*base+2*altura);

		System.out.printf("A área é: %.2f \n" ,area);
		System.out.printf("O perímetro é: %.2f ",perimetro);

		in.close();
	}

}
