package pacote;

public class Media {

	public static void main(String[] args) {
		
		int nota1 = 8;
		int nota2 = 8;
		int nota3 = 8;
		int nota4 = 8;
		int media;
		
		media = (nota1 + nota2 + nota3 + nota4) /4;
		
		System.out.println("MEDIA:" + media);
		
		if (media > 7) {
			
			System.out.println("APROVADO");
		
		}else if (media >= 5) {
			
			System.out.println("RECUPERA��O");
		
		}else {
			
			System.out.println("REPROVADO");
		}
		
		
	
	
	}

}
