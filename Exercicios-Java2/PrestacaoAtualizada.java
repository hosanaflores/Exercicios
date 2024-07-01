import java.util.Scanner;
public class PrestacaoAtualizada {
	public static void main(String [] args) {
		Scanner leia = new Scanner (System.in);
		
		double valor, taxa, prestacao;
		int tempo;
		
		System.out.println("Informe o valor da prestação: ");
		valor = leia.nextDouble();
		
		System.out.println("Informe a taxa da prestação: ");
		taxa = leia.nextDouble();
		
		System.out.println("Informe quantos dias a prestação está atrasada: ");
		tempo = leia.nextInt();
		
		prestacao = valor + (valor * (taxa / 100) * tempo);
		
		System.out.println("O valor da prestação atualizada é de: " +prestacao+ " R$");
		
		leia.close();
	}

}
//Efetuar o cálculo de uma prestação em atraso utilizando a fórmula:
//PRESTACAO ← VALOR + (VALOR * (TAXA/100)*TEMPO)
//Onde:
//VALOR é o valor original da prestação
//TAXA é a taxa de juros aplicada ao dia para correção da prestação
//TEMPO é a quantidade de dias que a prestação está atrasada
