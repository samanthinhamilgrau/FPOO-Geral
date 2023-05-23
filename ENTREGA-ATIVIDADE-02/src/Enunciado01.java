
public class Enunciado01 {
	
	private int valor1, valor2;
	
	public void exibirMaior() {
		
		if (this.getValor1() > this.getValor2()) {
			
			System.out.println("VALOR1 É MAIOR QUE VALOR2");
		}else {
			
			System.out.println("VALOR2 É MAIOR QUE VALOR1");
			
			}
		
	}
	
	public int getValor1() {
		return valor1;
	}

	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}

	public int getValor2() {
		return valor2;
	}

	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}

	
}
