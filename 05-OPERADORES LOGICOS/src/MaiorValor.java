
public class MaiorValor {
	
	int n1 = 5;
	int n2 = 3;
	int n3 = 8;
	
	/* SEM OPERADORES LOGICOS*/
	public void verificarMaior() {
		
		if(n1 > n2) {
			if(n1 > n3) {
				System.out.println("N1 � O MAIOR VALOR");
			}
		}

		if(n2 > n1) {
			if(n2 > n3) {
				System.out.println("N2 � O MAIOR VALOR");
			}
		}
		
		if(n3 > n1) {
			if(n3 > n2) {
				System.out.println("N3 � O MAIOR VALOR");
			}
		}
	}//FIM DO METODO verificarmaior1
	
	public void verificarMaior2() {
		
		if((n1 > n2) && (n1 > n3)) {
			System.out.println("N1 � MAIOR VALOR");
		}
		if((n2 > n1) && (n2 > n3)) {
			System.out.println("N2 � MAIOR VALOR");
		}
		if((n3 > n1) && (n3 > n2)) {
			System.out.println("N3 � MAIOR VALOR");
		}
		
		
	}

}//FIM DA CLASSE MaiorValor
