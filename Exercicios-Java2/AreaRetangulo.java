import java.util.Scanner;
public class AreaRetangulo {
	public static void main(String [] args) {
		Scanner leia = new Scanner(System.in);
		
		double base, altura, area;
		
		System.out.println("Informe a largura de uma parede: ");
		altura = leia.nextDouble();
		
		System.out.println("Informa a largura da outra parede: ");
		base = leia.nextDouble();
		
		area = base * altura;
		
		System.out.println("A �rea da sua sala � de: "+area+ "m�");
		
		leia.close();
	}

}
//Calcular e apresentar a �rea de uma sala retangular
//sendo que a largura de suas duas paredes devem ser informadas pelo usu�rio. 
