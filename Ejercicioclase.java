/**Este programa detecta si hay brecha salarial entre hombres y mujeres.
*@AmandaNR*/

import java.util.Scanner;

public class Ejercicioclase {

	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce el numero de personas: ");
		int num = s.nextInt();
		
		int[][] array = new int[2][num];
		int fila;
		int columna;
		int sumaH = 0;
		int sumaM = 0;
		int numH = 0;
		int numM = 0;
		
		for(columna = 0; columna < num; columna++) {
			for(fila = 0; fila < 1; fila++) {
				//System.out.print("Introduce el genero de cada persona, (1-hombre 2-mujer): ");
				//array[0][columna] = s.nextInt();
				array[0][columna] = (int)(Math.random()* 2 + 1);
				array[1][columna] = (int)(Math.random()* 1001 + 1000);
				//System.out.print("Introduce el sueldo de cada persona: ");
				//array[1][columna] = s.nextInt();
				if(array[0][columna] == 1){
					numH++;
					sumaH += array[1][columna];
				} else {
					numM++;
					sumaM += array[1][columna];
				}
			}
		}
		
		for(fila = 0; fila < 2; fila++) {
			for(columna = 0; columna < num; columna++) {
				System.out.printf("%5s|",array[fila][columna]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Sueldo medio hombres: "+ sumaH / numH );
		System.out.println("Sueldo medio mujeres: "+ sumaM / numM);
		
		if((sumaH / numH) != (sumaM / numM)){
			System.out.println("Si hay brecha salarial");
		}
		
	}
}
