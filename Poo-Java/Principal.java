import java.util.Scanner;
public class Principal {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		Carro c1 = new Carro();
		
		System.out.println("INFORMAÇÕES SOBRE VEÍCULOS: \n");
		
		c1.marca ="Ford";
		c1.cor = "Azul";
		c1.modelo ="Focus";
		c1.numeroPassageiros = 4;
		c1.capacidadeTanqueCombustivel = 15.5;
		c1.consumoCombustivelKm = 2.5;
		
		System.out.println(" Marca: " +c1.marca+ " \n Cor: " +c1.cor+ " \n Modelo: " +c1.modelo+ " \n Passageiros: " +c1.numeroPassageiros+ " \n Tanque: " +c1.capacidadeTanqueCombustivel+ "\n Consumo KM: " +c1.consumoCombustivelKm+ " \n");
		
		Carro c2 = new Carro();
		
		c2.marca="Jeep";
		c2.cor="Vermelho";
		c2.modelo="Compass";
		c2.numeroPassageiros = 4;
		c2.capacidadeTanqueCombustivel = 20.3;
		c2.consumoCombustivelKm = 3.3;
		
		System.out.println(" Marca: " +c2.marca+ "\n Cor: " +c2.cor+ "\n Modelo: " +c2.modelo+ " \n Passageiros: " +c2.numeroPassageiros+ " \n Tanque: " +c2.capacidadeTanqueCombustivel+ " \n Consumo KM: " +c2.consumoCombustivelKm+ " \n");
		
		Carro c3 = new Carro();
		
		c3.marca="FIAT";
		c3.cor="Amarelo";
		c3.modelo="Argo";
		c3.numeroPassageiros = 4;
		c3.capacidadeTanqueCombustivel = 30.12;
		c3.consumoCombustivelKm = 10.15;
		
		System.out.println(" Marca: " +c3.marca+ " \n Cor: " +c3.cor+ " \n Modelo: " +c3.modelo+ " \n Passageiros: " +c3.numeroPassageiros+ " \n Tanque: " +c3.capacidadeTanqueCombustivel+ " \n Consumo KM: " +c3.consumoCombustivelKm+ " \n");
	
		
		Carro c4 = new Carro();
		
		System.out.println("Digite a marca do carro: ");
		c4.marca = in.next();
		
		System.out.println("Digite a cor do carro: ");
		c4.cor = in.next();
		
		System.out.println("Digite o modelo do carro: ");
		c4.modelo = in.next();
		
		System.out.println("Digite a capacidade de passageiros: ");
		c4.numeroPassageiros = in.nextInt();
		
		System.out.println("Digite a capacidade do tanque de combustível: ");
		c4.capacidadeTanqueCombustivel = in.nextDouble();
		
		System.out.println("Digite o consumo de combustível por KM: ");
		c4.consumoCombustivelKm = in.nextDouble();
		
		System.out.println(" \n Marca: " +c4.marca+ "\n Cor: " + c4.cor+ " \n Modelo: " +c4.modelo+ " \n Passageiros: " +c4.numeroPassageiros+ " \n Tanque: " + c4.capacidadeTanqueCombustivel+ " \n COnsumo KM: " + c4.consumoCombustivelKm+ " \n");
		
		System.out.println("OBRIGADA PELAS INFORMAÇÕES!");
		
		in.close();
	}
	

}
