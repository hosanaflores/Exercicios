import java.util.Scanner;
public class FahrenheitCelsius {
	public static void main(String [] args) {
		Scanner leia = new Scanner (System.in);
		
		double fahrenheit, celsius;
		
		System.out.println("Informe a temperatura em FAHRENHEIT: ");
		fahrenheit = leia.nextDouble();
		
		celsius = (fahrenheit - 32) * (5.0 / 9);
		
		System.out.println("A temperatura convertida para CELSIUS � de: " +celsius+" graus");
		
		leia.close();
	}
}

//Ler uma temperatura em graus Fahrenheit 
//e apresent�-la convertida em graus Celsius
//utilizando a f�rmula: C = (F-32) * (5/9) 
//onde F � a temperatura em Fahrenheit e C em Celsius. 