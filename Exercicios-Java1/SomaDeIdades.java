//Criar um programa que leia a idade de 5 pessoas e faça a soma 
// das idades digitadas pelo usuário e apresente o resultado na tela.
import java.util.Scanner;
public class SomaDeIdades {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		int idade,soma=0, i;
		
		for(i=0; i<5; i++)
		{
			System.out.println("Digite uma idade: ");
			idade = in.nextInt();
	        
			soma = soma+idade;
			
		}
		   System.out.println("A soma das idadade é de: " +soma);
		
	   in.close();	
	}
}
