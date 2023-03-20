/**Este programa muestra 20 numeros aleatorios y sus respectivos cuadrados y cubos.
*@AmandaNR*/

public class Ejercicio4 {

	public static void main (String [] args) {
		
		int[] numero = new int [20];
		int[] cuadrado = new int [20];
		int[] cubo = new int [20];
		
		int i = 0;
		while(i < 20) {
			numero[i] = (int)(Math.random()*101);
			cuadrado[i] = numero[i] * numero[i];
			cubo[i] = cuadrado[i] * numero[i];
			i++;
		}
		
		System.out.printf("|%10s|%10s|%10s|","Numero","Cuadrado","Cubo");
		System.out.println();
		System.out.printf("|%10s|%10s|%10s|","","","");
		System.out.println();
		
		i = 0;
		while(i < 20) {
			System.out.printf("|%10s|%10s|%10s|",numero[i],cuadrado[i],cubo[i]);
			System.out.println();
			i++;
		}
	
	}
}
