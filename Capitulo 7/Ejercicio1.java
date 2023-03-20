/**Este programa muestra un array de 12 numeros.
*@AmandaNR*/

public class Ejercicio1 {

	public static void main (String [] args) {
	
	int[] num = new int [12];
	
	num[0] = 39;
	num[1] = -2;
	num[4] = 0;
	num[6] = 14;
	num[8] = 5;
	num[9] = 120;
	
	System.out.println("Los valores del array son: ");
	
	for(int i = 0; i < 12; i++){
		System.out.print(num[i] +" ");
	}
	
/*¿Qué sucede con los valores de los elementos que no
han sido inicializados?
*Los valores de los elementos no inicializados son ceros.*/
	
	}
}
