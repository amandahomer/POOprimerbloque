/**Este programa genera numeros aleatorios pares entre 0 y 100
* hasta que sale el 24.
*@AmandaNR*/

public class Ejercicio9 {

	public static void main (String [] args) {
		
		int num = 0;
		int totalNum = 0;

		while(num != 24) {
			num = (int)(Math.random()*101);
			if(num % 2 == 0) {
				System.out.print(num +" ");
			}
			totalNum++;
		}
		
		System.out.println();
		System.out.println("Se han generado "+ totalNum + " numeros.");
			
	}
}
