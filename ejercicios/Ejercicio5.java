package ejercicios;

public class Ejercicio5 {

	public static void main(String[] args) {
		/**
		 * 5. Programa Java que declare una variable A de tipo entero y asígnale un valor. 
		 * A continuación muestra un mensaje indicando si A es par o impar. 
		 * Utiliza el operador condicional ( ? : ) dentro del println para resolverlo. 
		 */
		
		int A = 13;
				
		System.out.println(A + (A%2==0? " es par ": " es impar"));
	}

}
