
public class Altura {
	public static void main(String [] args) {
		
		int i = 0;
		double joao = 1.34, pedro = 1.45;
		
		while (joao < pedro) {
			
			joao = joao + 0.025;
			pedro = pedro + 0.02;
			
			i++;
			
		}
		System.out.println("Demorará " +i+ " anos");
	}

}
