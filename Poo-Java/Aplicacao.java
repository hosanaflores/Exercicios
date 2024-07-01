import java.util.Scanner;
	public class Aplicacao {
		public static void main(String [] args) {

			Scanner in = new Scanner (System.in);

			Produto p = new Produto ();

			
			System.out.println("Digite o nome do produto: ");
				p.nome = in.nextLine(); 

			System.out.println("Digite o código do produto: ");
				p.codigo = in.nextInt();
	
			System.out.println("Digite o valor do produto: ");
				p.precoCusto = in.nextDouble();
	
			System.out.println("Digite a margem de lucro para o produto: ");
				p.margemLucro = in.nextDouble();
	
			System.out.println("Digite a quantidade disponivel do produto: ");
				p.quantidade = in.nextInt();
	
				p.exibirDados();
	
			System.out.println("\n Digite a quantidade comprada: ");
				p.registrarEntrada(in.nextInt()); 
				
			System.out.println("\n Digite a quantidade a ser retirada: ");
				p.registrarSaida(in.nextInt());

			p.exibirDados();
			p.calcularPrecoVenda(); 
			p.exibirDados();

		}
}
