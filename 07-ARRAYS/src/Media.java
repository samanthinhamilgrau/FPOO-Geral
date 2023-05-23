import java.util.Scanner;
public class Media {
	
	String[] alunos = {"Daniel"};
	float[] notas = new float[4];
	Scanner objScanner = new Scanner(System.in);
	
	public void listarAlunos() {
		
		/*System.out.println("1º aluno(a): " + alunos[0]);
		System.out.println("2º aluno(a): " + alunos[1]);
		System.out.println("3º aluno(a): " + alunos[2]);
		System.out.println("4º aluno(a): " + alunos[3]);*/
		
		for(int indice = 0; indice < alunos.length; indice++) {
			
			/*System.out.println((indice + 1) +"ºALUNO(A): " + alunos[indice]);*/
			System.out.println("NOTAS DO ALUNO: " + alunos[indice]);
			
			int cont = 0;
			while(cont < 4) {
				
				
				System.out.println("DIIGTE A " + (cont + 1) + "º NOTA");
				notas[cont] = objScanner.nextFloat();
				cont++;
			}
		}
		
		System.out.println("LISTAGEM DE NOTAS: ");
		int cont = 0;
		while(cont < 4) {
			
			
			System.out.println((cont + 1) + "º NOTA: " + notas[cont]);
			cont++;
			
		}
		
		System.out.println("TOTAL DE ALUNOS: " + alunos.length);
	}

}
