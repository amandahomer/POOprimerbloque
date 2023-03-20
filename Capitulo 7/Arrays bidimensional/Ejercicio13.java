/**Este programa calcula la estatra media, minima y maxima de diferentes
*paises.
*@AmandaNR*/

public class Ejercicio13 {

	public static void main (String [] args) {
	
		String[] pais = {"España","Rusia","Japon","Australia"};
	
		int[][] estatura = new int[4][10];
		int fila;
		int columna;
		int suma;
		int min = 210;
		int max = 140;
	
		for(fila = 0; fila < 4; fila++) {
			for(columna = 0; columna < 10; columna++) {
				estatura[fila][columna] = (int)(Math.random()* 71 + 140);
			}
			System.out.println();
		}
	
		for(fila = 0; fila < 4; fila++) {
			suma = 0;
			min = 210;
			max = 140;
			System.out.printf("%10s: ",pais[fila]);
			for(columna = 0; columna < 10; columna++) {
				System.out.printf("%5s",estatura[fila][columna]);
				if(estatura[fila][columna] < min){
					min = estatura[fila][columna];
				}
				if(estatura[fila][columna] > max){
					max = estatura[fila][columna];
				}
				suma += estatura[fila][columna];
			}
			System.out.print("| Media: "+ suma / 10);
			System.out.print(" | Minima: "+ min);
			System.out.println(" | Maxima: "+ max +"|");
		}
	
	}
}
