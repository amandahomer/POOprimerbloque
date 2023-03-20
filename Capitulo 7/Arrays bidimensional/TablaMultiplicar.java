/**Este programa muestra las tablas de multiplicar.
*@AmandaNR*/

public class TablaMultiplicar {

	public static void main (String [] args) {
		
		int fila;
		int columna;
		int[][] num = new int [11][11];
		
		for(fila = 1; fila < 11; fila++){
			for(columna = 1; columna < 11; columna++) {
				num[fila][columna] = fila * columna;
			}
		}
		
		System.out.println();
		
		for(columna = 1; columna < 11; columna++) {
			for(fila = 1; fila < 11; fila++) {
				System.out.printf("%5s",num[fila][columna]);
			}
			System.out.println();
		}
	
	}
}
