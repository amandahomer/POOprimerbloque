/**Este programa pide el ancho y alto de un rectángulo y muestra por 
*pantalla su área y su perímetro.
*@AmandaNR*/

import java.util.Scanner;
import misFunciones.FunGeometricas;

public class EjercicioN7 {
	
	public static void  main (String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Muestra el area y el perimetro de un rectangulo.");
		System.out.print("Introduce el ancho: ");
		double n1 = s.nextInt();
		System.out.print("Introduce el alto: ");
		double n2 = s.nextInt();
		
		System.out.println("El area del rectangulo es: "+ misFunciones.FunGeometricas.areaRectangulo(n1, n2) +" cm");
		System.out.println("El perimetro del rectangulo es: "+ misFunciones.FunGeometricas.perimetroRectangulo(n1, n2) +" cm");
	
	}
}
