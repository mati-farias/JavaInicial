package ejerciciosSecuenciaEstructural;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		/**
		 * 9. Programa que calcula el área de un triángulo a partir de la longitud de sus lados.
		 */
		
		double base;
		double altura;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese Lado 1: ");
		base = sc.nextDouble();
		System.out.println("Ingrese Lado 2: ");
		altura= sc.nextDouble();
		double area = toArea (base, altura);
		System.out.println("El area del triangulo es: " + area);
		

	}

	private static double toArea (double lad1, double lad2) {
	double area= (lad1*lad2)/2;
	return area;
	}
}


