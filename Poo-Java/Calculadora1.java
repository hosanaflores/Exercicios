import java.util.Scanner;
public class Calculadora1 {
	public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in);
		
		//ATRIBUTOS//
		double numero1, numero2, resultado;
		String resposta = "s"; //para saber se o usu�rio quer continuar//
		int i = 1;//contador//
		
		
		do {
			
		System.out.println("Digite o primeiro n�mero: ");
		numero1 = in.nextDouble();
		System.out.println("Digite o segundo n�mero: ");
		numero2 = in.nextDouble();
		
		OperacoesCalculadora1 total = new OperacoesCalculadora1();
		resultado = total.adicao(numero1, numero2);
		System.out.println("A soma dos n�meros �: "+total.adicao(numero1, numero2));
		//resultado = total.subtracao(numero1, numero2); -> � UM OUTRO JEITO DE FAZER//
		System.out.println("A subtra��o dos n�meros �: "+total.subtracao(numero1, numero2));
		//resultado = total.divisao(numero1, numero2); -> � UM OUTRO JEITO DE FAZER//
		System.out.println("A divis�o dos n�meros �: "+total.divisao(numero1, numero2));
		//resultado = total.multiplicacao(numero1, numero2); -> � UM OUTRO JEITO DE FAZER//
		System.out.println("A multiplica��o dos n�meros �: "+total.multiplicacao(numero1, numero2));

		System.out.println();
		System.out.println("Voc� deseja continuar? Digite S para Sim ou N para N�O");
		resposta = in.next();
		
		
		}while (resposta.equalsIgnoreCase("s"));
		//equalIsIgnoreCase = ele ignora a letra maiscula ou minuscula...//
		
		i++;
		
		in.close();
	}

}
