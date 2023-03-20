/**Este programa pinta una pecera con un pececito dentro.
*@AmandaNR*/

import java.util.Scanner;

public class Ejercicio17 {

	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca la altura de la pecera (minimo 4): ");
		int altura = s.nextInt();
		System.out.print("Introduzca la anchura (minimo 4): ");
		int ancho = s.nextInt();
		
		int pez = 0;
		int posicion = (int)(Math.random()* (altura - 2)*(ancho - 2));
		
		for(int i = 0; i < ancho; i++){
			System.out.print("*");
		}
		
		System.out.println();
		
		for(int i = 2; i < altura; i++){
			System.out.print("*");
			for(int j = 2; j < ancho; j++){
				if(pez == posicion) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
				pez ++;
			}
			System.out.println("*");
		}
		
		for(int i = 0; i <= ancho - 1; i++){
			System.out.print("*");
		}

	}
}
