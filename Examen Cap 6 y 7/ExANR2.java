/**Este programa genera y muestra una apuesta de numeros aleatorios.
@AMandaNR*/

public class ExANR2 {
  public static void main (String [] args) {
    
    int[] apuesta = new int[14]; //Creo un array de 14 posiciones.
    
    System.out.print("Apuesta: ");
    for(int i = 0; i < 14; i++){
      apuesta[i] = (int)(Math.random()* 3 +1); //Doy valores aleatorios al array.
      System.out.print(apuesta[i] +" "); //Muestro el array
      }
  
  }
}
