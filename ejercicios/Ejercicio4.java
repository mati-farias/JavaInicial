package ejercicios;

public class Ejercicio4 {

	public static void main(String[] args) {
		/**
		 * 4. Programa java que declare cuatro variables enteras A, B, C y D y 
		 * asígnale un valor acada una. A continuación realiza las instrucciones necesarias 
		 * para que: B tome el valor de C, C tome el valor de A, A tome el valor de D, 
		 * D tome el valor de B.
		 */

		int A = 2, B = 5, C = 7, D = 8, AUX;
		AUX = B; 
		B = C;
		C = A;
		A = D;
		D = AUX;
		
		System.out.println("El valor de A = " + (A));
		System.out.println("El valor de B = " + (B));
		System.out.println("El valor de C = " + (C));
		System.out.println("El valor de D = " + (D));
	}

}
