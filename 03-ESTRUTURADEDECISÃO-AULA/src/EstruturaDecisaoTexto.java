
public class EstruturaDecisaoTexto {

	//� VAZIO
	public void testeVazio(String texto) {
		if(texto.isEmpty()) {
			System.out.println("DIGITE UM TEXTO");
		}else {
			System.out.println("OBRIGADA POR DIGITAR O TEXTO");
		}
	}
	
	//� IGUAL
	public void testeIgual(String texto1, String texto2) {
		if(texto1.equalsIgnoreCase(texto2)) {
			System.out.println("OS TEXTOS S�O IGUASI");
		}else {
			System.out.println("OS TEXTOS S�O DIFERNTES");
		}
	}
	
	//QUAL O TAMANHO
	public void contador(String texto) {
		int tamanho = texto.length();
		
		if(tamanho >= 8 ) {
			System.out.println("A SENHA � VALIDA");
		}else {
			System.out.println("A SENHA N�O � VALIDA");
			
		}
	}
	
}
