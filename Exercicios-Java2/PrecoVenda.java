import java.util.Scanner;
public class PrecoVenda {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		

	double produto, lucro, resultado;
	int i = 1;
	String resp; 

	do {
		System.out.println("Qual é o valor do produto? ");
		produto = in.nextDouble();

		System.out.println("Qual é o lucro que deseja obter? ");
		lucro = in.nextDouble();

		resultado = (produto*lucro)/100+produto;

		System.out.println("Você deverá vender o produto por: " +resultado+ " reais");

		System.out.println("Você deseja continuar? Digite S para Sim ou N para NÃO");
		resp = in.next();
		

	} while (resp.equalsIgnoreCase("s"));

		i++;

	in.close();

	}

}
