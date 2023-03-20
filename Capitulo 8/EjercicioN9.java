/**Este programa pide introducir tres valores enteros y nos dice cuál de
*ellos es el más elevado. Implementalo creando únicamente una función a 
*la que le pasemos dos valores (notres) y nos devuelva el máximo de los 
*dos valores.
*@AmandaNR*/

import java.util.Scanner;
import misFunciones.FunMatematicas;

public class EjercicioN9 {

	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Pide tres numeros y dice cual de ellos es mas elevado.");
		System.out.print("Introduce un numero: ");
		int num1 = s.nextInt();
		System.out.print("Introduce un numero: ");
		int num2 = s.nextInt();
		System.out.print("Introduce un numero: ");
		int num3 = s.nextInt();
		
		int num4 = misFunciones.FunMatematicas.maximo(num1, num2);
		
		System.out.println("El numero mas elevado es: "+ misFunciones.FunMatematicas.maximo(num3, num4));
	
	}
}
