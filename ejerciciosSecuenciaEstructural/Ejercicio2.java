package ejerciciosSecuenciaEstructural;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/**
		 * 2. Programa Java que lea un nombre y muestre por pantalla: “Buenos dias nombre_introducido”.
		 */
		
		String nombre;
		Scanner sc= new Scanner(System.in);
		System.out.println("Ingrese su nombre: ");
		nombre = sc.nextLine();
		System.out.println("Buenos días, "+ nombre);

	}

}
