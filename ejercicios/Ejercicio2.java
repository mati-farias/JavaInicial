package ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		/**
		 * 2. Programa java que realice lo siguiente: declarar dos variables X e Y de tipo
		 * int, dos variables N y M de tipo double y asigna a cada una un valor.
		 * A continuación reliza y
		 * muestra muestra por pantalla una serie de operaciones entre ellas.
		 * La suma  X + Y
La diferencia  X – Y
El producto  X * Y
El cociente  X / Y
El resto  X % Y
La suma  N + M
La diferencia  N – M
El producto  N * M
El cociente  N / M
El resto  N % M
La suma X + N
El cociente Y / M
El resto Y % M
El doble de cada variable
La suma de todas las variables
El producto de todas las variables 
		 */
		
		int X = 18;
	    int Y = 32;
	    double N = 5.5;
	    double M = 7.8;
	    
	    System.out.println("X = 18");
	    System.out.println("Y = 32");
	    System.out.println("N = 5.5");
	    System.out.println("M = 7.8");
	    
	    System.out.println("X-Y = " + (X-Y));
	    System.out.println("X*Y = " + (X*Y));
	    System.out.println("X/Y = "+ (X/Y));
	    System.out.println("X%Y = " + (X%Y));
	    System.out.println("N+M = " + (N+M));
	    System.out.println("N-M = "+ (N-M));
	    System.out.println("N*M = " + (N*M));
	    System.out.println("N/M = " + (N/M));
	    System.out.println("N%M = " + (N%M));
	    System.out.println("X+N = " + (X+M));
	    System.out.println("Y/M = " + (Y/M));
	    System.out.println("Y%M = " + (Y%M));
	    System.out.println("X*2 = " + (X*2));
	    System.out.println("Y*2 = " + (Y*2));
	    System.out.println("N*2 = " + (N*2));
	    System.out.println("M*2 = " + (M*2));
	    System.out.println("X+Y+N+M = " + (X+Y+N+M));
	    System.out.println("X*Y*M*N = " + (X*Y*M*N));
	    
	    System.out.println(String.format("El doble de X %d, El doble de Y %d, El doble de N %f, el doble de M %f ", X*2, Y*2, N*2, M*2));

	}

}
