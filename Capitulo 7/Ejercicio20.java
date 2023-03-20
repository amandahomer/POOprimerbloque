/**Este programa muestra la denominacion ordinal de los reyes que
*se introducen por pantalla.
*@AmandaNR*/

import java.util.Scanner;

public class Ejercicio20 {

	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca la cantidad de nombres que va a introducir: ");
		int num = s.nextInt();
		
		String[] reyes = new String[num];
		
		System.out.println("Introduzca los nombres de los reyes seguidos de INTRO:");		
		
		for(int i = 0; i < num; i++) {
			reyes[i] = s.nextLine();
			
		}
		
		System.out.println("Reyes introducidos:");
		
		for(int i = 0; i < num; i++) {
			int orden = 1;
			for(int j = 0; j < i; j++) {
				if(reyes[i].equals(reyes[j])) {
					orden++;
				}
			}
			
			System.out.println(reyes[i] +" "+ orden +"º");
		}
	
	}
}
