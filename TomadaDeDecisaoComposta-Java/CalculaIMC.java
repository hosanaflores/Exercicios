import java.util.Scanner;
public class CalculaIMC {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		double peso, altura, imc;
		
		System.out.println("Informe por favor o seu peso: ");
		peso = in.nextDouble();
		
		System.out.println("Informe por favor a sua altura: ");
		altura = in.nextDouble();
		
		imc = peso/(altura*altura);
		
		if(imc < 18.5) {
			System.out.println("Excesso de Magreza!");
		}	else if(imc >= 18.5 && imc < 25) {
				System.out.println("Peso normal!");
			} else if(imc >= 25 && imc < 30) {
					System.out.println("Excesso de peso!");
			 }	else if(imc >= 30 && imc < 35) {
						System.out.println("Obesidade Grau I");
			   }	else if(imc >= 35 && imc < 40) {
							System.out.println("Obesidade Grau II");
			     }		else {
								System.out.println("Obesidade Grau III");
			}
		in.close();
	}

}
