
public class Produto01 {

		 //OS ATRIBUTOS//
	String nome;
	int codigo, quantidade; 
	double preco;
		
	//---------------------//
	     

	//M�TODO SEM RETORNO E SEM PAR�METRO//
	public void exibirDados() {

		System.out.println("Nome: "+this.nome);
		System.out.println("C�digo: "+this.codigo);
		System.out.println("Pre�o: "+this.preco);
		System.out.println("Quantidade: "+this.quantidade);
//--------------------------------------------------------------//	
	}
		//M�TODO SEM RETORNO E COM PAR�METRO//
	public void registrarSaida(int quantidade) {
		
		this.quantidade = this.quantidade - quantidade;
		System.out.println("Quantidade atual do estoque: "+this.quantidade);
		
//-----------------------------------------------------------------------------//		
	}
	
		//M�TODO SEM RETORNO E COM PAR�METRO//
	public void registrarEntrada(int quantidade) {
		
		this.quantidade = this.quantidade + quantidade;
		System.out.println("Quantidade atual do estoque: "+this.quantidade);
	}
	
}
