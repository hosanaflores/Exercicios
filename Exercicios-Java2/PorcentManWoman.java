import java.util.Scanner;
public class PorcentManWoman {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		double porcentagemH, porcentagemM;
		int homens, mulheres, totalAlunos;
		
		System.out.println("Informe a quantidade de homens: ");
		homens = in.nextInt();
		
		System.out.println("Informe a quantidade de mulheres: ");
		mulheres = in.nextInt();
		
		totalAlunos = homens+mulheres;
		
		porcentagemH = (homens*100)/totalAlunos;
		porcentagemM= (mulheres*100)/totalAlunos;
		
		System.out.println("A porcentagem de homens � de: "
		+porcentagemH+ "% \nA porcentagem de mulheres � de: "
		+porcentagemM+ "%");
		
		in.close();
	}

}

//Criar um programa que leia o n�mero de alunos de uma sala
//que sejam do sexo masculino e o n�mero de alunos do sexo feminino.
//Calcular e apresentar a porcentagem de cada sexo em rela��o ao total 
//(Exemplo: A sala tem 40 alunos, 12 s�o homens e 28 s�o mulheres, logo voc� 
//dever� apresentar que porcentagem de homens � de 30% e de mulheres � de 70%)