import java.util.Scanner;
public class CustoCoelho {
	public static void main(String [] args) {
		Scanner leia = new Scanner(System.in);
		
		int NUMERO_COELHOS = 10;
		double custo;
		
		custo = (NUMERO_COELHOS * 0.70) / 18 + 10;
		
		System.out.println("Custo total � de: "+custo+ " R$");
		
		leia.close();	
	}

}

//Uma loja de animais precisa calcular o custo da cria��o de coelhos.
//O custo � calculado com a f�rmula: CUSTO = (NUM_COELHOS * 0,70)/18 + 10. 