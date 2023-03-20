/**Queremos gestionar la venta de entradas (no numeradas) de Expocoches
Campanillas que tiene 3 zonas, la sala principal con 1000 entradas disponibles, 
la zona de compra-venta con 200 entradas disponibles y la zona vip
con 25 entradas disponibles. Hay que controlar que existen entradas antes de
venderlas.
*@AmandaNR*/

package Ejercicio7;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main (String [] args) {

        Zona principal = new Zona(1000);
        Zona compraVenta = new Zona(200);
        Zona vip = new Zona(25);

        Scanner s = new Scanner(System.in);
        int opcion;
        int opcion2;
        int numEntradas;

        do {
            System.out.println("1. Mostrar numero de entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            System.out.println();

            System.out.print("Elige una opcion(1-3): ");
            opcion = s.nextInt();
            
            if(opcion == 1) {
                System.out.println("Principal: "+ principal.getEntradasPorVender());
                System.out.println("Compra-venta: "+ compraVenta.getEntradasPorVender());
                System.out.println("Vip: "+ vip.getEntradasPorVender());
            }

            if(opcion == 2) {
                System.out.println("1. Principal");
                System.out.println("2. Compra-venta");
                System.out.println("3. Vip");
                System.out.println();

                System.out.print("Elige una opcion(1-3): ");
                opcion2 = s.nextInt();

                System.out.println("¿Cuantas entradas quieres?  ");
                numEntradas = s.nextInt();

                switch(opcion2) {
                    case 1:
                    principal.vender(numEntradas);
                    break;
                    case 2:
                    compraVenta.vender(numEntradas);
                    break;
                    case 3:
                    vip.vender(numEntradas);
                    break;
                    default:
                }
            }
        } while (opcion != 3);
    

    }
}
