/**Haz un programa llamado ProbarExcepciones.java con un solo archivo y 5 funciones (métodos) 
 * en él, que utilice el método main. Haz un menú con 5 opciones.
 * Haz un bloque try-catch múltiple en el main, de forma que sea en el main donde se capture la
 *  excepción, y no en la función. Esto significa que cada función debe incluir un "thows" con 
 * el tipo de excepción. Esto se explica en la página 316 del libro. El error no se puede tratar, 
 * pero hay que hacer un catch -en el main- por cada una de las 4 posibles excepciones, mostrando 
 * la clase y el mensaje de la excepción.
 * @author AmandaNR*/

package Ejercicio0;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProbarExcepciones {
   
    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);

        
        System.out.println("********************************************************");
        System.out.println("1.Provoca un error -StackOverFlowError-");
        System.out.println("2.Provoca una excepcion -InputMismatchException-");
        System.out.println("3.Provoca una excepcion -ArrayIndexOutOfBoundsException-");
        System.out.println("4.Provoca una excepcion -FileNotFoundException-");
        System.out.println("5.Provoca una excepcion -ArithmeticException-");
        System.out.println("********************************************************");
        
        try{ 
            System.out.print("Elige una opcion: ");
            int opcion = s.nextInt();
            System.out.println();

            switch(opcion){
                case 1:
                factorial(3);
                break;
                case 2:
                System.out.print("Introduzca una palabra: ");
                int teclado = s.nextInt();
                funcion2(teclado);
                break;
                case 3:
                funcion3(9);
                break;
                case 4:
                funcion4("archivo");
                break;
                case 5:
                funcion5(4,0);
                break;
                default:
            }
        }
        catch(InputMismatchException x) {
            System.out.println("Excepcion: "+ x.getClass());
            System.out.println("Mensaje: "+ x.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException x){
            System.out.println("Excepcion: "+ x.getClass());
            System.out.println("Mensaje: "+ x.getMessage());
        }
        catch(FileNotFoundException x){
            System.out.println("Excepcion: "+ x.getClass());
            System.out.println("Mensaje: "+ x.getMessage());
        }
        catch(ArithmeticException x){
            System.out.println("Excepcion: "+ x.getClass());
            System.out.println("Mensaje: "+ x.getMessage());
        }
        catch(Exception x){
            System.out.println("Excepcion por defecto: "+ x.getClass());
            System.out.println("Mensaje: "+ x.getMessage());
        }

    }

    /**
     * @param n
     * @return
     * @throws StackOverflowError
     */
    public static int factorial(int n) throws StackOverflowError {
        if (n == 0) {
            return 1;
        } else {
        return n * factorial(n+1);
        }
    }

    /**
     * @param n
     * @return
     * @throws InputMismatchException
     */
    public static int funcion2(int n) throws InputMismatchException {
        return n + 4;
    }

    /**
     * @param n
     * @throws ArrayIndexOutOfBoundsException
     */
    public static void funcion3(int n) throws ArrayIndexOutOfBoundsException {
        int [] x = new int[3];
        x[3] = 4;
    }

    /**
     * @param x
     * @throws FileNotFoundException
     */
    public static void funcion4(String x) throws FileNotFoundException {
        FileInputStream y = null;
        y = new FileInputStream("B:/myfile.txt");
    }

    /**
     * @param n
     * @param m
     * @return
     * @throws ArithmeticException
     */
    public static int funcion5(int n, int m) throws ArithmeticException {
        return n / m;
    }
}
