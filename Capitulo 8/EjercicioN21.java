/**Este programa muestra un menú con 2 opciones: “1.Circunferencia” y 
*“2.Área”. En ambas se le pedirá al usuario que introduzca un radio y 
*luego se le mostrará el cálculo oportuno. Implementando funciones.
*@AmandaNR*/

import misFunciones.FunGeometricas;
import java.util.Scanner;

public class EjercicioN21 {

	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		misFunciones.FunGeometricas.menu();
		int opcion = s.nextInt();
		
		misFunciones.FunGeometricas.pideRadio();
		double radio = s.nextDouble();
		System.out.println();
		
		if(opcion == 1) {
			System.out.printf("La circunferencia es: %.2f", misFunciones.FunGeometricas.circunferencia(radio));
		} else if(opcion == 2) {
			System.out.printf("El area es: %.2f", misFunciones.FunGeometricas.area(radio));
		}
	
		
	}
}
