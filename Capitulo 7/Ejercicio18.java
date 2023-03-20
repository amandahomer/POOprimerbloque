/**Este programa genera 10 numeros aleatorios y los ordena,
* de menor a mayor.
*@AmandaNR*/

public class Ejercicio18 {

	public static void main (String [] args) {
		
		int[] num = new int[10];
		int i;
		int contMenores = 0;
		int contMayores = 0;
		
		System.out.println("Array original:");
		for(i = 0; i < 10; i++) {
			num[i] = (int)(Math.random()* 201);
			System.out.printf("%5d",i);
			if(num[i] <= 100) {
				contMenores++;
			} else {
				contMayores++;	
			}
		}
		System.out.println();
		
		for(i = 0; i < 10; i++) {
			System.out.printf("%5d",num[i]);
		}
		System.out.println();
		
		int[] menores = new int[contMenores];
		int[] mayores = new int[contMayores];
		
		contMenores = 0;
		contMayores = 0;
		
		System.out.println("Resultado:");
		for(i = 0; i < 10; i++) {
			System.out.printf("%5d",i);
		}
		System.out.println();
		
		for(i = 0; i < 10; i++) {
			if(num[i] <= 100) {
				menores[contMenores] = num[i];
				contMenores++;
			} else {
				mayores[contMayores] = num[i];
				contMayores++;	
			}
		}
		
		for(i = 0; i < contMenores; i++) {
			System.out.printf("%5d",menores[i]);
		}
		System.out.print("");
		
		for(i = 0; i < contMayores; i++){
			System.out.printf("%5d",mayores[i]);
		}
		
	}
}
