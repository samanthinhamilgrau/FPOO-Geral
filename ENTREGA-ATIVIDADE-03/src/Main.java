import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		

		Scanner objScanner = new Scanner(System.in);
		EnunciadoTriangulo objEncTriangulo = new EnunciadoTriangulo();
		
		System.out.println("INFOME O PRIMERO LADO:");
		objEncTriangulo.setLado1(objScanner.nextInt());
		
		System.out.println("INFOME O SEGUNDO LADO:");
		objEncTriangulo.setLado2(objScanner.nextInt());
		
		System.out.println("INFOME O TERCEIRO LADO:");
		objEncTriangulo.setLado3(objScanner.nextInt());
		
		objEncTriangulo.triangulos();
		
		
		
		
		
		
		
		

	}

}
