/**Ejercicio 1 del 1 al 6.
*@AmandaNR*/

import java.util.Scanner;

public class Ejercicio1 {

	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
		int n;
		
		//1 Capicua
		System.out.println("1. Capicua");
		System.out.print("Introduzca un numero para saber si es capicua: ");
		n = s.nextInt();
		
		if(esCapicua(n)){
			System.out.println("El numero "+ n +" es capicua");
		} else {
			System.out.println("El numero "+ n +" no es capicua");
		}
		
		
		//2 Primo
		System.out.println("2. Primo");
		System.out.print("Introduzca un numero para saber si es primo o no: ");
		n = s.nextInt();
		if(esPrimo(n)) {
			System.out.println("El numero "+ n +" es primo");
		} else {
			System.out.println("El numero "+ n +" no es primo");
		}
		
		
		//3 Siguiente Primo
		System.out.println("3. Siguiente Primo");
		System.out.print("Introduzca un numero para saber el siguiente numero primo: ");
		n = s.nextInt();
		
		System.out.println("El numero primo que le sigue a "+ n +" es: "+ sigPrimo(n));
		
		
		//4 Potencia
		System.out.println("4. Potencia");
		System.out.print("Para calcular la potencia, introduce la base: ");
		int base = s.nextInt();
		System.out.print("Introduce el exponente: ");
		int exponente = s.nextInt();
		
		System.out.println(base +" elevado a "+ exponente +" = "+ potencia(base, exponente));
		
		
		//5 Digitos
		System.out.println("5. Digitos");
		System.out.print("Introduce un numero para saber cuantos digitos tiene: ");
		n = s.nextInt();
		
		System.out.println("El numero "+ n +" tiene "+ digitos(n) +" digitos.");
		
		
		//6 Voltea
		System.out.println("6. Voltea");
		System.out.print("Introduce un numero para invertirlo: ");
		n = s.nextInt();
		
		System.out.println("El numero "+ n +" invertido es: "+ voltea(n));
		
		
		//7 Digito en una posicion
		System.out.println("7. Digito en una posicion");
		System.out.print("Introduce un numero: ");
		n = s.nextInt();
		System.out.print("Introduce una posicion de ese numero (empieza por 0, de izq a derech): ");
		int posicion = s.nextInt();
		
		System.out.println("El numero que esta en la posicion "+ posicion +"es: "+ digitoPosicion(n, posicion));
		
		
		//8 Posicion de un digito
		System.out.println("8. Posicion de un digito");
		System.out.print("Introduce un numero: ");
		n = s.nextInt();
		System.out.print("Introduce el digito del que quieras saber la posicion: ");
		int digito = s.nextInt();
		
		System.out.println("El digito "+ digito +" esta en la posicion: "+ posicionDigito(n, digito));
		
		
		//9 Quita por detras
		System.out.println("9. Quita por detras");
		System.out.print("Introduce un numero: ");
		n = s.nextInt();
		System.out.print("Introduce la cantidad de digitos que quieres quitar por detras: ");
		int dig = s.nextInt();
		
		System.out.println("El resultado es: "+ quitaPorDetras(n, dig));
		
		
		//10 Quita por delante
		System.out.println("10. Quita por delante");
		System.out.print("Introduce un numero: ");
		n = s.nextInt();
		System.out.print("Introduce la cantidad de digitos que quieres quitar por delante: ");
		dig = s.nextInt();
		
		System.out.println("El resultado es: "+ quitaPorDelante(n, dig));
		
		
		//11 Pega por detras
		System.out.println("11. Pega por detras");
		System.out.print("Introduce un numero: ");
		n = s.nextInt();
		System.out.print("Introduce el numero que quieres pegar por detras: ");
		dig = s.nextInt();
		
		System.out.println("El resultado es: " + pegaPorDetras(n, dig));
		
		
		//12 Pega por delante
		System.out.println("12. Pega por delante");
		System.out.print("Introduce un numero: ");
		n = s.nextInt();
		System.out.print("Introduce el numero que quieres pegar por delante: ");
		dig = s.nextInt();
		
		System.out.println("El resultado es: " + pegaPorDelante(n, dig));
		
		
		//13 Trozo de numero
		System.out.println("13. Trozo de numero");
		System.out.print("Introduce un numero: ");
		n = s.nextInt();
		
		System.out.println("El trozo de numero es: "+ trozoNumero(n));
		
		
		//14 Junta numeros
		System.out.println("14. Junta numeros");
		System.out.print("Introduce un numero: ");
		n = s.nextInt();
		System.out.print("Introduce otro numero para juntarlo : ");
		int num = s.nextInt();
		
		System.out.println("El resultado es: " + pegaPorDelante(n, num));
		
	}
	
	
	
	//Funciones:
	
	
	//1 Capicua
	/**Devuelve verdadero si el número que se pasa como 
	*parámetro es capicúa y falso en caso contrario.
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
	
	
	//2 Primo
	/**Devuelve verdadero si el número que se pasa 
	*como parámetro es primo y falso en caso contrario
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
	
	
	//3 Siguiente primo
	/**Devuelve el menor primo que es mayor al número 
	*que se pasa como parámetro.
 	*@param x un numero entero
	*@return sig un numero entero
	*/
	public static int sigPrimo(int x) {
		
		x++;
		
		while(!esPrimo(x)) {
			x++;
		}
		return x;
	}
	
	
	//4 Potencia
	/**Dada una base y un exponente devuelve la potencia
	*@param x un numero entero
	*@param y un numero entero
	*@return potencia un numero entero
	*/
	public static int potencia(int x, int y) {
		
		int potencia = 1;
		
		if (y == 0) {
			potencia = 1;
		}
		
		if (y > 0) {
			for (int i = 0; i < y; i++) {
				potencia = potencia * x;
			}
		}
		
		if (y < 0) {
			System.out.println("Introduce numeros enteros positivos.");
		}
		
		return potencia;
		
	}
	
	
	//5 Digitos
	/**Cuenta el número de dígitos de un número entero
	*@param x un numero entero
	*@return digitos un numero entero
	*/
	public static int digitos(int x) {
		
		int digitos = 1;
		
		while (x > 10){
			digitos++;
			x = x / 10;
		}
		
		return digitos;
	
	}
	
	
	//6 Voltea
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
	
	
	//7 Digito en una posicion
	/**Devuelve el dígito que está en la posición n de un 
	*número entero. Se empieza contando por el 0 y de izquierda 
	*a derecha.
	*@param x un numero entero
	*@param p un numero entero
	*@return un numero entero
	*/
	public static int digitoPosicion(int x, int p) {
		
		x = voltea(x);
		
		for(int i = 0; i < p; i++){
			x /= 10;
		}
			
		return x % 10;
			
	}
		
	
	//8 Posicion de un digito
	/**Da la posición de la primera ocurrencia de un dígito
	*dentro de un número entero. Si no se encuentra, devuelve -1.
	*@param x un numero entero
	*@param dig un numero entero
	*@return un numero entero
	*/
	public static int posicionDigito(int x, int dig) {
		
		int digitos = digitos(x);
		
		for(int i = 0; i < digitos; i++) {
			if(x % 10 == dig){
				return (digitos - i);
			}
			x /= 10;
		}
		return -1;
	}
	
	
	//9 Quita por detras
	/**Le quita a un número n dígitos por detrás (por la derecha).
	*@param x un numero entero
	*@param quitaDig un numero entero
	*@return x un numero entero
	*/
	public static int quitaPorDetras(int x, int quitaDig) {
		
		for (int i = 0; i < quitaDig; i++) {
			x /= 10;
		}
		
		return x;
		
	}
	
	
	//10 Quita por delante
	/**Le quita a un número n dígitos por delante (por la izquierda).
	*@param x un numero entero
	*@param quitaDig un numero entero
	*@return x un numero entero
	*/
	public static int quitaPorDelante(int x, int quitaDig) {
		
		x = voltea(x);
		
		for (int i = 0; i < quitaDig; i++) {
			x /= 10;
		}
		
		x = voltea(x);
		return x;
		
	}
	
	
	//11 Pega por detras
	/**Añade un dígito a un número por detrás.
	*@param x un numero entero
	*@param pegaDig un numero entero
	*@return s un string
	*/
	public static String pegaPorDetras(int x, int pegaDig) {
		
		String s = "" + x + pegaDig;
		
		return s;
		
	}
	
	
	//12 Pega por delante
	/**Añade un dígito a un número por delante.
	*@param x un numero entero
	*@param pegaDig un numero entero
	*@return s un string
	*/
	public static String pegaPorDelante(int x, int pegaDig) {
		
		String s = "" + pegaDig + x;
		
		return s;
		
	}
	
	
	//13 Trozo de numero
	/**Añade un dígito a un número por delante.
	*@param x un numero entero
	*@return tz un numero entero
	*/
	public static int trozoNumero(int x) {
		
		x /= 10;
		x = voltea(x);
		
		x /= 10;
		x = voltea(x);
		
		return x;
		
	}
	
	
	//14 Junta numeros
	/**Añade un dígito a un número por delante.
	*@param x un numero entero
	*@param y un numero entero
	*@return s un string
	*/
	public static String juntaNumeros(int x, int y) {
		
		String s = "" + x + y;
		
		return s;
		
	}
		

	

}
