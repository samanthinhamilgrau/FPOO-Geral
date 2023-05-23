
public class Main {

	public static void main(String[] args) {
		
		OperadoresRelacionai objRelacionais = new OperadoresRelacionai();
		DecisaoSimples objDecisaoSimples = new DecisaoSimples();
		DecisaoComposta objDecisaoComposta = new DecisaoComposta();
		Textos objTextos = new Textos();
		EstruturaDecisaoTexto objDecisaoTexto = new EstruturaDecisaoTexto();
		
		//objRelacionais.testelogicos();
		
		//objDecisaoSimples.testeMenor(50, 100);
		//objDecisaoSimples.testeMenorIgual(50, 50);
		//objDecisaoSimples.testeMaior(50, 10);
		//objDecisaoSimples.testeMaiorIgual(100, 20);
		//objDecisaoSimples.testeIgual(5, 5);
		//objDecisaoSimples.testeDiferente(10, 5);
		
		//objDecisaoComposta.testeMenor(100, 10);
		
		//objTextos.testesLogicos();
		
		objDecisaoTexto.testeVazio("SESI/SENAI DESENVOLVIMENTO DE SISTEMAS!");
		objDecisaoTexto.testeIgual("SESI", "SENAI");
		objDecisaoTexto.contador("samantha123");

	}

}
