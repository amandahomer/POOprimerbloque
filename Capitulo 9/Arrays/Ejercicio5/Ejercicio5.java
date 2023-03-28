/**Crea el programa GESTISIMAL (GESTIón SIMplificada de Almacén)
para llevar el control de los artículos de un almacén. De cada 
artículo se debe saber el código, la descripción, el precio de 
compra, el precio de venta y el stock.
@author AmandaNR*/

package Ejercicio5;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Articulo[] articulo = new Articulo[50];

        Scanner s = new Scanner(System.in);
        int opcion;
        String codigo;
        String descripcion;
        double precioCompra;
        double precioVenta;
        int numUnidades;

        do{
            System.out.println("**GESTISIMAL**");
            System.out.println("1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Modificacion");
            System.out.println("5. Entrada de mercancia");
            System.out.println("6. Salida de mercancia");
            System.out.println("7. Salir");
            System.out.println();

            System.out.print("Elige una opcion: ");
            opcion = s.nextInt();

            switch(opcion) {
                case 1:
                System.out.println("LISTADO");
                for(int i = 0; i <= 50; i++) {
                    System.out.println(articulo[i]);
                }
                break;
                case 2:
                System.out.println("ALTA");
                System.out.println("Introduce los datos del nuevo articulo");
                System.out.print("Codigo: ");
                codigo = s.nextLine();
                System.out.print("Descripcion: ");
                descripcion = s.nextLine();
                System.out.println("Precio de compra: ");
                precioCompra = s.nextDouble();
                System.out.println("Precio de venta: ");
                precioVenta = s.nextDouble();
                System.out.println("Numero de unidades: ");
                numUnidades = s.nextInt();
                break;
                case 3:
                System.out.println("BAJA");
                System.out.println("Introduzca el codigo que desea borrar");
                System.out.println("Codigo: ");
                codigo = s.nextLine();
                break;
                case 4:
                articulo[i].setCodigo(codigo);
                articulo[i].setDescripcion(descripcion);
                articulo[i].setPrecioCompra(precioCompra);
                break;
            
                default:
            }

        }while(opcion < 7);

    }
}
