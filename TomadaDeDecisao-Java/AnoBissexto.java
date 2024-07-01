import java.util.Scanner;
public class AnoBissexto {
	public static void main(String [] args) {
		Scanner leia = new Scanner(System.in);
		
		int ano, resto;
		
		System.out.println("============= É ANO BISSEXTO OU NÃO? ================\n");
		
		System.out.println("Informe algum ano para saber se ele é bissexto: ");
		ano = leia.nextInt();
		
		resto = ano % 4;
		
		if(resto == 0) {
			System.out.println("O ano é bissexto!");
		}else {
			System.out.println("O ano NÃO é bissexto!");
		}
		leia.close();
	}
}
