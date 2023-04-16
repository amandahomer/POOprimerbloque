/**Realiza un programa que genere una excepción de forma aleatoria de entre
las siguientes excepciones: NumberFormatException, IOException, FileNotFoundException,
IndexOutOfBoundsException y ArithmeticException.
@author AmandaNR*/
package Ejercicio3libro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main (String [] args) throws IOException{
        Scanner s = new Scanner(System.in);

        System.out.println("********************************************************");
        System.out.println("1.Provoca una excepcion -NumberFormatException-");
        System.out.println("2.Provoca una excepcion -IOException-");
        System.out.println("3.Provoca una excepcion -FileNotFoundException-");
        System.out.println("4.Provoca una excepcion -ArrayIndexOutOfBoundsException-");
        System.out.println("5.Provoca una excepcion -ArithmeticException-");
        System.out.println("********************************************************");

        
            int opcion = (int)(Math.random()*5 + 1);
            System.out.println("Opcion aleatoria: "+ opcion);

            switch(opcion){
                case 1:
                funcion1();
                break;
                case 2:
                funcion2();
                break;
                case 3:
                funcion3();
                break;
                case 4:
                funcion4();
                break;
                case 5:
                funcion5();
                break;
                default:
            }   
    }

        public static void funcion1() throws NumberFormatException {
            throw new NumberFormatException();
        }
        public static void funcion2() throws IOException {
            throw new IOException();
        }
        public static void funcion3() throws FileNotFoundException {
            throw new FileNotFoundException();
        }
        public static void funcion4() throws ArrayIndexOutOfBoundsException {
            throw new ArrayIndexOutOfBoundsException();
        }
        public static int funcion5() throws ArithmeticException {
            throw new ArithmeticException();
        }
}
