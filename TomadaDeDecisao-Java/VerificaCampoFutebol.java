import java.util.Scanner;
public class VerificaCampoFutebol {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		double comprimento, largura, area;
		
		System.out.println("Informe o comprimento do campo: ");
		comprimento = in.nextDouble();
		
		System.out.println("Informe a largura do campo: ");
		largura = in.nextDouble();
		
		area = comprimento * largura;
		
		if(area >= 110) {
			System.out.println("O campo est� dentro dos padr�es FIFA!");
			
		}else {
			System.out.println("O campo est� fora dos padr�es FIFA!");
		}
		
	  in.close();
	}
}

//Criar um programa que leia o comprimento e a largura de um campo de futebol.
//Caso a �rea do campo seja igual ou acima de 110m� informar que o campo est� no padr�o FIFA. 
//Caso esteja abaixo, informar que o campo est� fora dos padr�es FIFA
//(o formato de um campo de futebol � um ret�ngulo).