/**Este programa genera un array de numeros aleatorios y de un tamaño pedido
*por teclado.
@AMandaNR*/

import java.util.Scanner;

public class ExANR4 {
  public static void main (String [] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un numero para el tamaño del array: ");
    int tam = s.nextInt();
    
    int[] array = new int[tam];
    
    System.out.println("Array:");
    for(int i = 0; i < tam; i++) {
      array[i] = (int)(Math.random()* 101 + 300);//Doy valores alearotios al array.
      System.out.print(array[i] +" ");//Muestro el array por pantalla.
      }
      
  }
}
