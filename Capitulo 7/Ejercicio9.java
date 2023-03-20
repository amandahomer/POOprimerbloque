/**Este programa pide 8 numeros, los muestra e indica si es par o impar
*@AmandaNR*/

import java.util.Scanner;

public class Ejercicio9 {

	public static void main (String [] args){

		Scanner s = new Scanner (System.in);

		int [] numero = new int [8];
		
		System.out.println("Introduce 8 numeros.");
	
		for(int i = 0; i < 8; i++) {
			System.out.print("Numeros introducidos "+ i +", introduce un numero: ");
			numero[i] = s.nextInt();
		}
		
		for(int i = 0; i < 8; i++) {
			if(numero[i] % 2 == 0) {
				System.out.println(numero[i] +" Par");
			} else {
				System.out.println(numero[i] +" Impar");
			}
		}
	
	}
}
