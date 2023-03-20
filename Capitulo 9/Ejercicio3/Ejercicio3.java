/**Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino 
y Lagarto. Crea, al menos, tres métodos específicos de cada clase y redefne 
el/los método/s cuando sea necesario. Prueba las clases creadas en un 
programa en el que se instancien objetos y se les apliquen métodos.
@AmandaNR*/
package Ejercicio3;

public class Ejercicio3 {
    
    public static void main (String [] args){

        Gato klaus = new Gato("macho");
        
        klaus.maulla();
        klaus.come("pescado");
        klaus.maulla();
        klaus.tenCria();

        Pinguino pingu = new Pinguino("macho");

        pingu.duerme();
        pingu.vuela();
        pingu.ponHuevo();


    }
}
