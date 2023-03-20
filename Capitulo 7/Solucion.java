/**Este programa muestra una tabla de numeros.
*@AmandaNR*/

public class Solucion {

	public static void main (String [] args) {
		
		int fila;
		int columna;
		int[][] num = new int [10][5];
		int a = 0;
		
		for(fila = 0; fila < 10; fila++){
			for(columna = 0; columna < 5; columna++) {
				num[fila][columna] = a;
				a += 2;
			}
		}
		
		System.out.println();
		
		for(columna = 0; columna < 5; columna++) {
			for(fila = 0; fila < 10; fila++) {
				System.out.print(num[fila][columna] +" ");
			}
			System.out.println();
		}
		
	}
}
