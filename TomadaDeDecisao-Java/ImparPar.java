import java.util.Scanner;
public class ImparPar {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		int numero;
	
		System.out.println("Informe um n�mero: ");
		numero = in.nextInt();
		
		if(numero % 2 == 0) { //Aqui estou fazendo o processamento direto na condi��o
			System.out.println("O n�mero � PAR!");
		}else {
			System.out.println("O n�mero � �MPAR!");
			
		}
		in.close();
	}

}
