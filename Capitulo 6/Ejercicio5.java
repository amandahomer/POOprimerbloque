/**Este programa muestra 50 numeros aleatorios entre 100 y 199
*y el maximo, el minimo y la media.
*AmandaNR*/

public class Ejercicio5 {

	public static void main (String [] args) {
	
		System.out.println("Muestra 50 numeros entre 100 y 199");
		
		int numero;
		int suma = 0;
		int minimo = 199;
		int maximo = 100;
		
		for (int i = 1; i <= 50; i++) {
			numero = (int)(Math.random()*100 + 100);
			System.out.print(numero +" ");
			suma += numero;
			
			if(numero < minimo) {
				minimo = numero;
			}
			
			if(numero > maximo) {
				maximo = numero;
			}
		}
		
		int media = suma / 50;
		
		System.out.println("");
		System.out.println("El maximo es: " + maximo);
		System.out.println("El minimo es: " + minimo);
		System.out.println("La media de estos numeros es: "+ media);
	
	}
}
