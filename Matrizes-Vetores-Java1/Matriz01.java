import java.util.Scanner;
public class Matriz01 {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		int matriz [] [] = new int [3] [3]; //Preenchimento dos valores
		//Linha e Coluna 
		
		for (int linha = 0; linha < 3; linha++)
		{
			for (int coluna = 0; coluna < 3; coluna++) {
				
				matriz [linha] [coluna] = (int) (Math.random()*10);
				
			}
		}
		
	  in.close();	
	}
}
