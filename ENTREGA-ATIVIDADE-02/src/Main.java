import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner objScanner = new Scanner(System.in);
		Enunciado01 objEnunciado01 = new Enunciado01();	
		
		System.out.println("INFORME O PRIMEIRO NUMERO:");
		objEnunciado01.setValor1(objScanner.nextInt());
	
		System.out.println("INFORME O SEGUNDO NUMERO:");
		objEnunciado01.setValor2(objScanner.nextInt());
		
		objEnunciado01.exibirMaior();

		
		Enunciado02 objEnunciado02 = new Enunciado02();	
		
		System.out.println("INFORME O PRIMEIRO NUMERO:");
		objEnunciado02.setN1(objScanner.nextInt());
	
		System.out.println("INFORME O SEGUNDO NUMERO:");
		objEnunciado02.setN2(objScanner.nextInt());
		
		System.out.println("INFORME O SEGUNDO NUMERO:");
		objEnunciado02.setN3(objScanner.nextInt());
		
		objEnunciado02. mostrarMaior();
			
	}

}
