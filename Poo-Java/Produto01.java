
public class Produto01 {

		 //OS ATRIBUTOS//
	String nome;
	int codigo, quantidade; 
	double preco;
		
	//---------------------//
	     

	//MÉTODO SEM RETORNO E SEM PARÂMETRO//
	public void exibirDados() {

		System.out.println("Nome: "+this.nome);
		System.out.println("Código: "+this.codigo);
		System.out.println("Preço: "+this.preco);
		System.out.println("Quantidade: "+this.quantidade);
//--------------------------------------------------------------//	
	}
		//MÉTODO SEM RETORNO E COM PARÂMETRO//
	public void registrarSaida(int quantidade) {
		
		this.quantidade = this.quantidade - quantidade;
		System.out.println("Quantidade atual do estoque: "+this.quantidade);
		
//-----------------------------------------------------------------------------//		
	}
	
		//MÉTODO SEM RETORNO E COM PARÂMETRO//
	public void registrarEntrada(int quantidade) {
		
		this.quantidade = this.quantidade + quantidade;
		System.out.println("Quantidade atual do estoque: "+this.quantidade);
	}
	
}
