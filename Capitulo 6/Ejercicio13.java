/**Este programa simula la tirada de dos dados y no termina hasta
*que los dos dados saquen el mismo valor.
*@AmandaNR*/

public class Ejercicio13 {

	public static void main (String [] args) {
		
		int dado1 = 0;
		int dado2 = 1;
		
		while(dado1 != dado2) {
			dado1 = (int)(Math.random()* 6 + 1);
			dado2 = (int)(Math.random()* 6 + 1);
			System.out.println("Dado 1: "+ dado1 +"  Dado 2: "+ dado2);
		}
		
	}
}
