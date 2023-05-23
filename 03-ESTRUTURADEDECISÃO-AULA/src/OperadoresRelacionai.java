
public class OperadoresRelacionai {
	
	int valor1, valor2;
	
	public void testelogicos() {
		
		/*
		 < - MENOR QUR
		 <= - MENOR OU IGUAL A
		 >- MAIOR QUE
		 >= - MAIOR OU IGUAL A
		 = - IGUAL A
		 ! - DIFERENTE DE 
		 */
		
		this.valor1 = 10;
		this.valor2 = 5;
		boolean resultado;
		
		System.out.println("TESTE LOGICO:" + this.valor1 + " > " + this.valor2);
		resultado = valor1 > valor2;
		System.out.println("RESULTADO: " + resultado);
		
		System.out.println("TESTE LOGICO:" + this.valor1 + " >= " + this.valor2);
		resultado = valor1 >= valor2;
		System.out.println("RESULTADO: " + resultado);
		
		System.out.println("TESTE LOGICO:" + this.valor1 + " < " + this.valor2);
		resultado = valor1 < valor2;
		System.out.println("RESULTADO: " + resultado);
		
		System.out.println("TESTE LOGICO:" + this.valor1 + " <= " + this.valor2);
		resultado = valor1 <= valor2;
		System.out.println("RESULTADO: " + resultado);
		
		System.out.println("TESTE LOGICO:" + this.valor1 + " == " + this.valor2);
		resultado = valor1 == valor2;
		System.out.println("RESULTADO: " + resultado);
		
		System.out.println("TESTE LOGICO:" + this.valor1 + " != " + this.valor2);
		resultado = valor1 != valor2;
		System.out.println("RESULTADO: " + resultado);
		
		
	}
	
}
	
	