/**Este programa muestra los números capicúa que hay entre 1 y 99999
*@AmandaNR*/

public class Ejercicio16 {

	public static void main (String [] args) {
		
		for(int i = 1; i < 100000; i++) {
			if(esCapicua(i)) {
				System.out.print(i +" ");
			}
		}
	
	}
	
	
	//Funciones
	
	/**Le da la vuelta a un número.
	*@param x un numero entero
	*@return voltea un numero entero
	*/
	public static int voltea(int x) {
		
		int voltea = 0;
		
		while(x > 0) {
			voltea = (voltea * 10) + (x % 10);
			x /= 10;
		}
		
		return voltea;
		
	}
	
	
	/**Dice si un numero es capicua o no.
	*@param x un numero entero
	*@return true si el numero es capicua
	*@return false si el numero no es capicua
	*/
	public static boolean esCapicua(int x) {
		
		boolean esCapicua = false;
		
		if(voltea(x) == x) {
			esCapicua = true;
		}
		
		return esCapicua;
		
	}
}
