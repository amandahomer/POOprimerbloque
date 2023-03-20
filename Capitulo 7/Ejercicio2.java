/**Este programa muestra un array de 10 caracteres.
*@AmandaNR*/

public class Ejercicio2 {

	public static void main (String [] args) {
	
	char[] simbolo = new char[10];
	
	simbolo[0] = 'a';
	simbolo[1] = 'x';
	simbolo[4] = '@';
	simbolo[6] = ' ';
	simbolo[7] = '+';
	simbolo[8] = 'Q';
	
	System.out.println("Los valores del array son: ");
	
	for(int i = 0; i < 10; i++){
		System.out.print(simbolo[i] +" ");
	}
	
/*¿Qué sucede con los valores de los elementos que no
han sido inicializados?
*Los valores de los elementos no inicializados aparecen como espacios.*/
	
	}
}
