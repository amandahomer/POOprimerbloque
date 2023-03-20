package misFunciones;
/**Funciones Arrays
*@AmandaNR*/

public class FunArrays {
	
	//Imprime array
	/**
	*@param array un array
	*@return valores de array
	*/
	public static void imprimeArray(int[] array) {
		
		int tam = 100;
		for(int i = 0; i < tam; i++) {
			System.out.print(array[i] +" ");
		}
		
	}
	
	//N15 Suma de un array
	/**
	*@param array un array 
	*@return suma un numero entero
	*/
	public static int sumaArray(int[] array) {
		
		int suma = 0;
		for(int i = 0; i < 100; i++) {
			suma += i;
		}
		
		return suma;
		
	}
	
	
	//N15 Media de un array
	/**
	*@param array un array 
	*@return media un numero decimal
	*/
	public static double mediaArray(int[] array) {
		
		double media = (double)sumaArray(array) / 100;
		
		
		return media;
		
	}


}
