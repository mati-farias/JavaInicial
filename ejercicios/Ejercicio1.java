package ejercicios;

public class Ejercicio1 {

	public static void main(String[] args) {
		//
		/**1. Programa java que realice lo siguiente: declarar una variable N de tipo int,
		 *  una variable A de tipo double y una variable C de tipo char y
		 *  asigna a cada una un valor.
		 * A continuación muestra por pantalla: El valor de cada variable,
		 * la suma de N + A, la diferencia de A - N,
		 * el valor numérico correspondiente al carácter que contiene la variable C.
		 * 
		 */
		
		int N = 12;
		double A = 15.5;
		char C = 'a';
		
		System.out.println("La suma A + N es igual a:" + (A+N));
	    System.out.println("La diferencia entre a y n es igual a:" + (A-N));
	    System.out.println("El valor de C es:" +(int) C);

	}

}
