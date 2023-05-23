import java.util.Scanner;

public class samantha{

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	    double fahrenheit, conversao;
	    
	    System.out.println("####---- CONVERSÃO FAHRENHEIT ----#### ");
		
		
		System.out.println("FAHREINHEIT: ");
		fahrenheit = scanner.nextDouble();
		
		
		conversao = (fahrenheit - 32) / 1.8;
		
		System.out.println("CELSIUS: " + conversao);
		
		System.out.println("####----OBRIGADO POR USAR NOSSO CONVERSOR ----#### ");
		
		
}

}
