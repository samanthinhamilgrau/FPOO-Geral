package principal;

import operacional.EstruturaSelecao;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		EstruturaSelecao objEtruturaSelecao = new EstruturaSelecao();
		Scanner objScanner = new Scanner(System.in);
		
		String genero;
		
		System.out.println("INFORME UM VALOR PARA GENERO:");
		genero = objScanner.next();
		objEtruturaSelecao.setGenero(genero.toLowerCase());
		
	}

}
