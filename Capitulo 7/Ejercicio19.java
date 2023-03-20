/**Este programa muestra un array de 12 numeros,
*pide un numero y una posicion y lo inserta remplazando el original.
*@AmandaNR*/

import java.util.Scanner;

public class Ejercicio19 {

	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		int[] num = new int[12];
		
		System.out.println("Array original:");
		for(int i = 0; i < 12; i++) {
			num[i] = (int)(Math.random()* 201);
			System.out.printf("%5d",i);
		}
		
		System.out.println();
		for(int i = 0; i < 12; i++) {
			System.out.printf("%5d",num[i]);
		}
		
		System.out.println();
		System.out.print("Introduzca el numero que quiere insertar: ");
		int inser = s.nextInt();
		System.out.print("Introduzca la posicion donde quiere insertarlo (0 - 11): ");
		int posicion = s.nextInt();
		
		for(int i = 11; i > posicion; i--) {
			num[i] = num[i - 1];
		}
		
		num[posicion] = inser;
		
		System.out.println("Resultado:");
		for(int i = 0; i < 12; i++) {
			System.out.printf("%5d",i);
		}
		
		System.out.println();
		for(int i = 0; i < 12; i++) {
			System.out.printf("%5d",num[i]);
		}
	
	}
}
