package ejerciciosSecuenciaEstructural;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		/**
		 * 8. Programa que calcula el volumen de una esfera.
		 * V = 4/3 PI r3
		 */
		
		double radio;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el valor del Radio: ");
		radio = sc.nextDouble();
		double volumen = toVolumen (radio, sc);
		System.out.println("El volumen de la esfera es: " + volumen);
		

	}
	
	private static double toVolumen (double rad, Scanner sc) {
		double volumen = (Math.pow(rad, 3)*(4*Math.PI/3));
		return volumen ;
		
	}

}
