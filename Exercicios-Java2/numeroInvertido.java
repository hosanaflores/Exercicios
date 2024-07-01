import java.util.Scanner;
public class numeroInvertido {
	public static void main(String [] args) {
		Scanner ler = new Scanner (System.in);
		
		int a,b,c;
		
		System.out.println("Informe o valor de A: ");
		a = ler.nextInt();
		
		System.out.println("Informe o valor de B: ");
		b = ler.nextInt();
		
		c = b; // C ta valendo 5, pois B recebeu 5
		
		b = a; // B ta valendo 1, pois A recebeu 1
		
		a = c; // A ta valendo 5, pois recebeu 5 da variavel C 
		
		System.out.println("Resultado A: "+a);
		System.out.println("Resultado B: " +b);
		ler.close();
	}
	
}

//Criar um algoritmo que leia dois valores inteiros A e B,
// ao final apresente os valores invertidos
//(o valor de A deverá estar armazenado em B e o valor de B deverá estar armazenado em A)


