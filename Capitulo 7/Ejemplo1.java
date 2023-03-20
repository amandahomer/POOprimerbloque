/**Este programa muestra un array de 10 posiciones.
*@AmandaNR*/

import java.util.Scanner;

public class Ejemplo1 {

	public static void main (String [] args) {
		
	Scanner s = new Scanner(System.in);
	
	int[] num = new int [10];
	
	num[0] = (int)Math.pow(2, 0);
	num[1] = (int)Math.pow(2, 1);
	num[2] = (int)Math.pow(2, 2);
	num[3] = (int)Math.pow(2, 3);
	num[4] = (int)Math.pow(2, 4);
	num[5] = (int)Math.pow(2, 5);
	num[6] = num[2] * 10;
	num[7] = num[2] / 10;
	num[8] = num[0] + num[1] + num[2];
	num[9] = num[8];
	
	
	for (int i = 0; i < 10; i++) {
		System.out.println("Posicion: "+ i +" Valor: "+ num[i]);
	}
	
	System.out.println();
	
	System.out.println("¿Que posicion quieres que se muestre?");
	int posicion = s.nextInt();
	
	int opcion = 0;
	switch (posicion){
		case 0:
		opcion = num[0];
		break;
		case 1:
		opcion = num[1];
		break;
		case 2:
		opcion = num[2];
		break;
		case 3:
		opcion = num[3];
		break;
		case 4:
		opcion = num[4];
		break;
		case 5:
		opcion = num[5];
		break;
		case 6:
		opcion = num[6];
		break;
		case 7:
		opcion = num[7];
		break;
		case 8:
		opcion = num[8];
		break;
		case 9:
		opcion = num[9];
		break;
		default:
		System.out.println("Elige una posicion correcta (0 - 9)");
	}
	
	System.out.println("Posicion: "+ posicion +" Valor: "+ opcion);
	
	System.out.println();
	
	int suma = 0;
	
	System.out.println("Las posiciones pares son");
	
	for (int i = 0; i < 10; i++) {
		if (i % 2 == 0) {
			suma = suma + num[i];
			System.out.println("Posicion: "+ i +" Valor: "+ num[i]);
		}
	}
	
	System.out.println();
	
	System.out.println("La suma de las posiciones pares es: "+ suma);
	
	}
}
