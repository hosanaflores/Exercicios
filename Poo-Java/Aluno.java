
public class Aluno {

	//Atributos//
	private double [] notas = new double[4]; //vetor//
	private String nome;
	private String ra;
	private double media;
	//TODOS OS  ATRIBUTO VIRARÃO UM SET E UM GET//
	
//------------------------------------------------------------------//
	
				//MÉTODOS//
	public void cadastrarAluno(String nome, String ra) {
		this.nome = nome;
		this.ra = ra;

	}

			//MÉTODOS COM SET E GET//
	public void setNome(String nome) {
		this.nome = nome;

	}
	
	public String getNome() {
		return nome;
		
	}

	public void setRa(String ra) {
		this.ra= ra;

	}

	public String getRa() {
		return ra;

	}

	public void setMedia(double media) {
		this.media = media;
		
	}

	public double getMedia() {
		return media;
		
	}
	
	//--------------------------------//
	
	public void setMedia(int media) {
		this.media = media;
		
	}

	public int getMedia(int media) {
		return media;
		
	}

	//-----------------------------------------------------------//

	public void setNotas(double[] notas) {
		this.notas = notas;
		
	}

	public double[] getNotas() {
	return notas;
	
	}

//---------------------------------------------------------------------//

				//MÉTODOS PARA CALCULAR//
	public void calcularMedia() { //Sem parametro e sem retorno//ESTE ESTÁ FEITO//
	for (int i = 0; i < 4; i++) {
	media = media + notas [i];
	}

	media = media/4;
	}


	public double calcularMedia(double n1, double n2, double n3, double n4) {//Com parametro e com retorno//ESTE ESTÁ FEITO//
	for(int i= 0; i< 4; i++) {
	media= media+ notas[i];
	}
	media= media/ 4;
	return media;
	}
	
	public void calcularMedia(int n1, int n2, int n3, int n4) {//Com parâmetros e sem retorno//
	for (int i = 0; i < 4; i ++) {
	media = media+notas[i];
	
	}
	media = media/4;
	

	}

}



