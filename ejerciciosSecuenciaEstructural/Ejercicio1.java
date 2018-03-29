package ejerciciosSecuenciaEstructural;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/**
		 * 1. Programa Java que lea dos números enteros por teclado y los muestre por pantalla.
		 */
		
		int n1;
		int n2;
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Ingrese numero 1: ");
		
		n1= entrada.nextInt();
		
		System.out.println("Ingrese numero 2: ");
		
		n2= entrada.nextInt();
		
		System.out.println("Los numeros ingresados son: \n" +  n1+ "\n" + n2);
		
		
		

	}

}
