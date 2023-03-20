/**Ejemplo numeros aleatorios del 0 al 10.
*AmandaNR*/

public class EjemploNumAle2 {

	public static void main (String [] args) {
	
		System.out.println("15 numeros aleatorios entre 0 y 10");
		System.out.println(" sin llegar a 10 (con decimales): ");
		
		for (int i = 1; i <= 15; i++) {
			System.out.println(Math.random()*10);
		}
	}
}
