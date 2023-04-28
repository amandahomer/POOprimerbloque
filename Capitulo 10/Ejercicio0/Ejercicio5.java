/**Modifica el programa GESTISIMAL (GESTIón SIMplificada de ALmacén)
para llevar el control de los artículos de un almacén. De cada 
artículo se debe saber el código, la descripción, el precio de 
compra, el precio de venta y el stock.
@author AmandaNR*/

package Ejercicio0;
import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        

        ArrayList<Articulo> array = new ArrayList<Articulo>();
        array.add(new Articulo(1, "monitor", 40, 70, 4));
        array.add(new Articulo(2, "teclado", 10.50, 18, 6));


        Scanner s = new Scanner(System.in);
        int opcion;
        int codigoT = 0;
        String descripcionT = "";
        double precioCompraT = 0;
        double precioVentaT = 0;
        int numUnidadesT = 0;

        do{
            System.out.println("****** GESTISIMAL ******");
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
                System.out.println("1. LISTADO");
                //Bucle tradicional for
                /*for(int i = 0; i < array.size(); i++){ 
                    System.out.println(array.get(i));
                }*/
                System.out.println();
                System.out.println("*************************************** ARTICULOS ****************************************");
                //Bucle estilo foreach, sin indice.
                for(Articulo a: array){ 
                    System.out.println(a);
                }
                System.out.println();
                break;
                case 2:
                System.out.println("2. ALTA");
                System.out.println("Introduce los datos del nuevo articulo");
                System.out.println("Codigo:");
                codigoT = s.nextInt();

                if(array.contains(new Articulo(codigoT))){ 
                    System.out.println("Descripcion: ");
                    descripcionT = s.nextLine();
                    System.out.println("Precio de compra: ");
                    precioCompraT = s.nextDouble();
                    System.out.println("Precio de venta: ");
                    precioVentaT = s.nextDouble();
                    System.out.println("Numero de unidades: ");
                    numUnidadesT = s.nextInt();
                    array.add(new Articulo(codigoT, descripcionT, precioCompraT, precioVentaT, numUnidadesT));
                } else {
                    System.out.println("El codigo ya existe, introduzca otro codigo.");    
                }
                break;
                case 3:
                System.out.println("3. BAJA");
                System.out.println("Introduzca el codigo del articulo que desea borrar");
                System.out.println("Codigo: ");
                codigoT = s.nextInt()-1;
                //No me borra el articulo si dejo el if y no se porque, asi que lo he quitado.
                //if(array.contains(codigoT)){
                    array.remove(codigoT);
                /*} else {
                    System.out.println("El codigo no existe");
                }*/
                break;
                case 4:
                System.out.println("4. MODIFICACION");
                System.out.println("Introduzca el codigo del articulo que desea modificar");
                System.out.print("Codigo: ");
                codigoT = s.nextInt()- 1;
                System.out.println();
                //Hago que codigoT sea igual al indice del array y le resto 1 porque los arrays empiezan por 0.
                //No se si esta bien, me gustaria poner que el codigo sea autoincrementable pero no se como
                codigoT = array.indexOf(new Articulo(codigoT));
                //No se que poner como parametro de array contains. Quiero que el parametro sea el codigo de un articulo existente.
                if(array.contains(codigoT)){
                    System.out.println("El codigo es correcto");
                    System.out.println("Introduce los datos nuevos.");
                    System.out.println("Codigo: "+ array.get(codigoT).getCodigo() + 
                    "Descripcion: "+ array.get(codigoT).getDescripcion() +
                    "Precio Compra: "+ array.get(codigoT).getPrecioCompra() +
                    "Precio Venta: "+ array.get(codigoT).getPrecioVenta() +
                    "Stock: "+ array.get(codigoT).getNumUnidades());
                    System.out.print("Nuevo codigo: ");
                    codigoT = s.nextInt();
                    System.out.print("Nueva descripcion: ");
                    descripcionT = s.nextLine();
                    System.out.print("Nuevo precio de compra: ");
                    precioCompraT = s.nextDouble();
                    System.out.print("Nuevo precio de venta: ");
                    precioVentaT = s.nextDouble();
                    System.out.print("Nuevo stock: ");
                    numUnidadesT = s.nextInt();
                } else {
                    System.out.println("El codigo no existe");
                }
                break;
                case 5:
                System.out.println("4. ENTRADA DE MERCANCIA");
                System.out.println("Introduce el codigo del articulo");
                System.out.print("Codigo: ");
                codigoT = s.nextInt()-1;
                codigoT = array.indexOf(new Articulo(codigoT));
                //Este if no me funciona, igual que el de la opcion 3 "modificacion"
                if(array.contains(codigoT)){
                    System.out.println("El codigo es correcto");
                    System.out.println("Codigo: "+ array.get(codigoT).getCodigo() + 
                    "Descripcion: "+ array.get(codigoT).getDescripcion());
                    System.out.print("Introduce el numero de unidades que entran: ");
                    numUnidadesT = s.nextInt();
                    array.get(codigoT).setNumUnidades(numUnidadesT + array.get(codigoT).getNumUnidades());
                } else {
                    System.out.println("El codigo no existe");
                }
                break;
                case 6:
                System.out.println("5. SALIDA DE MERCANCIA");
                System.out.println("Introduce el codigo del articulo");
                System.out.print("Codigo: ");
                codigoT = s.nextInt()-1;
                codigoT = array.indexOf(new Articulo(codigoT));
                //Este if no me funciona, igual que el de la opcion 3 Y 4
                if(array.contains(codigoT)){
                    System.out.println("El codigo es correcto");
                    System.out.println("Codigo: "+ array.get(codigoT).getCodigo() + 
                    "Descripcion: "+ array.get(codigoT).getDescripcion());
                    System.out.print("Introduce el numero de unidades que se venden: ");
                    numUnidadesT = s.nextInt();
                    array.get(codigoT).setNumUnidades(numUnidadesT - array.get(codigoT).getNumUnidades());
                } else {
                    System.out.println("El codigo no existe");
                }
                break;
                default:
            }

        }while(opcion < 7);

    }
}
