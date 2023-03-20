/**Este programa muestre por pantalla un triángulo. Deberá recibir dos 
*parámetros: el carácter que se desea imprimir y el número de líneas del
*triángulo.
*@AmandaNR*/

import java.util.Scanner;
import misFunciones.FunMatematicas;

public class EjercicioN14 {

	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Pide la altura y el caracter para dibujar un triangulo.");
		System.out.print("Introduce un numero: ");
		int num = s.nextInt();
		System.out.print("Introduce un caracter: ");
		String caracter = s.next();
		
		misFunciones.FunGeometricas.dibujaTriangulo(num, caracter);
	
	}
}
