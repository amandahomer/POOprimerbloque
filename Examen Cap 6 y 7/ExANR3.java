/**Este programa muestra la apuesta y la quiniela de los ej anteriores.
@AMandaNR*/

public class ExANR3 {
  public static void main (String [] args) {
    
    int[] apuesta = new int[14]; //Creo un array de 14 posiciones.
    int fila;
    int columna;
    int i;
    int destacado;
  
  
    System.out.print("Apuesta: ");
    for(i = 0; i < 14; i++){
      apuesta[i] = (int)(Math.random()* 3 +1);//Doy valores aleatorios al array apuesta.
      System.out.print(apuesta[i] +" ");//Muestro el array apuesta.
    }
    //me faltaba un ln
    System.out.println();
    
    for(fila = 0; fila < 14; fila++){
      for(columna = 0; columna < 3;  columna++){
        int[][] array = new int[14][3]; //Creo un array bidimensional de 14 filas y 3 columnas.
        array[fila][0] = 1;//Doy el mismo valor a las columnas en cada fila.
        array[fila][1] = 2;
        array[fila][2] = 3;
        
        //apuesta[i] deberia ser apuesta[fila]
        if(array[fila][columna] == apuesta[fila]) {
          System.out.print("*"+ array[fila][columna] +"* "); //Si el valor de la posicion del array apuesta es igual al algun valor de la columna del array, lo muestro señalado.
        } else {
          System.out.print(array[fila][columna] +" "); //Si no es igual, lo muestro tal cual.
        }
      }
      System.out.println();
    }
    
    System.out.println();
    
  }
}
