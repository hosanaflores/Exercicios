import java.util.Scanner;
public class NomeIdade {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		String nome;
		int idade;
		
		System.out.println("Qual é o seu nome? ");
		nome = in.nextLine();
		
		System.out.println("Qual é a sua idade? ");
		idade = in.nextInt();
		
		System.out.println(nome+" você tem " +idade+ " anos");
		
		in.close();
	}

}

//Criar um programa que leia o nome e a idade de um usuário
//e ao final apresente a seguinte mensagem: “FULANO, VOCÊ TEM X ANOS” 
//onde FULANO é o nome do usuário e X é a idade do mesmo. 