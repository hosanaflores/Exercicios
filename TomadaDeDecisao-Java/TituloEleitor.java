import java.util.Scanner;
public class TituloEleitor {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		
		int atual, nascimento, idade;
		
		System.out.println("Ser� que voc� pode tirar o T�tulo de Eleitor no Brasil?");
		
		System.out.println("Informe o ano atual: ");
		atual = ler.nextInt();
		
		System.out.println("Informe em qual ano voc� nasceu: ");
		nascimento = ler.nextInt();
		
		idade = atual - nascimento;
		
		if(idade >= 18) {
			System.out.println("SIM! Voc� pode tirar o seu T�tulo de Eleitor(a) no Brasil!");
		}else {
			System.out.println("N�O! Voc� n�o pode tirar o seu T�tulo de Eleitor(a) no Brasil!");
		}
		
		ler.close();
	}

}
