import java.util.Scanner;
public class AnalisaIdade {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		int nascimento, atual, idade;
		
		System.out.println("Informe o ano em que você nasceu: ");
		nascimento = in.nextInt();
		
		System.out.println("Informe o ano atual: ");
		atual = in.nextInt();
		
		idade = atual - nascimento;
		
		System.out.println("Você tem: "+idade+ " anos!");
		
		if(idade < 10) {
			System.out.println("Criança!");
		} else if(idade < 18) {
				System.out.println("Adolescente!");
				} else if(idade < 60) {
					System.out.println("Adulto!");
					} else {
						System.out.println("Idoso!");
					}
		in.close();
	}
}

/*
Criar um programa que leia o ano de nascimento de um usuário e o ano atual. 
Calcule e apresente a sua idade junto com a mensagem correspondente:

Idade < 10: Criança;
Idade >= 10 e < 18: Adolescente;
Idade >= 18 e Idade < 60: Adulto;
Idade >= 60: Idoso;
*/