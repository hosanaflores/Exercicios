import java.util.Scanner;
public class BissextoAno {
	public static void main(String [] args) {
		Scanner read = new Scanner(System.in);
		
		int ano;
		
		System.out.println("|========== O ANO � BISSEXTO ? ===========|\n");
		
		System.out.println("Informe um ano: ");
		ano = read.nextInt();
		
		if(ano % 4 == 0) {
			System.out.println("Ano bissexto!");
		}else {
			System.out.println("N�O � bissexto!");
		}
		read.close();
	}
}
