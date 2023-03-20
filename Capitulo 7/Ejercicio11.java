/**Este programa pide 10 numeros y los guarda en un array, los
*muestra y desplaza los numeros primos a las primeras posiciones.
*@AmandaNR*/

import java.util.Scanner;

public class Ejercicio11 {

	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		int[] num = new int[10];
		int contPrimo = 0;
		int contNoPrimo = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Numeros introducidos "+ i +" Introduzca 10 numeros: ");
			num[i] = s.nextInt();
			if(num[i] % num[i] == 0) {
				contPrimo++;
			} else {
				contNoPrimo++;
			}
		}
		
		System.out.println("Array inicial:");
		for(int i = 0; i < 10; i++) {
			System.out.print(i +" ");
		}
		
		System.out.println();
		for(int i = 0; i < 10; i++) {
			System.out.print(num[i] +" ");
		}
		
		System.out.println();
		System.out.println(contPrimo +" "+ contNoPrimo);
		System.out.println("Array final:");
		for(int i = 0; i < 10; i++) {
			System.out.print(i +" ");
		}
		
		int primo[] = new int[contPrimo];
		int noPrimo[] = new int[contNoPrimo];
		
		System.out.println();
		
		for(int i = 0; i < 10; i++) {
			if(num[i] % num[i] == 0) {
				primo[contPrimo] = num[i];
				contPrimo++;
			} else {
				noPrimo[contNoPrimo] = num[i];
				contNoPrimo++;
			}
		}
		
		for(int i = 0; i < contPrimo; i++) {
			System.out.print(primo[i] +" ");
		}
		System.out.print(" ");
		for(int i = 0; i < contNoPrimo; i++) {
			System.out.print(noPrimo[i] +" ");
		}
	
	}
}
