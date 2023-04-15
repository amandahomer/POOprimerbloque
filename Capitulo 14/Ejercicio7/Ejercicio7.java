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
        String opcion1;
        int opcion2;
        int opcionNum = 0;

        int numEntradas = 0;

        do {
            
            System.out.println("1. Mostrar numero de entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            System.out.println();
            System.out.print("Elige una opcion(1-3): ");
            try {
            opcion1 = s.nextLine();
            opcionNum = Integer.parseInt(opcion1);
            System.out.println();
            
            if(opcionNum != 1 && opcionNum != 2 && opcionNum != 3 ) {
                System.out.println("Error, introduzca un numero valido!!!");

                System.out.println();
            }

            if(opcionNum == 1) {
                System.out.println("Principal: "+ principal.getEntradasPorVender());
                System.out.println("Compra-venta: "+ compraVenta.getEntradasPorVender());
                System.out.println("Vip: "+ vip.getEntradasPorVender());
                System.out.println();
            }

            if(opcionNum == 2) {
                System.out.println("1. Principal");
                System.out.println("2. Compra-venta");
                System.out.println("3. Vip");
                System.out.println();

                System.out.print("Elige una opcion(1-3): ");
                opcion2 = s.nextInt();
                if(opcion2 != 1 && opcion2 != 2 && opcion2 != 3 ) {
                    System.out.println("Error, introduzca un numero valido!!!");
                    System.out.println();
                } else {
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
                        System.out.println("Opcion no valida");
                    }
                }

            }
        }
        catch(Exception e){
            System.out.println("Opcion no valida");
        }
        } while (opcionNum != 3);
    

    }
}
