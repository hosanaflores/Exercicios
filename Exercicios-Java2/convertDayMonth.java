import java.util.Scanner;
public class convertDayMonth {
	public static void main(String [] args ) {
		
	double day, dayM, dayY;
	int MONTH = 30, YEAR = 365; 
	
	Scanner i = new Scanner(System.in);
	
	System.out.println("Informe a quantidade de DIAS: ");
	day = i.nextInt();
	
	dayM = day / MONTH;
	
	dayY = day / YEAR;
	
	System.out.println("Quantidade de DIAS: " +day);
	System.out.printf("Quantidade de dias em MESES: %.2f %n", dayM);
	System.out.printf("Quantidade de dias em ANOS: %.2f", dayY);
	i.close();
	}

}

//Criar um programa que leia um número de dias qualquer 
//e o apresente convertido em meses e anos 
