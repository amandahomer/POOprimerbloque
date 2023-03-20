/**Este programa muestra 20 notas al azar y el numero que hay 
*de cada una.
*@AmandaNR*/

public class Ejercicio11 {

	public static void main (String [] args) {
		
		int suspensos = 0;
		int suficientes = 0;
		int bienes = 0;
		int notables = 0;
		int sobresalientes = 0;
		
		for(int i = 1; i <= 20; i++) {
			int nota = (int)(Math.random()* 5);
			switch(nota) {
				case 0:
				System.out.println("Suspenso");
				suspensos++;
				break;
				case 1:
				System.out.println("Suficiente");
				suficientes++;
				break;
				case 2:
				System.out.println("Bien");
				bienes++;
				break;
				case 3:
				System.out.println("Notable");
				notables++;
				break;
				case 4:
				System.out.println("Sobresaliente");
				sobresalientes++;
				break;
				default:
			}	
		}
		
		System.out.println();
		System.out.println("Suspensos: "+ suspensos);
		System.out.println("Suficientes: "+ suficientes);
		System.out.println("Bienes: "+ bienes);
		System.out.println("Notables: "+ notables);
		System.out.println("Sobresalientes: "+ sobresalientes);
	
	}
}
