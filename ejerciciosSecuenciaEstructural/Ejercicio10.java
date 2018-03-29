package ejerciciosSecuenciaEstructural;

import java.util.Scanner;

public class Ejercicio10 {
public static void main(String[] args) {
	/**
	 * 10. Programa que lee un número de 3 cifras y muestra sus cifras por separado.
	 */
	
	int numero;
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingrese numero entero de 3 cifras: ");
	numero = sc.nextInt();
	System.out.println("La primer cifra de " + numero + " es: " + (numero/100));
	System.out.println("La segunda cifra de " + numero + " es: "+ (numero/10)%10);
	System.out.println("La tercera cifra de " + numero + " es: "+ (numero%10));
	
	
	
}
}
