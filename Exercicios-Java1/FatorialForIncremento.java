import java.util.Scanner;
public class FatorialForIncremento {
	public static void main(String [] agrs) {
		Scanner in = new Scanner(System.in);
		
		int numero, fatorial=1, contador=1;
		
		System.out.println("Informe um valor para saber seu FATORIAL: ");
		numero = in.nextInt();
		
		for(contador=1; contador<=numero; contador++)
		
		fatorial = fatorial*contador;
		//5x1x2x3x4=120
		
		System.out.println(fatorial);
			
		in.close();
	}
}
