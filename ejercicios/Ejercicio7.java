package ejercicios;

public class Ejercicio7 {

	public static void main(String[] args) {
		/**
		 * 7. Programa Java que declare una variable C de tipo entero y asígnale un valor. 
		 * A continuación muestra un mensaje indicando si el valor de C es positivo o negativo, 
		 * si es par o impar, si es múltiplo de 5, si es múltiplo de 10 y si es mayor o menor que 100. 
		 * Consideraremos el 0 como positivo. Utiliza el operador condicional ( ? : ) 
		 * dentro del println para resolverlo.
		 */
		
		
		int C = 150;
				
		System.out.println(C + (C<=0? "\n es negativo":" es positivo") 
				+ (C%5==0? "\nEs multiplo de 5":"\nNo es multiplo de 5") + 
				(C%10==0? "\nEs multiplo de 10 " :"\nNo es multiplo de 10") +
				(C%2==0? "\nEs par":"\nEs impar") + (C<100? "\nEs menor que 100":"\nEs mayor que 100"));

	}

}
