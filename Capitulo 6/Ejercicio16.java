/**Este ejercicio simula una maquina tragaperras.
*@AmandaNR*/

public class Ejercicio16 {

	public static void main (String [] args) {
		
		int figura1 = 0;
		int figura2 = 0;
		int figura3 = 0;
		
		for(int tirada = 1; tirada <= 3; tirada++) {
			int figura = (int)(Math.random()* 5);
			switch(figura) {
				case 0:
				System.out.print("Corazon ");
				break;
				case 1:
				System.out.print("Diamante ");
				break;
				case 2:
				System.out.print("Herradura ");
				break;
				case 3:
				System.out.print("Campana ");
				break;
				case 4:
				System.out.print("Limon ");
				break;
				default:
			}
			
			switch(tirada) {
				case 1:
				figura1 = figura;
				break;
				case 2:
				figura2 = figura;
				break;
				case 3:
				figura3 = figura;
				break;
				default:
			}
			
		}
		
		System.out.println();
		
		if((figura1 != figura2) && (figura2 != figura3) && (figura1 != figura3)) {
			System.out.println("Lo siento, ha perdido.");
		} else if((figura1 == figura2) && (figura2 == figura3)) {
			System.out.println("¡Enhorabuena! Ha ganado 10 monedas.");
		} else {
			System.out.println("Bien, ha recuperado su moneda.");
		}
	
	}
}
