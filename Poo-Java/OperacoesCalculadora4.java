import java.util.Scanner;
public class OperacoesCalculadora4 {
	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);
		
	    final Calculadora4 c = new Calculadora4();//Objeto instanciado da classe Calculadora4
	    
	    int resultado1, resultado2, resultado3, resultado4;//variav�is
	    int numero1, numero2; 
	    
	    System.out.println("Digite um n�mero: ");
	    numero1 = in.nextInt();
	    System.out.println("Digite o segundo n�mero: ");
	    numero2 = in.nextInt();
	  
	    resultado1 = c.Soma();//colocando o resultado do objeto instaciado c do m�todo Soma//
	    resultado2 = c.Divisao();//colocando o resultado do objeto instaciado c do m�todo Divisao//
	    resultado3 = c.Multi();//colocando o resultado do objeto instaciado c do m�todo Multi//
	    resultado4 = c.Subtr();//colocando o resultado do objeto instaciado c do m�todo Subtr//
	    System.out.println(resultado1);//Apresentando resultado
	    System.out.println(resultado2);
	    System.out.println(resultado3);
	    System.out.println(resultado4);
	    
	}
}
