import java.util.Scanner;
public class Uri1005 {
	public static void main(String [] args) {
		Scanner in = new Scanner (System.in);
		double a,b,media;
		
	
		a = in.nextDouble();
		

		b = in.nextDouble();
	
		
		media = (a*3.5+b*7.5)/11;
		
		System.out.printf("MEDIA = %.5f\n " ,media);
		in.close();
	}
}

//Está correto