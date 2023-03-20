/**Escribe un programa que lea 10 números por teclado y que luego los muestre
en orden inverso, es decir, el primero que se introduce es el último en mostrarse
y viceversa.
*@AmandaNR*/

import java.util.Scanner;

public class Ejercicio3 {

	public static void main (String [] args) {
	
		Scanner s = new Scanner(System.in);
		
		int i = 0;
		int[] orden = new int[10];
		
		while(i <= 9) {
			System.out.print("Numeros introducidos: "+ i +" Introduce 10 numeros: ");
			orden[i] = s.nextInt();
			i++;
		}
		
		i = 9;
		System.out.print("Los numeros en orden inverso: ");
		while(i >= 0) {
			System.out.print(" "+ orden[i]);
			i--;
		} 
	
	}
}
