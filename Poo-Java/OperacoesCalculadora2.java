
public class OperacoesCalculadora2 {
	public static void main(String [] args) {
		
		Calculadora2 matematica = new  Calculadora2(); //MEU OBJETO SE CHAMA MATEMATICA//
		
		//SEM RETORNO E SEM PARAMETRO//
		matematica.Somar();
		
		
		//M�TODO COM RETORNO E SEM PARAMETRO//
		System.out.println("A subtra��o dos n�meros �: "+matematica.Substrair());
		
		
		//M�TODO SEM RETORNO E COM PARAMETRO//
		 //O USU�RIO INFORME OS N�MEROS//
		System.out.println("Digite o primeiro n�mero: ");
		double numero1 = matematica.in.nextDouble(); //tipo, variavel, objeto, leitura//
		System.out.println("Digite o segundo n�mero:");
		double numero2 = matematica.in.nextDouble();
		matematica.Multiplicar(numero1, numero2);
		
		
		//M�TODO SEM RETORNO E COM PARAMETRO//
		//EU COLOCANDO OS N�MEROS//
		//-->matematica.Multiplicar(15, 5);<--//
		
		
		
		//M�TODO COM RETORNO E COM PARAMETRO//
		System.out.println("A divis�o dos n�meros �: "+matematica.Dividir(numero1, numero2));
		//O M�TODO DIVIDIR EST� DENTRO DO OBJETO MATEMATICA//             //PASSEI OS PARAMETROS//
		
	}

}
