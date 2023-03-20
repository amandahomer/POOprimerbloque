/**Este programa genera y muestra una quiniela.
@AMandaNR*/

public class ExANR1 {
  public static void main (String [] args) {
    
    int fila;
    int columna;
    
    System.out.println("Quiniela:");
    for(fila = 0; fila < 14; fila++){
      System.out.printf("Fila %2s: ",fila);
      for(columna = 0; columna < 3;  columna++){
        int[][] array = new int[14][3]; //Creo un array bidimensional de 14 filas y 3 columnas.
        array[fila][0] = 1;//Doy el mismo valor a las columnas en cada fila.
        array[fila][1] = 2;
        array[fila][2] = 3;
        
        System.out.print(array[fila][columna] +" "); //Muestro el array.
      }
        System.out.println();
    }
  
  }
}
