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
		
		System.out.println("A porcentagem de homens é de: "
		+porcentagemH+ "% \nA porcentagem de mulheres é de: "
		+porcentagemM+ "%");
		
		in.close();
	}

}

//Criar um programa que leia o número de alunos de uma sala
//que sejam do sexo masculino e o número de alunos do sexo feminino.
//Calcular e apresentar a porcentagem de cada sexo em relação ao total 
//(Exemplo: A sala tem 40 alunos, 12 são homens e 28 são mulheres, logo você 
//deverá apresentar que porcentagem de homens é de 30% e de mulheres é de 70%)