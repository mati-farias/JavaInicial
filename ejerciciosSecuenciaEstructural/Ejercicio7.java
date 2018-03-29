package ejerciciosSecuenciaEstructural;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/**
		 * 7. Programa lea la longitud de los catetos de un triángulo rectángulo 
		 * y calcule la longitud de la hipotenusa según el teorema de Pitágoras. 
		 */
		
		double C1, C2, Hip;
		Scanner sc= new Scanner(System.in);
		System.out.println("Ingrese valor del Cateto 1: ");
		C1 = sc.nextDouble();
		System.out.println("Ingrese valor del Cateto 2: ");
		C2 = sc.nextDouble();
		
		Hip = Math.sqrt((Math.pow(C1, 2)+Math.pow(C2, 2)));
		
		System.out.println("El valor de la hipotenusa es: " + Hip);
		
		
				
		

	}

}
