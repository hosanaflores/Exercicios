
public class Produto {

	//ATRIBUTOS//

	String nome;
	int codigo;
	double precoCusto;
	double precoVenda;
	double margemLucro;
	int quantidade;


	//M�TODOS//
	
	public void registrarEntrada(int quantidade) {
		this.quantidade = this.quantidade + quantidade; 
		System.out.println("ENTRADA ATUALIZADA COM SUCESSO!");
	
	}

	public void registrarSaida(int quantidade) {
		this.quantidade = this.quantidade - quantidade;
		System.out.println("\nSA�DA ATUALIZADA COM SUCESSO!");
	
	}
	public void calcularPrecoVenda() {
		this.precoVenda = (this.precoCusto * this.margemLucro)/100 + this.precoCusto;
	
	}
	
	
	public double definirPrecoVenda(double precoVenda) {
		if (precoVenda < this.precoCusto) { 
			System.out.println("Pre�o abaixo do esperado!");
	
	}else {
		this.precoVenda = precoVenda; 
	
	}
		return this.precoVenda; 
	}
	
	
	public void exibirDados() { 
		System.out.println("\nDADOS DO PRODUTO: \n");
		System.out.println("==============================");
		System.out.println("Nome: "+this.nome);
		System.out.println("C�digo: "+this.codigo);
		System.out.println("Pre�o de custo: "+this.precoCusto);
		System.out.println("Pre�o de venda:"+this.precoVenda);
		System.out.println("Margem de lucro: "+this.margemLucro);
		System.out.println("Quantidade disponivel no estoque: "+this.quantidade);
	
	}
}
