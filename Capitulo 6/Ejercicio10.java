/**Este programa pinta diez lineas de longitud aleatoria
*formadas por caracteres aleatorios.
*@AmandaNR*/

public class Ejercicio10 {

	public static void main (String [] args) {
		
		for(int linea = 1; linea <= 10; linea++) {
			
			int longitud = (int)(Math.random()* 40 + 1);
			int caracter = (int)(Math.random()* 6);
			
			for(int l = 1; l <= longitud; l++) {
				
				switch(caracter){
					case 0:
					System.out.print("*");
					break;
					case 1:
					System.out.print("-");
					break;
					case 2:
					System.out.print("=");
					break;
					case 3:
					System.out.print(".");
					break;
					case 4:
					System.out.print("|");
					break;
					case 5:
					System.out.print("@");
					break;
					default:
				}
			}
			
			System.out.println();
		}
		
	}
}
