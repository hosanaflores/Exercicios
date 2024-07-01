import java.util.Scanner;
public class Uri1014 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int X;
		double Y, KML;
		
		X = in.nextInt();
		Y = in.nextDouble();
		KML = X/Y;
		
		System.out.printf("%.3f" ,KML);
		in.close();
	}
}
//Está correto.
