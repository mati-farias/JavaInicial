package ejerciciosSecuenciaEstructural;

import java.util.Scanner;

public class Ejercicio4 {

		  public static void main(String[] args) {
		      Scanner scan = new Scanner(System.in);
		      double gradosC;
		      System.out.println("Introduce grados Celsius:");
		      gradosC = scan.nextDouble();
		      double gradosF = toGradosF(gradosC, scan);
		      
		      System.out.println(gradosC +" �C = " + gradosF + " �F");
		  }
		  
		  private static double toGradosF(double cent, Scanner scan) {
				  double base;
				  System.out.println("Ingrese base de conversi�n: ");
				  base = scan.nextDouble();
				  return base + (9* cent / 5);
				  
		  }}


