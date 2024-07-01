import java.util.Scanner;
public class FahrenheitCelsius {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		double fahrenheit, celsius;
		
		System.out.println("Informe a temperatura em graus FAHRENHEIT: ");
		fahrenheit = in.nextDouble();
		
		celsius = (fahrenheit - 32) * (5.0/9);
		
		//System.out.println("Temperatura convertida em Celsius é de: "+celsius+ " graus");
		
		if(celsius < 15 ) {
			System.out.println("Frio!");
			
		}else if(celsius >= 15 && celsius < 22) {
			System.out.println("Ameno!");
			
		}else {
			System.out.println("Calor!");
		}
		
		in.close();
	}

}

//Criar um programa que leia uma temperatura em Fahrenheit 
//e converta-a em graus Celsius. Apresentar a temperatura convertida,
//junto com a mensagem indicada:
//i. Se a temperatura estiver abaixo de 15ºC: “Frio”
//ii. Se a temperatura estiver igual ou acima de 15º e abaixo de 22ºC: “Ameno”
//iii. Se a temperatura estiver igual ou acima de 22ºC: “Calor”
