import java.util.Scanner;
public class ImparPar {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		int numero;
	
		System.out.println("Informe um número: ");
		numero = in.nextInt();
		
		if(numero % 2 == 0) { //Aqui estou fazendo o processamento direto na condição
			System.out.println("O número é PAR!");
		}else {
			System.out.println("O número é ÍMPAR!");
			
		}
		in.close();
	}

}
