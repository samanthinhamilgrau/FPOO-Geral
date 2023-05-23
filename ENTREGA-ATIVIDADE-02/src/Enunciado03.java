
public class Enunciado03 {
	
	private double nota1, nota2, nota3, nota4, nota5, media1, media2;
	
	public void CalcularMedia() {
		if (media1() >= 7) {
			System.out.println("APROVADO");
			
	}
	
	}
	
	public void CalcularMedia2() {
		if (media2() >= 7) {
			System.out.println("APROVADO");
		}else {
			System.out.println("REPROVADO");
		}
		
	}
	
	public double media1() {
		media1 = (getNota1()+ getNota2()+ getNota2()+ getNota4())/4;
				return media1;
	}
	
	
	
	public double media2() {
		media2 = (getNota1()+ getNota2()+ getNota3()+ getNota4()+ getNota5())/5;
		return media2;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}

	public double getNota5() {
		return nota5;
	}

	public void setNota5(double nota5) {
		this.nota5 = nota5;
	}

	
	}
	
	
	

