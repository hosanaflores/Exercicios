import java.util.Scanner;
public class FestaConvidados {
	public static void main(String [] args) {
		Scanner in = new Scanner (System.in);
		
		int homens, mulheres, salgadoH, salgadoM, salgados, docesH, docesM, doces;
		double boloH, boloM, bolo, refriH, refriM, refrigerantes;
		
		System.out.println("Informe a quantidade de homens: ");
		homens = in.nextInt();
		
		System.out.println("Informe a quantidade de mulheres: ");
		mulheres = in.nextInt();
		
		salgadoH = homens * 15;
		salgadoM = mulheres * 10;
		salgados = salgadoH + salgadoM;
		docesH = homens * 8;
		docesM = mulheres * 6;
		doces = docesH + docesM;
		boloH = (homens * 100) / 1000;
		boloM = (mulheres * 100) / 1000;
		bolo = boloH + boloM;
		refriH = (homens * 600) / 1000;
		refriM = (mulheres * 500) / 1000;
		refrigerantes = refriH + refriM;
		
		System.out.println("Quantidade de Salgados: " +salgados+ ""
				+ "\nQuantidade de Doces: "+doces+ "\nQuilos de bolo (KG): "
				+bolo+ "\nQuantos litros de refrigerante: "+refrigerantes);
		
		in.close();
	}
}

//Criar um programa que leia a quantidade de convidados
//do sexo feminino e do sexo masculino de uma festa.
//Calcule e apresente a quantidade a ser comprada de salgados (em unidades),
//doces (em unidades), bolo (em quilograma) e bebidas (em litros) sabendo-se que: 
//-Para cada convidado do sexo masculino devem ser comprados 15 salgados; 
//-Para cada convidada do sexo feminino devem ser comprados 10 salgados; 
//-Para cada convidado do sexo masculino devem ser comprados 6 doces; 
//-Para cada convidada do sexo feminino devem ser comprados 8 doces; 
//-Para cada convidado independente de ser homem ou mulher devem ser comprados 100gr de bolo; 
//-Para cada convidado do sexo masculino devem ser comprados 600ml de bebida; 
//-Para cada convidada do sexo feminino devem ser comprados 500ml de bebida.

