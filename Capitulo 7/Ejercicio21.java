/**Este programa muestra un array de 15 numeros aleatorios y muestra
* un segundo array cincuerizado.
*@AmandaNR*/

public class Ejercicio21 {

	public static void main (String [] args) {
		
		int[] num = new int[15];
		
		System.out.println("Array original:");
		for(int i = 0; i < 15; i++) {
			num[i] = (int)(Math.random()* 501);
			System.out.print(num[i] +" ");
		}
		
		for(int i = 0; i < 15; i++) {
			while(num[i] % 5 != 0) {
				num[i]++;
			}
		}
		
		System.out.println();
		System.out.println("Resultado:");
		for(int i = 0; i < 15; i++) {
			System.out.print(num[i] +" ");
		}
		
	}
}
