/**Crea la clase Vehiculo, así como las clases Bicicleta y Coche como 
subclases de la primera. Para la clase Vehiculo, crea los atributos de 
clase vehiculosCreadosy kilometrosTotales, así como el atributo de 
instancia kilometrosRecorridos. Crea también algún método específico 
para cada una de las subclases.
@AmandaNR*/
package Ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {

	private static boolean isNumeric(String str){
        return str != null && str.matches("[0-9.]+");
	}
    public static void main (String [] args){

        Scanner s = new Scanner(System.in);

        Bicicleta bici = new Bicicleta();
        Coche coche = new Coche();
        
		
        String opcion;
		int opcionInt = 0;


				do {
					System.out.println("-----------------");
					System.out.println("VEHICULOS");
					System.out.println("-----------------");
					System.out.println("1. Ver kilometros recorridos.");
					System.out.println("2. Ver kilometros totales.");
					System.out.println("3. Derrapar con la bici.");
					System.out.println("4. Tocar el claxon del coche.");
					System.out.println("5. Salir.");
					System.out.println();


					System.out.print("Elige una opcion: ");
					opcion = s.nextLine();
					System.out.println();

					if(isNumeric(opcion)){
						opcionInt = Integer.parseInt(opcion);

					switch(opcionInt){
							case 1: 
							System.out.println("la bici ha recorrido: "+ bici.getkilometrosRecorridos()+" km");
							System.out.println("el coche ha recorrido: "+ coche.getkilometrosRecorridos()+" km");
							break;
							case 2:
							System.out.println("Los km totales son: "+ Vehiculo.getkilometrosTotales());
							break;
							case 3:
							bici.derrapa();
							bici.recorrer(5);
							break;
							case 4:
							coche.tocaClaxon();
							break;
							default:
							System.out.println("Opcion no valida");
							System.out.println();
					}
				} else {
					opcionInt = 0;
					System.out.println("Opcion no valida");
					System.out.println();
				
				}
				} while (opcionInt != 5);
				
				
			}
	}
