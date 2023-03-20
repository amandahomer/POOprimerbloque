/**Este programa coloca a clientes en sus mesas.
*@AmandaNR*/

import java.util.Scanner;

public class Ejercicio15 {

	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		int[] mesas = new int[10];
		int personas;
		
		do {
		System.out.printf("%12s","Mesa nº: ");
		for(int i = 1; i < 11; i++) {
			System.out.print(i +" ");
		}
		
		System.out.println();
		
		System.out.printf("%12s","Ocupacion: ");
		for(int i = 0; i < 10; i++) {
			mesas[i] = (int)(Math.random()* 4 +1);
			System.out.print(mesas[i] +" ");
		}
		
		System.out.println();
		
		System.out.print("Introduce cuantas personas son, (Introduce -1 para salir): ");
		personas = s.nextInt();
		
		if(personas > 4) {
			System.out.println("Lo siento, no admitimos grupos de mas de 4 personas.");
		} else {
		
			int mesaVacia = 0;
			for(int i = 9; i >= 0; i--) {
				if(mesas[i] == 0) {
					mesaVacia = i;
					mesas[mesaVacia] = personas;
					System.out.print("Sientense en la mesa "+ mesaVacia);
				} else {
					int huecoVacio = 0;
					for(i = 9; i >= 0; i--) {
						if(personas <= (4 - mesas[i])) {
							huecoVacio = i;
							mesas[huecoVacio] += personas;
							System.out.println("Compartirán mesa. Sientense en la mesa "+ huecoVacio);
						} else {
							System.out.println("Lo siento, no queda sitio libre.");
						}
					}
				}
			}
		}
		} while(personas != 0);

	}
}
