/**Este programa muestra con retardo 20 numeros aleatorios 
junto con las sumas de las filas, las columnas y el total.
*@AmandaNR*/

public class Ejercicio4 {

	public static void main (String [] args)
		
		throws InterruptedException {
		
		int[][] num = new int[4][5];
		int fila;
		int columna;
		
		for(fila = 0; fila < 4; fila++) {
			for(columna = 0; columna < 5; columna++) {
				num[fila][columna] = (int)(Math.random()* 1000 + 100);
			}
		}
		
		System.out.println();
		
		//muestra arrays y suma de cada fila.
		int sumaFila;
		for(fila = 0; fila < 4; fila++) {
			sumaFila = 0;
			for(columna = 0; columna < 5; columna++) {
				System.out.printf("%8d",num[fila][columna]);
				sumaFila += num[fila][columna];
				Thread.sleep(100);
			}
			System.out.printf("%8d", sumaFila);
			Thread.sleep(200);
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
			System.out.printf("%8d", sumaColumna);
			Thread.sleep(200);
		}
		
		System.out.printf("%8d", sumaTotal);
		Thread.sleep(400);
	
	}
}
