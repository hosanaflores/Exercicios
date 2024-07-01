
public class Produto {

	//ATRIBUTOS//

	String nome;
	int codigo;
	double precoCusto;
	double precoVenda;
	double margemLucro;
	int quantidade;


	//MÉTODOS//
	
	public void registrarEntrada(int quantidade) {
		this.quantidade = this.quantidade + quantidade; 
		System.out.println("ENTRADA ATUALIZADA COM SUCESSO!");
	
	}

	public void registrarSaida(int quantidade) {
		this.quantidade = this.quantidade - quantidade;
		System.out.println("\nSAÍDA ATUALIZADA COM SUCESSO!");
	
	}
	public void calcularPrecoVenda() {
		this.precoVenda = (this.precoCusto * this.margemLucro)/100 + this.precoCusto;
	
	}
	
	
	public double definirPrecoVenda(double precoVenda) {
		if (precoVenda < this.precoCusto) { 
			System.out.println("Preço abaixo do esperado!");
	
	}else {
		this.precoVenda = precoVenda; 
	
	}
		return this.precoVenda; 
	}
	
	
	public void exibirDados() { 
		System.out.println("\nDADOS DO PRODUTO: \n");
		System.out.println("==============================");
		System.out.println("Nome: "+this.nome);
		System.out.println("Código: "+this.codigo);
		System.out.println("Preço de custo: "+this.precoCusto);
		System.out.println("Preço de venda:"+this.precoVenda);
		System.out.println("Margem de lucro: "+this.margemLucro);
		System.out.println("Quantidade disponivel no estoque: "+this.quantidade);
	
	}
}
