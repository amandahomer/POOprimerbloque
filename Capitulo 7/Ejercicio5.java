/**Este programa pide 10 numeros y los muestra junto con el maximo y el minimo.
*@AmandaNR*/

import java.util.Scanner;

public class Ejercicio5 {

	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		int[] num = new int[10];
		int max = 0;
		int min = 1000;
		int i = 0;
	
		while(i < 10) {
			System.out.print("Numeros introducidos: "+ i +" Introduce 10 numeros: ");
			num[i] = s.nextInt();
			if(num[i] < min) {
				min = num[i];
			}
			if(num[i] > max) {
				max = num[i];
			}
			i++;
		}
		
		i = 0;
		while(i < 10) {
			System.out.print("Numero: "+ num[i]);
			if(num[i] == max) {
				System.out.print(" Maximo");
			}
			if(num[i] == min) {
				System.out.print(" Minimo");
			}
			i++;
			System.out.println();
		}

	}
}
