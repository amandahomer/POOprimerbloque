/**Este programa pide el DNI y muestre por pantalla la letra asociada.
*Para ello se crea una función a la que se le pase el número y devuelva
*la letra.
*@AmandaNR*/

import misFunciones.FunMatematicas;
import java.util.Scanner;

public class EjercicioN18 {

	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce el numero de DNI para saber el NIF (letra asociada): ");
		int num = s.nextInt();
		
		System.out.println("Para el DNI "+ num +" el NIF es: '"+ misFunciones.FunMatematicas.nifDeDNI(num) +"'");
	
	}

}
