import java.util.Scanner;
public class Uri1013 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a,b,c, maiorab, abc;
		
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		
		//Math.abs = Valor absoluto de um número...Ex: -123 será convertido em 123.
		maiorab = (a+b+Math.abs(a-b))/2;
		abc = (maiorab+c+Math.abs(maiorab-c))/2;
		System.out.println(abc+" eh o maior");
	
		in.close();
	}
}
//Está correto.