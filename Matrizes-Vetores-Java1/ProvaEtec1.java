import java.util.Scanner;
public class ProvaEtec1 {
	public static void main(String [] args) {
		
		int a[], b[], c[], i;
		a = new int[10];
		b = new int[10];
		c = new int[10];
		Scanner in = new Scanner(System.in);

		
		for (i=0; i<=9; i++){
			System.out.print("Digite A: ");
			a[i] = in.nextInt();
		}
		for (i=0; i<=9; i++){
			System.out.print("Digite B: ");
			b[i] = in.nextInt();

			
		}
		for (i=0; i<=9; i++){
			c[i] = a[i]*b[i];
			System.out.print(c[i]+",");
		}
	  }
	  
	}
//Multiplicação dos vetores...
