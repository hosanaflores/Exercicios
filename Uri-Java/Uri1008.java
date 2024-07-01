import java.util.Scanner;
public class Uri1008 {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		int NUMBER;
		double SALARY, HORA, RESULTADO;
		
		NUMBER = in.nextInt();
		SALARY = in.nextDouble();
		HORA = in.nextDouble();
		RESULTADO = SALARY*HORA;
		
		System.out.println("NUMBER = " +NUMBER);
		System.out.printf("SALARY U$ = %.2f" ,RESULTADO);
		in.close();
	}
}
//Está correto.