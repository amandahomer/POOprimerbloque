/**Este programa pide dos números reales por teclado y muestra 
*por pantalla el resultado de multiplicarlos. Implementa y utiliza 
*la función
*@AmandaNR*/

import misFunciones.FunMatematicas;
import java.util.Scanner;

public class EjercicioN1 {

	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Multiplica dos numeros");
		System.out.print("Introduzca un numero: ");
		double n1 = s.nextInt();
		System.out.print("Introduzca otro numero: ");
		double n2 = s.nextInt();
		
		System.out.println("La multiplicacion es: "+ misFunciones.FunMatematicas.multiplica(n1, n2));
		
		
	
	
	}
}
