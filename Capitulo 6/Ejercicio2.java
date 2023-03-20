/**Este programa muestra al azar el nombre de una carta de la baraja
francesa.
*AmandaNR*/

public class Ejercicio2 {

	public static void main (String [] args) {
	
		int numeroPalo = (int)(Math.random()*4 + 1);
		
		String palo = "";
		switch(numeroPalo) {
			case 1:
			palo = "picas";
			break;
			case 2:
			palo = "corazones";
			break;
			case 3:
			palo = "diamantes";
			break;
			case 4:
			palo = "treboles";
			break;
			default:
		}
		
		int numeroCarta = (int)(Math.random()*13 + 1);
		
		String carta = "";
		switch(numeroCarta) {
			case 1:
			carta = "As";
			break;
			case 11:
			carta = "J";
			break;
			case 12:
			carta = "Q";
			break;
			case 13:
			carta = "K";
			break;
			default:
			carta = String.valueOf(numeroCarta);
		}
		
		System.out.print("Carta aleatoria de la baraja francesa: ");
		System.out.println(carta +" de "+ palo);
	
	}
}
