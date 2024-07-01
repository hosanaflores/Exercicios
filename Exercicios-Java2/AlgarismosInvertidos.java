import java.util.Scanner;
public class AlgarismosInvertidos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int invertido = 0, algarismo, modResto;
		
		System.out.print("Digite 3 algarismos: ");
		algarismo = in.nextInt();
		
	     while (algarismo > 0) {
	    	 modResto = algarismo % 10; 
	    	 invertido = invertido*10 + modResto; 
	    	 algarismo = algarismo / 10; 
	 
	     }
		
	       System.out.println("O algarismo invertido é: "+invertido);
	       
	       in.close();
	}

}
