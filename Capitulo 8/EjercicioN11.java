/**Este programa escribe la tabla de multiplicar de un número introducido
*por teclado. Para ello implementa una función que reciba como parámetro
*un número entero y muestre por pantalla su tabla de multiplicar.
*@AmandaNR*/

import java.util.Scanner;
import misFunciones.FunMatematicas;

public class EjercicioN11 {

	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Pide un numeros y muestra su tabla de multiplicar.");
		System.out.print("Introduce un numero: ");
		int num = s.nextInt();
		
		misFunciones.FunMatematicas.tablaMult(num);
		
	}
}
