
public class OperacoesCalculadora2 {
	public static void main(String [] args) {
		
		Calculadora2 matematica = new  Calculadora2(); //MEU OBJETO SE CHAMA MATEMATICA//
		
		//SEM RETORNO E SEM PARAMETRO//
		matematica.Somar();
		
		
		//MÉTODO COM RETORNO E SEM PARAMETRO//
		System.out.println("A subtração dos números é: "+matematica.Substrair());
		
		
		//MÉTODO SEM RETORNO E COM PARAMETRO//
		 //O USUÁRIO INFORME OS NÚMEROS//
		System.out.println("Digite o primeiro número: ");
		double numero1 = matematica.in.nextDouble(); //tipo, variavel, objeto, leitura//
		System.out.println("Digite o segundo número:");
		double numero2 = matematica.in.nextDouble();
		matematica.Multiplicar(numero1, numero2);
		
		
		//MÉTODO SEM RETORNO E COM PARAMETRO//
		//EU COLOCANDO OS NÚMEROS//
		//-->matematica.Multiplicar(15, 5);<--//
		
		
		
		//MÉTODO COM RETORNO E COM PARAMETRO//
		System.out.println("A divisão dos números é: "+matematica.Dividir(numero1, numero2));
		//O MÉTODO DIVIDIR ESTÁ DENTRO DO OBJETO MATEMATICA//             //PASSEI OS PARAMETROS//
		
	}

}
