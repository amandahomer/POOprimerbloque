/**Este programa genera una melodia de 4 compases.
*@AmandaNR*/

public class Ejercicio15 {

	public static void main (String [] args) {
		
		int melodia = 4 * (int)(Math.random()* 8 + 1);
		
		for(int i = 1; i <= melodia; i++) {
			
			for(int compas = 1; compas <= 4; compas++) {
				int nota = (int)(Math.random()* 7);
				switch(nota) {
					case 0:
					System.out.print(" do ");
					break;
					case 1:
					System.out.print(" re ");
					break;
					case 2:
					System.out.print(" mi ");
					break;
					case 3:
					System.out.print(" fa ");
					break;
					case 4:
					System.out.print(" sol ");
					break;
					case 5:
					System.out.print(" la ");
					break;
					case 6:
					System.out.print(" si ");
					break;
					default:
				}
			}
			
			System.out.print("|");
				
			}
			
			System.out.print("|");
	
	}
}
