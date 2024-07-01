import java.util.Scanner;
public class ParImpar {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		int numero, resto;
		
		System.out.println("Informe um número por favor: ");
		numero = in.nextInt();
		
		//Processamento:
		resto = numero % 2; 
		/*
		Variavél chamada resto recebe o número digitado pelo usuário
		daí a variavél que guarda o valor digitado pelo usuário é dividido por 2
	 	e se pega o resto da divisão e por fim, o resto da divisão é guardado na variavél resto. 
		*/
		
		if(resto == 0) { //Se o resto da divisão for igual a 0 é PAR, senão é ÍMPAR
			System.out.println("PAR!");
		}else {
			System.out.println("ÍMPAR!");
		}
		in.close();
	}

}
