import java.util.Scanner;
public class Calculadora1 {
	public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in);
		
		//ATRIBUTOS//
		double numero1, numero2, resultado;
		String resposta = "s"; //para saber se o usuário quer continuar//
		int i = 1;//contador//
		
		
		do {
			
		System.out.println("Digite o primeiro número: ");
		numero1 = in.nextDouble();
		System.out.println("Digite o segundo número: ");
		numero2 = in.nextDouble();
		
		OperacoesCalculadora1 total = new OperacoesCalculadora1();
		resultado = total.adicao(numero1, numero2);
		System.out.println("A soma dos números é: "+total.adicao(numero1, numero2));
		//resultado = total.subtracao(numero1, numero2); -> É UM OUTRO JEITO DE FAZER//
		System.out.println("A subtração dos números é: "+total.subtracao(numero1, numero2));
		//resultado = total.divisao(numero1, numero2); -> É UM OUTRO JEITO DE FAZER//
		System.out.println("A divisão dos números é: "+total.divisao(numero1, numero2));
		//resultado = total.multiplicacao(numero1, numero2); -> É UM OUTRO JEITO DE FAZER//
		System.out.println("A multiplicação dos números é: "+total.multiplicacao(numero1, numero2));

		System.out.println();
		System.out.println("Você deseja continuar? Digite S para Sim ou N para NÃO");
		resposta = in.next();
		
		
		}while (resposta.equalsIgnoreCase("s"));
		//equalIsIgnoreCase = ele ignora a letra maiscula ou minuscula...//
		
		i++;
		
		in.close();
	}

}
