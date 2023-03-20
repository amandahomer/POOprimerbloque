/**Este programa muestra un menú con 4 opciones. En todas se le pedirá 
*al usuario que introduzca un radio y luego se le mostrará el cálculo 
*oportuno. Implementando funciones.
*@AmandaNR*/

import misFunciones.FunGeometricas;
import java.util.Scanner;

public class EjercicioN21M2 {

	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		misFunciones.FunGeometricas.menu();
		int opcion = s.nextInt();
		
		misFunciones.FunGeometricas.pideRadio();
		double radio = s.nextDouble();
		System.out.println();
		
		switch(opcion) {
			case 1:
			System.out.printf("La circunferencia es: %.2f", misFunciones.FunGeometricas.circunferencia(radio));
			break;
			case 2:
			System.out.printf("El area es: %.2f", misFunciones.FunGeometricas.area(radio));
			break;
			case 3:
			System.out.printf("El volumen es: %.2f", misFunciones.FunGeometricas.volumen(radio));
			break;
			case 4:
			System.out.printf("La circunferencia es: %.2f\n", misFunciones.FunGeometricas.circunferencia(radio));
			System.out.printf("El area es: %.2f\n", misFunciones.FunGeometricas.area(radio));
			System.out.printf("El volumen es: %.2f\n", misFunciones.FunGeometricas.volumen(radio));
			break;
			default:
		}
	}
}
