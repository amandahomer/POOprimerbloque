/**Ejercicio 1 del 1 al 6.
*@AmandaNR*/

import java.util.Scanner;

public class Ejercicio+ {
	
	//Funciones:
	
	//Capicua
	/**@param numero, un numero entero.
	*@return true si el numero es capicua
	*@return false si el numero no es capicua*/
	public static boolean esCapicua(int numero) {
		boolean resultado = false;
		if(numero < 10) {
			resultado = true;
		}
		if ((numero >= 10) && (numero < 100)) {
			if ((numero / 10) == (numero % 10)) {
				resultado = true;
			}
		}
		if ((numero >= 100) && (numero <1000)) {
			if ((numero / 100) == (numero % 10)) {
				resultado = true;
			}
		}
		if ((numero >= 1000) && (numero < 10000)) {
			if (((numero / 1000) == (numero % 10)) && (((numero / 1000) % 10) == ((numero % 10) % 10))) {
					resultado = true;
			}
		}
	


	//Primo
	/**@param x un numero entero.
	*@return true si el numero es primo
	*@return false si el numero no es primo*/
	/*public static boolean esPrimo(int x) {
		boolean resultado = false;
		if(x % 2 == 0){
			resultado = true;
		}
	}
		
	public static int sigPrimo(int x) {
	}
	
	public static int potencia(int x) {
	}
	
	public static int digitos(int x) {
	}
	
	public static int voltea(int x) {
	}*/
	
		
		
		

	public static void main (String [] args) {
	
		Scanner s = new Scanner(System.in);
		
		int n;
		
		//Capicua
		System.out.print("Introduzca un numero");
		n = s.nextInt();
		if(esCapicua(n) == true) {
			System.out.println("El numero introducido es capicúa.");
		} else {
			System.out.println("El numero introducido no es capicúa.");
		}
		

		//Primo
		/*System.out.print("Introduzca un numero");
		n = s.nextInt();
		if(esPrimo(n) == true) {
			System.out.println("El numero introducido es par.");
		} else {
			System.out.println("El numero introducido no es par.");
		}*/
		

	}
}
