import java.util.Scanner;
public class AnoBissexto {
	public static void main(String [] args) {
		Scanner leia = new Scanner(System.in);
		
		int ano, resto;
		
		System.out.println("============= � ANO BISSEXTO OU N�O? ================\n");
		
		System.out.println("Informe algum ano para saber se ele � bissexto: ");
		ano = leia.nextInt();
		
		resto = ano % 4;
		
		if(resto == 0) {
			System.out.println("O ano � bissexto!");
		}else {
			System.out.println("O ano N�O � bissexto!");
		}
		leia.close();
	}
}
