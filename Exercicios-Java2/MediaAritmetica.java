import java.util.Scanner;
public class MediaAritmetica {
	public static void main(String [] args) {
		Scanner in = new Scanner (System.in);
		
		double nota1, nota2, nota3, media;
		
		System.out.println("Informe a primeira nota: ");
		nota1 = in.nextDouble();
		
		System.out.println("Informe a segunda nota: ");
		nota2 = in.nextDouble();
		
		System.out.println("Informe a terceira nota: ");
		nota3 = in.nextDouble();
		
		media = (nota1+nota2+nota3)/3;
		
		System.out.println("A m�dia aritm�tica obtida � de: " +media+ " pontos!");
		in.close();
	}

}

//Criar um programa que leia 3 notas de um aluno, 
//calcule e apresente a m�dia aritm�tica entre essas
//3 notas lidas.
