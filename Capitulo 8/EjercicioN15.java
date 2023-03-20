/**Este programa crea un array de tamaño 100 con los primeros 100 números
naturales. Luego muestra la suma total y la media. Implementa una función
*que calcule la suma de un array y otra que calcule la media de un array.
*@AmandaNR*/

import misFunciones.FunArrays;

public class EjercicioN15 {

	public static void main (String [] args) {
		
		int[] array = new int[100];
		
		
		for(int i = 0; i < 100; i++) {
			array[i] = i + 1;
			System.out.print(array[i] +" ");
		}
		
		System.out.println();
		
		System.out.println("La suma es: "+ misFunciones.FunArrays.sumaArray(array));
		System.out.println("La media es: "+ misFunciones.FunArrays.mediaArray(array));
	
	}
}
