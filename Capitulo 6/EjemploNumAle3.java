/**Ejemplo numeros aleatorios del 0 al 9.
*AmandaNR*/

public class EjemploNumAle3 {

	public static void main (String [] args) {
	
		System.out.println("15 numeros aleatorios entre 0 y 9");
		
		for (int i = 1; i <= 15; i++) {
			System.out.print((int)(Math.random()*10) +" ");
		}
	}
}
