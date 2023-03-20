/**Este programa muestra 20 numeros y pregunta si se quieren resaltar
*los multiplos de 5 o de 7.
*@AmandaNR*/

import java.util.Scanner;

public class Ejercicio16 {

	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		int[] num = new int[20];
		
		for(int i = 0; i < 20; i++) {
			num[i] = (int)(Math.random()* 401);
			System.out.print(num[i] +" ");
		}
		
		System.out.println();
		
		System.out.print("¿Que numeros quiere resaltar? (1-Multiplos de cinco 2-Multiplos de siete): ");
		int opcion = s.nextInt();
		
		if(opcion == 1) {
			for(int i = 0; i < 20; i++) {
				if(num[i] % 5 == 0) {
					System.out.print("["+ num[i] +"] ");
				} else {
					System.out.print(num[i] +" ");
				}
			}
		}
		
		if(opcion == 2) {
			for(int i = 0; i < 20; i++) {
				if(num[i] % 7 == 0) {
					System.out.print("["+ num[i] +"] ");
				} else {
					System.out.print(num[i] +" ");
				}
			}
		}
	
	}
}
