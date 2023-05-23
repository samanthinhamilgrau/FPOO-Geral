
public class Enunciado02 {
	
	private int n1, n2, n3;
	
	public void mostrarMaior() {
		if(getN1() > getN2()) {
			if(getN1() > getN2()) {
				System.out.println("N1 É O MAIOR");
				System.exit(0);
				}
		}
		
		if(getN2() > getN1()) {
			if(getN2() > getN3()) {
				System.out.println("N2 É O MAIOR");
				System.exit(0);
			}
			
		}
		
		if(getN3() > getN1()) {
			if(getN3() > getN2()) {
				System.out.println("N3 É O MAIOR");
				System.exit(0);
			}
			
		}

	}
	
	
	
		

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public int getN3() {
		return n3;
	}

	public void setN3(int n3) {
		this.n3 = n3;
	}

}
