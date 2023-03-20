/**Este programa crea un array y muestra ese array, un array volteado,
* la suma, el numero mayor y el numero menor.
@AMandaNR*/

import java.util.Scanner;

public class ExANR5 {
  public static void main (String [] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un numero para el tamaño del array: ");
    int tam = s.nextInt();
    
    int[] array = new int[tam];
    int suma = 0;
    int mayor = 300;
    int menor = 400;
    
    System.out.println("Array inicial:");
    for(int i = 0; i < tam; i++) {
      array[i] = (int)(Math.random()* 101 + 300);//Doy valores aleatorios al array entre 300 y 400.
      System.out.print(array[i] +" ");
      suma += array[i];//Voy sumando y acumulando los numeros del array.
      if(array[i] < menor){//Si el valor del array es menor que 400. se acumula en la variable menor.
        menor = array[i];
      }
      if(array[i] > mayor){//Si el valor del array es mayor que 300. se acumula en la variable mayor.
        mayor = array[i];
      }
    }
    
    System.out.println();
    
    System.out.println("Array volteado:"); //No me sale el volteado del array.
    for(int i = tam; i < 0; i--) {
      System.out.print(array[i] +" ");
    }
    
    //Muestro la suma total de todos los arrays, el numero mayor y el numero menor.
    System.out.println("Suma: "+ suma);
    System.out.println("Mayor: "+ mayor);
    System.out.println("Menor: "+ menor);
  
  }
}
    
