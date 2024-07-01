import java.util.Scanner;
public class FatorialForDecremento {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		int numero, fatorial=1, i=1;
		
		System.out.println("Informe um valor para saber seu FATORIAL: ");
		numero = in.nextInt();
		
		for(i=numero; numero>1; numero--)
			
			fatorial = fatorial*numero;
		//5x4x3x2x1=120
		
		System.out.println(fatorial);
			
			
			in.close();
	}

}
