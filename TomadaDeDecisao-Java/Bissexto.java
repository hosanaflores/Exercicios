import java.util.Scanner;
public class Bissexto {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		int ano;
		
		System.out.println("|====|(Ano Bissexto)|====|\n");
		
		System.out.println("Informe um ANO: ");
		ano = in.nextInt();
		
		if((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
			System.out.println("O ano informado é Bissexto!");
		}else {
			System.out.println("O ano informado NÃO é Bissexto!");
		}
		in.close();
	}
}
