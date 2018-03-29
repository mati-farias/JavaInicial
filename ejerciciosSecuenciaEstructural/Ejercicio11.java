package ejerciciosSecuenciaEstructural;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		/**
		 * 11. Programa que lea un número entero N de 5 cifras y muestre sus cifras 
		 * desde el principio como en el ejemplo.
		 */
		
		int numero;
		Scanner sc= new Scanner(System.in);
		System.out.println("Ingrese número entero de 5 cifras: ");
		numero = sc.nextInt();
		numero =validarIngreso(numero, sc);
		System.out.println("El numero ingresado es: " + numero);
		System.out.println("Su primer cifra es: " + (numero/10000));
		System.out.println("Su segunda cifra es: " + (numero/1000)%10);
		System.out.println("Su tercera cifra es: " + (numero/100)%10);
		System.out.println("Su cuarta cifra es: " + (numero/10)%10);
		System.out.println("Su quinta cifra es: " + numero%10);
		
		
	}

	private static int validarIngreso(int numero, Scanner sc) {
		if (numero < 100000 && numero > 9999) {
			return numero;
		} else {
			System.out.println("El valor es incorrecto, reingrese un número de 5 cifras: ");
			numero = sc.nextInt();
			return validarIngreso(numero, sc);
		}
	}

}
