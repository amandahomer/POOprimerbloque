/**Este programa muestra al azar el nombre de una carta de la baraja
española.
*AmandaNR*/

public class Ejercicio3 {

	public static void main (String [] args) {
	
		int numeroPalo = (int)(Math.random()*4 + 1);
		
		String palo = "";
		switch(numeroPalo) {
			case 1:
			palo = "oro";
			break;
			case 2:
			palo = "espadas";
			break;
			case 3:
			palo = "copas";
			break;
			case 4:
			palo = "bastos";
			break;
			default:
		}
		
		int numeroCarta = (int)(Math.random()*10 + 1);
		
		String carta = "";
		switch(numeroCarta) {
			case 1:
			carta = "As";
			break;
			case 8:
			carta = "Sota";
			break;
			case 9:
			carta = "Caballo";
			break;
			case 10:
			carta = "Rey";
			break;
			default:
			carta = String.valueOf(numeroCarta);
		}
		
		System.out.print("Carta aleatoria de la baraja española: ");
		System.out.println(carta +" de "+ palo);
	
	}
}
