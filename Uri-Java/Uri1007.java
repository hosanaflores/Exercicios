import java.util.Scanner;
public class Uri1007 {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		int A,B,C,D,DIFERENCA;
		
		A = in.nextInt();
		B = in.nextInt();
		C = in.nextInt();
		D = in.nextInt();
		
		DIFERENCA = A * B - C * D;
		
		System.out.println("DIFERENÇA = " +DIFERENCA);
		
		in.close();
	}
	 
}
//Está correto.