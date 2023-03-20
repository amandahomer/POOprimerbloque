/**Este programa pide dos números enteros por teclado y muestra por 
*pantalla cual es el mínimo. 
*@AmandaNR*/

import java.util.Scanner;
import misFunciones.FunMatematicas;

public class EjercicioN3 {
	
	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Muestra cual es el minimo.");
		System.out.print("Introduce un numero: ");
		int n1 = s.nextInt();
		System.out.print("Introduce otro numero: ");
		int n2 = s.nextInt();
		
		System.out.println();
		System.out.print("El minimo es "+ misFunciones.FunMatematicas.minimo(n1, n2));
		
	}



}
