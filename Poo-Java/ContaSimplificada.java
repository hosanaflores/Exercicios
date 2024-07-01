
public class ContaSimplificada {
	//Atributos//
	
		String nomeCorrentista;
		double saldo;
		double limiteChequeEspecial;
		
		
		//Métodos//
		
		public void  abreConta(String nome, double saldo, double limiteChequeEspecial) {
			this.nomeCorrentista = nome;
			this.saldo = saldo;
			this.limiteChequeEspecial = limiteChequeEspecial;

		} 
		
		public void depositaValor(double valor) {
			
			this.saldo = this.saldo+ valor;
		}
		
		public void retiraValor(double valor) {
			if (valor > this.saldo) {
				System.out.println("Saldo Insuficiente");
			}else {
				this.saldo = this.saldo - valor;
			}
			
		}
		
		public double exibirSaldo() {
			return this.saldo;
		}
		
		public double retiraValor2(double valor) {
			if(valor > this.saldo) {
				System.out.println("Saldo Insuficiente para Saque");
			
			}else {
				this.saldo = this.saldo - valor;
				
			} return this.saldo;
			
		}
		
	}

