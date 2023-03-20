/**Este programa muestra la tirada de tres dados y la suma total de estos.
*AmandaNR*/

public class Ejercicio1 {

	public static void main (String [] args) {
	
		System.out.println("Muestra la tirada de tres dados.");
		
		int suma = 0;
		int dados;
		
		for (int i = 1; i <= 3; i++) {
			dados = (int)(Math.random()*6) + 1;
			System.out.println(dados +" ");
			suma = suma + dados;
		}
		
		System.out.println("La suma es: "+ suma);
		
	}
}
