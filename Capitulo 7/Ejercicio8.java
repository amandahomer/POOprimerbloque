/**Este programa pide la temperatura de cada mes del año y las muestra
*en una grafica.
*@AmandaNR*/

import java.util.Scanner;

public class Ejercicio8 {

	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		int[] temp = new int [12];
		char caracter = '*';
		
		System.out.println("Introduce la temperatura media de cada mes.");
		
		for(int i = 0; i < 12; i++) {
			System.out.print("Temperaturas introducidas "+ i +", introduce una temperatura: ");
			temp[i] = s.nextInt();
		}
		
		for(int i = 0; i < 12; i++) {
			System.out.printf("%8s",i + 1 +" Mes: ");
			for(int j = 0; j < temp[i]; j++) {
				System.out.print(caracter);
			}
			System.out.println();
		}
		
	}
}
