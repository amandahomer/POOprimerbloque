/**Este programa muestra un array y a continuacion da
*la posicion del  maximo y del minimo.
*@AmandaNR*/

public class Ejercicio5 {

	public static void main (String [] args) {
	
		int[][] num = new int[6][10];
		int fila = 0;
		int columna = 0;
		
		int min = 1000;
		int max = 0;
		
		int filaMin = 0;
		int columnaMin = 0;
		int filaMax = 0;
		int columnaMax = 0;
		
		for(fila = 0; fila < 6; fila++) {
			for(columna = 0; columna < 10; columna++) {
				num[fila][columna] = (int)(Math.random()* 1001);
				System.out.printf("%5d",num[fila][columna]);
				if(num[fila][columna] < min) {
					min = num[fila][columna];
					filaMin = fila;
					columnaMin = columna;
				}
				if(num[fila][columna] > max) {
					max = num[fila][columna];
					filaMax = fila;
					columnaMax = columna;
				}
			}
				
			System.out.println();
		}
		
		System.out.println("Maximo: "+ max +", fila "+ filaMax +" columna "+ columnaMax);
		System.out.println("Minimo: "+ min +", fila "+ filaMin +" columna "+ columnaMin);
		
	}
}
