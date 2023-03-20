/**Este programa pide 8 palabras, entre ellas colores y las ordena.
*@AmandaNR*/

import java.util.Scanner;

public class Ejercicio14 {

	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		String[] color = {"verde","rojo","azul","amarillo","naranja","rosa","negro","blanco","morado"};
		String[] respuesta = new String[8];
		int contColor = 0;
		int contResto = 0;
		int i;
		
		System.out.println("Introduce 8 palabras.");
		
		for(i = 0; i < 8; i++) {
			System.out.print("Palabras introducidas "+ i +", introduce una palabra: ");
			respuesta[i] = s.nextLine();
			if(respuesta[i].equals(color)) {
				contColor++;
			} else {
				contResto++;
			}
		}
		
		System.out.print("Palabras originales: ");
		for(i = 0; i < 8; i++) {
			System.out.print(respuesta[i] +" ");
		}
		
		System.out.println();
		
		String[] resultado = new String[contColor];
		String[] resto = new String[contResto];
		
		contColor = 0;
		contResto = 0;
		
		for(i = 0; i < 8; i++) {
			if(respuesta[i].equals(color)) {
				resultado[contColor] = respuesta[i];
				contColor++;
			} else {
				resto[contResto] = respuesta [i];
				contResto++;
			}
		}
		
		System.out.print("Palabras ordenadas: ");
		
		for(i = 0; i < contColor; i++){
			System.out.print(resultado[i]+ " ");
		}
		
		System.out.print("");
		
		for(i = 0; i < contResto; i++){
			System.out.print(resto[i]+ " ");
		}
		
	}
}
