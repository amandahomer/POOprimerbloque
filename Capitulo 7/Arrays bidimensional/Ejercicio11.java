/**Este programa muestra un array de 10x10, los numeros que forman
*la diagonal, el maximo, el minimo y la media de la diagonal
*@AmandaNR*/

public class Ejercicio11 {

	public static void main (String [] args) {
		
		int[][] num = new int[10][10];
		int fila;
		int columna;
		int max = 200;
		int min = 300;
		int suma = 0;
		
		for(fila = 0; fila < 10; fila++) {
			for(columna = 0; columna < 10; columna++) {
				num[fila][columna] = (int)(Math.random()* 101 + 200);
				System.out.printf("%5d",num[fila][columna]);
			}
			System.out.println();
		}
		
		System.out.print("Numeros diagonal: ");
		for(fila = 0; fila < 10; fila++) {
			int numero = num[fila][fila];
			System.out.print(numero +" ");
			if(numero > max) {
				max = numero;
			}
			if(numero < min) {
				min = numero;
			}
			suma += numero;
		}
		
		System.out.println();
		System.out.println("Maximo: "+ max);
		System.out.println("Minimo: "+ min);
		System.out.println("Media: "+ suma / 10);
	
	}
}
