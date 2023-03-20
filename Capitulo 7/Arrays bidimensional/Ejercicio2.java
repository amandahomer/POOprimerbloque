/**Este programa pide 20 numeros y los muestra junto con las
*sumas de las filas, las columnas y el total.
*@AmandaNR*/

import java.util.Scanner;

public class Ejercicio2 {

	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		int[][] num = new int[4][5];
		int fila;
		int columna;
		
		for(fila = 0; fila < 4; fila++) {
			for(columna = 0; columna < 5; columna++) {
				System.out.print("Introduce 20 numeros. Fila "+ fila +" Columna "+ columna +": ");
				num[fila][columna] = s.nextInt();
			}
		}
		
		System.out.println();
		
		//muestra arrays y suma de cada fila.
		int sumaFila;
		for(fila = 0; fila < 4; fila++) {
			sumaFila = 0;
			for(columna = 0; columna < 5; columna++) {
				System.out.printf("%5d",num[fila][columna]);
				sumaFila += num[fila][columna];
			}
			System.out.printf("%5d", sumaFila);
			System.out.println();
		}
		//muestra suma de cada columna.
		int sumaColumna;
		int sumaTotal = 0;
		for(columna = 0; columna < 5; columna++) {
			sumaColumna = 0;
			for(fila = 0; fila < 4; fila++) {
				sumaColumna += num[fila][columna];
			}
			sumaTotal += sumaColumna;
			System.out.printf("%5d", sumaColumna);
		}
		
		System.out.printf("%5d", sumaTotal);
	
	}
}
