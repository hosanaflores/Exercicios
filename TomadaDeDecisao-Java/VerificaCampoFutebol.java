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
			System.out.println("O campo está dentro dos padrões FIFA!");
			
		}else {
			System.out.println("O campo está fora dos padrões FIFA!");
		}
		
	  in.close();
	}
}

//Criar um programa que leia o comprimento e a largura de um campo de futebol.
//Caso a área do campo seja igual ou acima de 110m² informar que o campo está no padrão FIFA. 
//Caso esteja abaixo, informar que o campo está fora dos padrões FIFA
//(o formato de um campo de futebol é um retângulo).