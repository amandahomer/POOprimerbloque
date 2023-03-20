/**Ejemplo numeros aleatorios del 1 al 9.
*AmandaNR*/

public class EjemploNumAle4 {

	public static void main (String [] args) {
	
		System.out.println("15 numeros aleatorios entre 1 y 9");
		
		for (int i = 1; i <= 15; i++) {
			System.out.print((int)(Math.random()*10 + 1) +" ");
		}
	}
}
