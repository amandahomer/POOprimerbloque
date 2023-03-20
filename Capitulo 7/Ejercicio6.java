/**Este programa pide 15 numeros, los almacena en un array y
los muestra cambiados de posicion, la posicion 0 en la posicion 1,
la posicion 1 en la 2, etc y la ultima posicion pasa a la primera.
*@AmandaNR*/

import java.util.Scanner;

public class Ejercicio6 {

	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		int[] num = new int[15];
		int i;
		int aux;
		
		i = 0;
		while(i < 15) {
			System.out.print("Numeros introducidos: "+ i +" Introduce 15 numeros: ");
			num[i] = s.nextInt();
			i++;
		}
		
		System.out.println();
		
		System.out.println("Array original:");
		i = 0;
		while(i < 15) {
			System.out.print(num[i] +" ");
			i++;
		}
		
		System.out.println();
		
		aux = num[14];
		i = 14;
		while(i > 0) {
			num[i] = num[i - 1];
			i--;
		}
		
		num[0] = aux;
		
		System.out.println("Nuevo array:");
		i = 0;
		while(i < 15) {
			System.out.print(num[i] +" ");
			i++;
		}
	
	}
}
