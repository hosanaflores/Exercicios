import java.util.Scanner;
	public class AlunoPrincipal {
		public static void main(String [] args) {
				
			double[] notas = new double [4];//vetor para leitura//
				
			Scanner in = new Scanner(System.in);//Para leitura do que o usuário digitar//
			Aluno  aluno = new Aluno();//Meu objeto da instanciado da classe Aluno//
				
				String nome, ra;
				int i;

				System.out.println("Digite seu nome: ");
					aluno.setNome(in.next());
				
				System.out.println("Digite seu RA: ");
					aluno.setRa(in.next());
				
				System.out.println("Nome: "+aluno.getNome());
				System.out.println("RA:"+aluno.getRa());
				
				
	//---------------------------------------------------------------//
				
				//REFERENTE AO PRIMEIRO MÉTODO//

				for ( i = 0; i < 4; i ++) {
					
					System.out.println("Digite a nota:");
						notas[i] = in.nextDouble();
					
					
				}
					aluno.setNotas(notas);
				
					aluno.calcularMedia();
					
				
				System.out.println("Sua média: "+aluno.getMedia());//Referente ao 1º método--sem parametro e sem retorno//
		
					
				
			}
		
		
	}


	//----------------------------------------------------------------------//