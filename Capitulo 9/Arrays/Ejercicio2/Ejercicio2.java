/**Cambia el programa anterior de tal forma que los datos de los
gatos se introduzcan directamente en el código
@author AmandaNR*/

package Ejercicio2;

import Ejercicio3.Gato;

public class Ejercicio2 {
    public static void main (String[] args) {

        Gato[] gatito = new Gato[4];


        gatito[0] = new Gato("macho", "Klaus");
        gatito[1] = new Gato("hembra", "Arneska");
        gatito[2] = new Gato("macho", "Manani");
        gatito[3] = new Gato("hembra", "Pitu");

        System.out.println("Los datos introducidos son:");
        System.out.println("---------");

        for(int i = 0; i < 4; i++) {
            System.out.println("Gatito "+ (i + 1));
            System.out.println("Nombre: "+ gatito[i].getNombre());
            System.out.println("Sexo: "+ gatito[i].getSexo());
            System.out.println("---------");
        }
        
    }
}
