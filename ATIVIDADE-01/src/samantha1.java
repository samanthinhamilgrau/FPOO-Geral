import java.util.Scanner;

public class samantha1{

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	    double celsius, conversao;
	    
	    System.out.println("####---- CONVERS�O CELSIUS ----#### ");
		
		
		System.out.println("CELSIUS: ");
		celsius = scanner.nextDouble();
		
		
		conversao = (celsius * 1.8 + 32) ;
		
		System.out.println("CELSIUS: " + conversao);
		
		System.out.println("####----OBRIGADO POR USAR NOSSO CONVERSOR ----#### ");
		
		
		}

}
