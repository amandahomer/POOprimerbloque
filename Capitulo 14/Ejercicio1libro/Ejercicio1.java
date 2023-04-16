/**Realiza un programa que pida 6 números por teclado y nos diga cuál es el
máximo. Si el usuario introduce un dato erróneo (algo que no sea un número
entero) el programa debe indicarlo y debe pedir de nuevo el número.
@author AmandaNR*/
package Ejercicio1libro;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main (String [] args) {

        Scanner s = new Scanner(System.in);
        
        int max = 0;
        String numS;
        int nInt = 0;
        boolean ok = false;

        System.out.println("Introduzca 6 numeros (seguidos de intro) para saber el numero maximo:");

        for (int i = 0; i < 6; i++){ //Para que se repita el proceso 6 veces
            do{
                try{
                    numS = s.nextLine();
                    nInt = Integer.parseInt(numS);
                    ok = true;
                }
                catch(Exception e) {
                    System.out.println("Dato no valido, vuelva a introducir 6 numeros");
                }  
            } while (!ok); 
            /*No sabía que condicion poner, vi en el libro q utilizaba un boolean pero aun asi 
            si introduzco por teclado una palabra, me salta el catch pero no me repite el proceso 6 veces,
            no empieza de cero. Sigue por donde iba y me dice el maximo contando los anteriores numeros al error.*/

            if (nInt > max){
                max = nInt;
            }
        }

        System.out.println("El numero maximo es: "+ max);

    }
}
