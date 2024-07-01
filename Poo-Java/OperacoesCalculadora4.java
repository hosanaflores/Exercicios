import java.util.Scanner;
public class OperacoesCalculadora4 {
	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);
		
	    final Calculadora4 c = new Calculadora4();//Objeto instanciado da classe Calculadora4
	    
	    int resultado1, resultado2, resultado3, resultado4;//variavéis
	    int numero1, numero2; 
	    
	    System.out.println("Digite um número: ");
	    numero1 = in.nextInt();
	    System.out.println("Digite o segundo número: ");
	    numero2 = in.nextInt();
	  
	    resultado1 = c.Soma();//colocando o resultado do objeto instaciado c do método Soma//
	    resultado2 = c.Divisao();//colocando o resultado do objeto instaciado c do método Divisao//
	    resultado3 = c.Multi();//colocando o resultado do objeto instaciado c do método Multi//
	    resultado4 = c.Subtr();//colocando o resultado do objeto instaciado c do método Subtr//
	    System.out.println(resultado1);//Apresentando resultado
	    System.out.println(resultado2);
	    System.out.println(resultado3);
	    System.out.println(resultado4);
	    
	}
}
