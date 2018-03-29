package ejerciciosSecuenciaEstructural;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		/**
		 * 6. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
		 */
		
		double vkmh, vms;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese velocidad en Km/h: ");
		vkmh = sc.nextDouble();
		System.out.println("Velocidad en Km/h es: " + vkmh);
		vms = ((vkmh*1000)/3600);
		System.out.println("Velocidad en m/s es: " + vms);
		
		
		
	
		

	}

}
