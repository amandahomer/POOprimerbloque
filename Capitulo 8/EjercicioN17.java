/**Este programa pida número enteros hasta que se introduzca el 0,
para cada número introducido dice si es primo o no.
*@AmandaNR*/

import misFunciones.FunMatematicas;
import java.util.Scanner;

public class EjercicioN17 {

	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Para salir introduce 0");
		
		int num = 1;
		while(num != 0) {
			
			System.out.print("Introduce un numero para saber si es primo o no: ");
			num = s.nextInt();
			
			if(misFunciones.FunMatematicas.esPrimo(num)) {
				System.out.println("El "+ num +" es primo");
			} else {
				System.out.println("El "+ num +" no es primo");
			}
			
		
		} 
			
		
	}
}
