/**Biblioteca de funciones y ejercicios de arrays.
*@AmandaNR*/

import java.util.Scanner;

public class Ejercicio20 {

	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		//1 Genera un array
		System.out.print("Introduce el tamaño del array: ");
		int tam = s.nextInt();
		System.out.print("Introduce el numero minimo: ");
		int min = s.nextInt();
		System.out.print("Introduce el numero maximo: ");
		int max = s.nextInt();
		
		int[] array = new int[tam];
		
		generaArray(array, min, max);
		
		System.out.println();
		
		
		//2 Minimo array
		System.out.println("El numero minimo es: "+ minimoArray(array));
		
		
		//3 Maximo array
		System.out.println("El numero maximo es: "+ maximoArray(array));
		
		
		//4 Media array
		System.out.printf("La media es: %.2f", mediaDeArray(array));
		System.out.println();
		
		
		//5 Esta en array
		System.out.print("Introduce el numero que quieres buscar: ");
		int num = s.nextInt();
		
		if(estaEnArray(array, num)) {
			System.out.println("El numero "+ num +" esta en el array");
		} else {
			System.out.println("El numero "+ num +" no esta en el array");
		}
		
		
		
		//6 Posicion en array
		System.out.print("Introduce el numero del que quieras saber la posicion: ");
		int num1 = s.nextInt();
		
		System.out.println("El numero "+ num1 +" esta en la posicion: "+ posicionEnArray(array, num1));
		
		//7 Voltea un array
		System.out.println("El array volteado es: "+ volteaArray(array));
		
		
		
		//8 Rota a la derecha un array
		System.out.print("Introduzca cuantas posiciones quiere rotar el array: ");
		int num2 = s.nextInt();
		rotaDerechaArray(array, num2);
		
		
		
		//9 Rota a la izquierda un array
	
	}
	
	
	//Funciones
	
	//1 Genera un array
	/**Genera un array
	*@param a un array de numeros enteros 
	*@param min un numero entero
	*@param max un numero entero
	*/
	public static void generaArray(int a[], int min, int max) {
		
		for(int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()* (max - min + 1) + min);
			System.out.print(a[i] +" ");
		}
		
	}
	
	
	//2 Minimo array
	/**Numero minimo de un array
	*@param a un array de numeros enteros 
	*@param max un numero entero
	*/
	public static int minimoArray(int a[]) {
		
		int minimo = a[0];
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] < minimo) {
				minimo = a[i];
			}
		}
		
		return minimo;
		
	}
	
	
	//3 Maximo array
	/**Numero maximo de un array
	*@param a un array de numeros enteros 
	*@param min un numero entero
	*/
	public static int maximoArray(int a[]) {
		
		int maximo = a[0];
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] > maximo) {
				maximo = a[i];
			}
		}
		
		return maximo;
		
	}
	
	
	//4 Media array
	/**Media de un array
	*@param a un array de numeros enteros 
	*@return media un numero decimal
	*/
	public static double mediaDeArray(int[] a) {
		
		int suma = 0;
		
		for(int i = 0; i < a.length; i++) {
			suma += a[i];
		}
		
		double media = (double)suma / a.length;
		
		return media;
		
	}
	
	
	
	
	//5 Esta o no un numero en array
	/**Dice si un número esta o no dentro de un array.
	*@param a un array de numeros enteros 
	*@param n un numero entero
	*@return true si esta el numero 
	*@return false si no esta el numero
	*/
	public static boolean estaEnArray(int[] a, int n) {
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] == n) {
				return true;
			}
		}
		
		return false;
		
	}
	
	
	
	//6 Posicion en array
	/**Busca un número en un array y devuelve su posición
	*@param a un array de numeros enteros 
	*@param n un numero entero
	*@return posicion un numero entero
	*/
	public static int posicionEnArray(int[] a, int n) {
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] == n) {
				return i;
			} 
		}
		
		return -1;
		
	}
		
	
	
	//7 Voltea un array
	/**Le da la vuelta a un array
	*@param a un array de numeros enteros 
	*@return v un array de numeros enteros
	*/
	//No me sale el resultado
	public static int[] volteaArray(int[] a) {
		
		int[] v = new int[a.length];
		
		for(int i = 0; i < a.length; i++) {
			v[i] = a[a.length -1];
		}
		a = v;
		
		return v;
		
	}
	
		
		
	//8 Rota a la derecha un array
	/**Rota n posiciones a la derecha los números de un array.
	*@param a un array de numeros enteros 
	*@param n un numero entero
	*/
	public static void rotaDerechaArray(int[] a, int n) {
		
		for(int i = a.length - n; i > 0; i--) {
			a[i + n] = a[i];
		}
		
	} 
	
		
		
	//9 Rota a la izquierda un array
	/**Genera un array
	*@param a un array de numeros enteros 
	*@param min un numero entero
	*/
	
	
}
