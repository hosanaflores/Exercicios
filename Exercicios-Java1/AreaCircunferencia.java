import java.util.Scanner;
public class AreaCircunferencia {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
	    final double PI = 3.14159;
	    double AREA, RAIO;
	    
	    System.out.println("Informe o n�mero do Raio: ");
	    RAIO = in.nextDouble();
	    
	    AREA = PI*RAIO*RAIO;
	    
	    System.out.printf("O tamanho da �rea � de: %.1f ",AREA);
		
		in.close();
	}
}
