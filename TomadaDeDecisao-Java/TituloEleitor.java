import java.util.Scanner;
public class TituloEleitor {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		
		int atual, nascimento, idade;
		
		System.out.println("Será que você pode tirar o Título de Eleitor no Brasil?");
		
		System.out.println("Informe o ano atual: ");
		atual = ler.nextInt();
		
		System.out.println("Informe em qual ano você nasceu: ");
		nascimento = ler.nextInt();
		
		idade = atual - nascimento;
		
		if(idade >= 18) {
			System.out.println("SIM! Você pode tirar o seu Título de Eleitor(a) no Brasil!");
		}else {
			System.out.println("NÃO! Você não pode tirar o seu Título de Eleitor(a) no Brasil!");
		}
		
		ler.close();
	}

}
