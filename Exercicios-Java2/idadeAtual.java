import java.util.Scanner;
public class idadeAtual {

	public static void main(String [] args) {
		Scanner leia = new Scanner (System.in);
		
		int nascimento, anoAtual, idade;
		
		System.out.println("Digite o ano de seu nascimento: ");
		nascimento = leia.nextInt();
		
		System.out.println("Informe o ano atual: ");
		anoAtual = leia.nextInt();
		
		idade = anoAtual - nascimento;
		
		System.out.println("Você tem: " +idade+ " anos, ou fará " +idade+ 
				" anos ainda esse ano!");
		
		leia.close();
	}
}

//Criar um programa que leia o ano de nascimento de um 
//usuário e o ano atual, calcule e apresenta a sua idade
