import java.util.Scanner;
public class ParImpar {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		int numero, resto;
		
		System.out.println("Informe um n�mero por favor: ");
		numero = in.nextInt();
		
		//Processamento:
		resto = numero % 2; 
		/*
		Variav�l chamada resto recebe o n�mero digitado pelo usu�rio
		da� a variav�l que guarda o valor digitado pelo usu�rio � dividido por 2
	 	e se pega o resto da divis�o e por fim, o resto da divis�o � guardado na variav�l resto. 
		*/
		
		if(resto == 0) { //Se o resto da divis�o for igual a 0 � PAR, sen�o � �MPAR
			System.out.println("PAR!");
		}else {
			System.out.println("�MPAR!");
		}
		in.close();
	}

}
