import java.util.Scanner;
public class Principal01 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		Produto01 p = new Produto01 ();
		
		System.out.print("Digite o nome do produto: ");
		p.nome = in.next();
		
		System.out.print("Digite código do produto: ");
		p.codigo = in.nextInt();
		
		System.out.print("Digite o preço do produto: ");
		p.preco = in.nextDouble();
		
		System.out.print("Digite a quantidade do produto: ");
		p.quantidade = in.nextInt();
		
		System.out.println();
		System.out.print("INFORMAÇÕES DO PRODUTO:\n");
		
		p.exibirDados();
		p.registrarSaida(12);
		p.registrarEntrada(10);
	
		
		/*System.out.print("\nNome: " +p.nome);
		System.out.print("\nCódigo: " +p.codigo);
		System.out.print("\nPreço: " +p.preco);
		System.out.print("\nQuantidade: " +p.quantidade);
		
		System.out.println();
		System.out.println("\nOBRIGADA PELAS INFORMAÇÕES!");
		*/
		
//Também posso escrever tudo em um System.out.println(); concatenando//
//Posso deixar o código menor tirando os sysoutprintLN e colocando \n para pular linhas //
		
		in.close();
	}

}
