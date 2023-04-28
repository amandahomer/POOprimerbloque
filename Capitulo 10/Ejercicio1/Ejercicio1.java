/**Supongamos una clase Producto con dos atributos, un constructor (con parámetros) 
y los getters y setters de sus dos atributos.
1. Crea 5 instancias de la Clase Producto.
2. Crea un ArrayList.
3. Añade las 5 instancias de Producto al ArrayList.
4. Visualiza el contenido de ArrayList utilizando Iterator.
5. Elimina dos elemento del ArrayList.
6. Inserta un nuevo objeto producto en medio de la lista.
7. Visualiza de nuevo el contenido de ArrayList utilizando Iterator.
8. Elimina todos los valores del ArrayList. 
@author AmandaNR*/

package Ejercicio1;
import java.util.ArrayList;

public class Ejercicio1 {
    public static void main (String [] args){

        ArrayList<Producto> arrayProductos = new ArrayList<Producto>();

        Producto prod1 = new Producto("monitor", 4);
        Producto prod2 = new Producto("teclado", 6);
        Producto prod3 = new Producto("raton", 10);
        Producto prod4 = new Producto("procesador", 2);
        Producto prod5 = new Producto("disipador", 2);

        arrayProductos.add(prod1);
        arrayProductos.add(prod2);
        arrayProductos.add(prod3);
        arrayProductos.add(prod4);
        arrayProductos.add(prod5);

        System.out.println("El contenido del array es:");
        for(Producto p: arrayProductos){
            System.out.println(p);
        }
        System.out.println();

        System.out.println("Eliminamos dos productos del array:");
        arrayProductos.remove(prod3);
        arrayProductos.remove(prod5);
        System.out.println("Productos eliminados.");
        System.out.println("El nuevo contenido del array es:");
        for(Producto p: arrayProductos){
            System.out.println(p);
        }
        System.out.println();

        System.out.println("Añadimos un nuevo producto enmedio de la lista:");
        arrayProductos.add(2, new Producto("producto nuevo", 1));
        System.out.println("El nuevo contenido del array es:");
        for(Producto p: arrayProductos){
            System.out.println(p);
        }
        System.out.println();

        System.out.println("Eliminamos todos los valores del ArrayList");
        arrayProductos.clear();
        System.out.println("El nuevo contenido del array es:");
        for(Producto p: arrayProductos){
            System.out.println(p);
        }

    }
}
