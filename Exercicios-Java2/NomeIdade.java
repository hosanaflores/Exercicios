import java.util.Scanner;
public class NomeIdade {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		String nome;
		int idade;
		
		System.out.println("Qual � o seu nome? ");
		nome = in.nextLine();
		
		System.out.println("Qual � a sua idade? ");
		idade = in.nextInt();
		
		System.out.println(nome+" voc� tem " +idade+ " anos");
		
		in.close();
	}

}

//Criar um programa que leia o nome e a idade de um usu�rio
//e ao final apresente a seguinte mensagem: �FULANO, VOC� TEM X ANOS� 
//onde FULANO � o nome do usu�rio e X � a idade do mesmo. 