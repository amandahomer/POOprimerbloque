
/**Este programa genera 20 numeros y pasa los numeros pares
*a las primeras posiciones y los impares a las ultimas.
*@AmandaNR*/

public class Ejercicio10 {

	public static void main (String [] args) {
		
		int[] num = new int[20];
		int contPar = 0;
		int contImpar = 0;
		
		for(int i = 0; i < 20; i++) {
			num[i] = (int)(Math.random()* 101);
			System.out.print(num[i] +" ");
			
			if(num[i] % 2 == 0) {
				contPar++;
			} else {
				contImpar++;
			}
		}
		
		System.out.println();
		
		int[] par = new int [contPar];
		int[] impar = new int [contImpar];
			
		contPar = 0;
		contImpar = 0;
		
		//Almaceno pares e impares en sus respectivos arrays
		
		for(int i = 0; i < 20; i++) {
			if(num[i] % 2 == 0) {
				par[contPar] = num[i];
				contPar++;
			} else {
				impar[contImpar] = num[i];
				contImpar++;
			}
		}
		
		for(int i = 0; i < contPar; i++){
			System.out.print(par[i]+ " ");
		}
		
		System.out.print("");
		
		for(int i = 0; i < contImpar; i++){
			System.out.print(impar[i]+ " ");
		}
	}
}
