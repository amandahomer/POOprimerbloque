/**Este programa muestra los números primos que hay entre 1 y 1000
*@AmandaNR*/

public class Ejercicio15 {

	public static void main (String [] args) {
	
	
		for(int i = 1; i < 1001; i++) {
			if(esPrimo(i)) {
				System.out.print(i +" ");
			}
		}
	
	}
	
	
	//Funcion
	/**Dice si es primo o no
	*@param x un numero entero
	*@return true si el numero es primo
	*@return false si el numero no es primo
	*/
	public static boolean esPrimo(int x) {
		
		boolean esPrimo = true;
		
		if(x == 0 || x == 1 || x == 4){
			esPrimo = false;
		} 
		
		for (int i = 2; i < x / 2; i++) {
			if (x % i == 0) {
				esPrimo = false;
			}
		}
		return esPrimo;
	}
		
	
}
