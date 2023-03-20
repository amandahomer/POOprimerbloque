/**Este programa muestra una y otra vez un menú con 5 opciones. 
*En todas se le pedirá al usuario que introduzca un radio y luego 
*se le mostrará el cálculo oportuno. Implementando funciones.
*@AmandaNR*/

//No se como evitar que me pida el radio al elegir la opcion 5 (salir).

import misFunciones.FunGeometricas;
import java.util.Scanner;

public class EjercicioN21M3 {

	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		int opcion = 0;
		while(opcion != 5) {
			
		misFunciones.FunGeometricas.menu();
		opcion = s.nextInt();
		
		misFunciones.FunGeometricas.pideRadio();
		double radio = s.nextDouble();
		System.out.println();
		
		switch(opcion) {
			case 1:
			System.out.printf("La circunferencia es: %.2f\n", misFunciones.FunGeometricas.circunferencia(radio));
			break;
			case 2:
			System.out.printf("El area es: %.2f\n", misFunciones.FunGeometricas.area(radio));
			break;
			case 3:
			System.out.printf("El volumen es: %.2f\n", misFunciones.FunGeometricas.volumen(radio));
			break;
			case 4:
			System.out.printf("La circunferencia es: %.2f\n", misFunciones.FunGeometricas.circunferencia(radio));
			System.out.printf("El area es: %.2f\n", misFunciones.FunGeometricas.area(radio));
			System.out.printf("El volumen es: %.2f\n", misFunciones.FunGeometricas.volumen(radio));
			break;
			default:
		}
		System.out.println();
	}
	}
}
