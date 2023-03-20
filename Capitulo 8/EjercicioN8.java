/**Este programa pide un valor N entero y muestra el sumatorio 
*desde 1 a N, el factorial de 1 a N y el valor intermedio entre 1 y N.
*@AmandaNR*/

import java.util.Scanner;
import misFunciones.FunMatematicas;

public class EjercicioN8 {
	
	public static void  main (String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Muestra el sumatorio, el factorial y el valor intermedio.");
		System.out.print("Introduce un numero: ");
		int num = s.nextInt();
		
		System.out.println("La suma de 1 a "+ num +" es: "+ misFunciones.FunMatematicas.suma1aN(num));
		System.out.println("El factorial de 1 a "+ num +" es: "+ misFunciones.FunMatematicas.producto1aN(num));
		System.out.println("El valor intermedio es: "+ misFunciones.FunMatematicas.intermedio1aN(num));
	
	}
}
