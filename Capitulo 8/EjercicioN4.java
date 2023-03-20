/**Este programa pide un número entero por teclado y muestra por 
*pantalla si es positivo, negativo o cero.
*@AmandaNR*/

import java.util.Scanner;
import misFunciones.FunMatematicas;

public class EjercicioN4 {
	
	public static void  main (String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Devuelve -1 si es negativo, 1 si es positivo y 0 si es igual a 0.");
		System.out.print("Introduce un numero: ");
		int num = s.nextInt();
		
		System.out.println();
		System.out.print("El "+ num +" es: "+ misFunciones.FunMatematicas.dimeSigno(num));
		
	}
	
	
}
