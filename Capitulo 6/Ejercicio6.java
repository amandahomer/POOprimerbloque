/**Este programa piensa un numero al azar entre 0 y 100
*y el usuario debe adivinarlo en 5 intentos.
*@AmandaNR*/

import java.util.Scanner;

public class Ejercicio6 {

	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		int numSecret = (int)(Math.random()*101);
		int intentos = 5;
		
		for(int i = 1; i <= 5; i++) {
			System.out.print("Adivina el numero que estoy pensando (de 0 a 100): ");
			int num = s.nextInt();
			intentos--;
			
			if(intentos == 0) {
				System.out.println("No has acertado. El numero que he pensado es el "+ numSecret);
			}
			
			if((num < numSecret) && (intentos > 0)) {
				System.out.println("El numero secreto es mayor que el numero introducido.");
				if(intentos == 1){
					System.out.println("Te queda "+ intentos +" oportunidad.");
				} else {
				System.out.println("Te quedan "+ intentos +" oportunidades.");
				}
			}
			
			if((num > numSecret) && (intentos > 0)) {
				System.out.println("El numero secreto es menor que el numero introducido.");
				if(intentos == 1){
					System.out.println("Te queda "+ intentos +" oportunidad.");
				} else {
				System.out.println("Te quedan "+ intentos +" oportunidades.");
				}
			}
			
			if(num == numSecret) {
				System.out.println("¡Enhorabuena! Has acertado.");
			}
		}
		
	}
}
