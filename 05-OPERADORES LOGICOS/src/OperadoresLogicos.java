
public class OperadoresLogicos {

	public void testesLogicos() {
		/*OPERADORES LOGICOS:
		  && -> AND -> E
		  ||  -> OR -. OU
		  ! -> NOT -> NÃO
		 */
		
		int idadeInicio = 18;
		int idadefim = 90;
		
		boolean resultado;
		
		/* 
		 VERIFICA SE A IDADE DA PESSOA ESTÁ ENTRE
		 18 E 90 ANOS.
		 */
		
		resultado = (idadeInicio >= 18) && (idadefim <= 90);
		System.out.println(resultado);
		
		idadeInicio = 17;
		resultado = (idadeInicio >= 18) && (idadefim <= 90);
		System.out.println(resultado);
		
		/* 
		 VERIFICA SE A IDADE DA PESSOA ESTÁ ENTRE
		 18 OU 90 ANOS.
		 */
		
		idadeInicio = 18;
		resultado = (idadeInicio >= 18) || (idadefim <= 90);
		System.out.println(resultado);
		
		idadeInicio = 17;
		resultado = (idadeInicio >= 18) || (idadefim <= 90);
		System.out.println(resultado);
		
		
	}
}
