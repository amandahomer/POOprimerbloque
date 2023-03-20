/**Este programa que muestra 50 números enteros aleatorios comprendidos
entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra luego
el máximo de los pares el mínimo de los impares y la media de todos los
números generados.
*@AmandaNR*/

public class Ejercicio19 {

	public static void main (String [] args) {
		
		int max = -101;
		int min = 201;
		int suma = 0;
		int b = 50;
		
		for(int i = 1; i <= b; i++) {
			int num = (int)(Math.random()*301 -100);
			System.out.print(num +" ");
			if(num % 2 != 0 && num < min){
				min = num;
			}
			if(num % 2 == 0 &&  num > max){
				max = num;
			}
			suma += num;
			
		}
		
		System.out.print("\nEl minimo es: "+ min +"\nEl maximo es: "+ max +"\nLa media es: " + suma/b);
		
	}
}
