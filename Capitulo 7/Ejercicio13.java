/**Este programa genera 100 numeros y pregunta si se quiere destacar el
*numero minimo o el maximo.
*@AmandaNR*/

import java.util.Scanner;

public class Ejercicio13 {

	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		int tam = 100;
		int[] num = new int[tam];
		int min = 500;
		int max = 0;
		
		for(int i = 0; i < tam; i++) {
			num[i] = (int)(Math.random()* 501);
			System.out.print(num[i] +" ");
			if(num[i] < min){
				min = num[i];
			}
			if(num[i] > max) {
				max = num[i];
			}
		}
		
		System.out.println();
		
		System.out.print("¿Que quieres destacar? (1-Maximo, 2-Minimo): ");
		int opcion = s.nextInt();
		
		int destacado;
		
		if(opcion == 1) {
			destacado = max;
		} else {
			destacado = min;
		}
		
		System.out.println();
		
		for(int i = 0; i < tam; i++) {
			if(num[i] == destacado) {
				System.out.print(" **"+ num[i] +"** ");
			} else {
				System.out.print( num[i] +" ");
			}
		}
		
	}
}
