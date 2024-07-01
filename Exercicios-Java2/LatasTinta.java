import java.util.Scanner;
public class LatasTinta {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		double comprimento, largura, area, latas, COBRE = 3.8;
		
		System.out.println("Informe o comprimento da parede: ");
		comprimento = in.nextDouble();
		
		System.out.println("Informe a largura da parede: ");
		largura = in.nextDouble();
		
		area = comprimento * largura;
		latas = area / COBRE;
		
		System.out.printf("A quantidade de latas necessária são: %.2f %n" ,latas);
		
		in.close();
	}

}

//Criar um programa que leia o comprimento e a largura de uma parede.
//Sabendo-se que cada lata de tinta consegue cobrir 3,8m2, calcular e apresentar
//quantas latas de tinta serão necessárias para pintar toda a parede; 