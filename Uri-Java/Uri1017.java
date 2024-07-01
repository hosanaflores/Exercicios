import java.util.Scanner;
public class Uri1017 {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		double velocidade, horas,litros, automovel=12;

		System.out.println("Informe as Horas gastas na viagem: ");
		horas = in.nextInt(); 
		
		System.out.println("Informe a velocidade m�dia da viagem: ");
		velocidade = in.nextInt();
		
		litros = velocidade/automovel*horas;
		
		System.out.printf("Quantidade de litros necess�ria para realizar a viagem: %.3f" ,litros);
		in.close();
	}
	
}


// GASTO DE COMBUST�VEL
//Joaozinho quer calcular e mostrar a quantidade de litros de combust�vel
//gastos em uma viagem, ao utilizar um autom�vel que faz 12 KM/L. Para isso,
//ele gostaria que voc� o auxiliasse atrav�s de um simples programa. 
//Para efetuar o c�lculo, deve-se fornecer o tempo gasto na viagem (em horas)
//e a velocidade m�dia durante a mesma (em km/h). Assim, pode-se obter
//dist�ncia percorrida e, em seguida, calcular quantos litros seriam 
//necess�rios. Mostre o valor com 3 casas decimais ap�s o ponto.

//Entrada
//O arquivo de entrada cont�m dois inteiros. O primeiro � o tempo gasto 
//na viagem (em horas) e o segundo � a velocidade m�dia durante a mesma 
//(em km/h).

//Sa�da
//Imprima a quantidade de litros necess�ria para realizar a viagem, 
//com tr�s d�gitos ap�s o ponto decimal



