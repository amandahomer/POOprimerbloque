package misFunciones;
/**Funciones
*@AmandaNR*/

public class FunMatematicas {
	
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
	
	
	//N1 Multiplica dos numeros
	/**
	*@param a un numero decimal
	*@param b un numero decimal
	*@return m un numero decimal
	*/
	public static double multiplica(double a, double b) {
		
		double m = a * b;
		
		return m;
		
	}
	
	
	//N3 Minimo
	/**
	*@param a un numero entero
	*@param b un numero entero
	*@return min un numero entero
	*/
	public static int minimo(int a, int b) {
		
		int min;
		
		if(a < b) {
			min = a;
		} else {
			min = b;
		}
		
		return min;
		
	}
	
	
	//N4 Dice el signo
	/**
	*@param a un numero entero
	*@return signo un numero entero
	*/
	public static int dimeSigno(int a) {
		
		int signo;
		
		if(a == 0){
			signo = 0;
		} else if(a < 0){
			signo = -1;
		} else {
			signo = 1;
		}
		
		return signo;
		
	}
	
	
	//N8 Sumatorio de 1 a N
	/**
	*@param a un numero entero
	*@return suma un numero entero
	*/
	public static int suma1aN(int a) {
		
		int suma = 0;
		
		for(int i = 0; i <= a; i++) {
			suma += i;
		}
		
		return suma;
		
	}
	
	
	
	//N8 Factorial de 1 a N
	/**
	*@param a un numero entero
	*@return factorial un numero entero
	*/
	public static int producto1aN(int a) {
		
		int factorial = 1;
		
		for(int i = 1; i <= a; i++) {
			factorial *= i;
		}
		
		return factorial;
		
	}
	
	
	
	//N8 Valor intermedio de 1 a N
	/**
	*@param a un numero entero
	*@return intermedio un numero decimal
	*/
	public static double intermedio1aN(int a) {
		
		double intermedio = (double)a / 2;
		
		return intermedio;
		
	}
	
	
	//N9 Maximo
	/**
	*@param a un numero entero
	*@param b un numero entero
	*@return max un numero entero
	*/
	public static int maximo(int a, int b) {
		
		int max;
		
		if(a > b) {
			max = a;
		} else {
			max = b;
		}
		
		return max;
		
	}
	
	
	//N11 Tabla de multiplicar
	/**
	*@param a un numero entero
	*@return tabla de multiplicar de a
	*/
	public static void tablaMult(int a) {
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(a +" x "+ i +" = "+ a * i);
		}
		
	}
	
	
	//N17 NIF del DNI
	/**
	*@param n un numero entero
	*@return letra un caracter
	*/
	public static char nifDeDNI(int n) {
		
		int nif = n % 23;
		
		char letra = ' ';
		switch(nif) {
			case 0:
			letra = 'T';
			break;
			case 1:
			letra = 'R';
			break;
			case 2:
			letra = 'W';
			break;
			case 3:
			letra = 'A';
			break;
			case 4:
			letra = 'G';
			break;
			case 5:
			letra = 'M';
			break;
			case 6:
			letra = 'Y';
			break;
			case 7:
			letra = 'F';
			break;
			case 8:
			letra = 'P';
			break;
			case 9:
			letra = 'D';
			break;
			case 10:
			letra = 'X';
			break;
			case 11:
			letra = 'B';
			break;
			case 12:
			letra = 'N';
			break;
			case 13:
			letra = 'J';
			break;
			case 14:
			letra = 'Z';
			break;
			case 15:
			letra = 'S';
			break;
			case 16:
			letra = 'Q';
			break;
			case 17:
			letra = 'V';
			break;
			case 18:
			letra = 'H';
			break;
			case 19:
			letra = 'L';
			break;
			case 20:
			letra = 'C';
			break;
			case 21:
			letra = 'K';
			break;
			case 22:
			letra = 'E';
			break;
			default:
		}
		
		return letra;
		
	}
	
	
}
