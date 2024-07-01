import java.util.Scanner;
public class SomaVetores {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final int TAM = 10; 

		int i, a[], b[], c[];

		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];

		for (i=0; i<TAM; i++) {
			System.out.println("Entre com o " +(i+1)+ " valor do Vetor A");

			a[i] = in.nextInt();
		}

		for (i=0; i<TAM; i++) {
			System.out.println("Entre com o " +(i+1)+ " valor do Vetor B");

			b[i] = in.nextInt();
		}

		for (i=0; i<TAM; i++) {

			c[i] = a[i]+b[i];
		}

		System.out.printf("C = [ ");
		
		for (i=0; i<TAM; i++) {
			
			System.out.printf(" "+c[i]);

		}

		System.out.printf(" ] ");
		
		in.close();

	}

}
