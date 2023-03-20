/**Muestra 20 numeros aleatorios del 0 al 10 separados por espacios
*AmandaNR*/

public class Ejercicio4 {

	public static void main (String [] args) {
	
		System.out.println("Muestra 20 numeros aleatorios entre 0 y 10");
		
		for (int i = 1; i <= 20; i++) {
			System.out.print((int)(Math.random()*11) +" ");
		}
	
	}
}
