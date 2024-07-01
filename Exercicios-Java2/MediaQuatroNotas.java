import java.util.Scanner;
public class MediaQuatroNotas {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		double nota1, nota2, nota3, nota4, media;
		
		System.out.println("Informe a primeira nota: ");
		nota1 = in.nextDouble();
		
		System.out.println("Informe a segunda nota: ");
		nota2 = in.nextDouble();
		
		System.out.println("Informe a terceira nota: ");
		nota3 = in.nextDouble();
		
		System.out.println("Informe a quarta nota: ");
		nota4 = in.nextDouble();
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println("Sua média aritmética é de: "+media+" pontos!");
		
		in.close();
	}
}

//Criar um programa que leia quatro notas de um usuário, 
//calcule e apresente a sua média aritmética.

