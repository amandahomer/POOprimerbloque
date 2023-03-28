/**Utiliza la clase Gato para crear un array de cuatro gatos e 
introduce los datos de cada uno de ellos mediante un bucle. 
Muestra a continuación los datos de todos los gatos utilizando 
también un bucle.
@author AmandaNR*/

package Ejercicio1;
import java.util.Scanner;

import Ejercicio3.Gato;

public class Ejercicio1 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);

        Gato[] gatito = new Gato[4];

        System.out.println("Introduzca los datos de los gatos");

        int i;
        String nombreIntroducido;
        String sexoIntroducido;

        for(i = 0; i < 4; i++) {
            gatito[i] = new Gato();

            System.out.println("Gatito: "+ i);

            System.out.print("Nombre: ");
            nombreIntroducido = s.nextLine();
            gatito[i].setNombre(nombreIntroducido);

            System.out.print("Sexo: ");
            sexoIntroducido = s.nextLine();
            gatito[i].setSexo(sexoIntroducido);
        }

        System.out.println();
        System.out.println("Los datos introducidos son:");
        System.out.println("---------");

        for(i = 0; i < 4; i++) {
            System.out.println("Gatito "+ (i + 1));
            System.out.println("Nombre: "+ gatito[i].getNombre());
            System.out.println("Sexo: "+ gatito[i].getSexo());
            System.out.println("---------");
        }
        
    }
}
