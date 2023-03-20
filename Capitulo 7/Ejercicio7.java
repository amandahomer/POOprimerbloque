/**Este programa genera 100 numeros aleatorios del 0 al 20
*@AmandaNR*/

import java.util.Scanner;

public class Ejercicio7 {

	public static void main (String [] args) {
	
		Scanner s = new Scanner(System.in);
		
		int tam = 100;
		int[] num = new int [tam];
		
		for(int i = 0; i < tam; i++){
			num[i] = (int)(Math.random()* 21);
			System.out.print(num[i] + " ");
		}
		
		System.out.println();
		System.out.print("Introduce el numero que quieres cambiar: ");
		int numCambiar = s.nextInt();
		System.out.print("Introduce el numero por el que quieres sustituirlo: ");
		int sustituto = s.nextInt();
		
		for(int i = 0; i < tam; i++) {
			if(num[i] == numCambiar) {
				num[i] = sustituto;
				System.out.print("'"+num[i]+"' " );
			} else {
				System.out.print(num[i] + " ");
			}
		}
	
	}
}
