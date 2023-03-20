/**Realiza el juego del “Craps”. Las reglas son las siguientes: 
Al comenzar la partida, el jugador introduce la cantidad de dinero 
que quiere apostar. Se muestra la tirada aleatoria de dos dados. 
Si entre los dos dados suman 7 u 11, el jugador gana la misma cantidad
que apostó y termina la partida. Por ej. si apostó 1000 €, gana otros 
1000 € y acaba con 2000 €. Si entre los dos dados suman 2, 3 o 12, el 
jugador pierde todo su dinero y termina la partida. Si no se da ninguno 
de los casos anteriores, es decir si sale 4, 5, 6, 8, 9 o 10, el juego
entra en una segunda etapa. En esta etapa, el jugador buscará volver a 
obtener ese número en los dados. Si consigue repetir ese número, gana. 
Si sale un 7, pierde. Si sale otro número, tiene que seguir tirando.
@AmandaNR*/

import java.util.Scanner;

public class Ejercicio31 {

	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
		int gana;
		
		System.out.println("Este es el juego del CRAPS");
		System.out.print("Introduzca la cantidad que quiere apostar: ");
		int apuesta = s.nextInt();
		
		int dado1 = (int)(Math.random()*6 + 1);
		int dado2 = (int)(Math.random()*6 + 1);
		int totalDados = dado1 + dado2;
		
		System.out.print("Dado 1: "+ dado1 +"\nDado 2: "+ dado2 +"\n");
		System.out.println("La suma de los dados es: "+ totalDados);
		
		if(totalDados == 7 || totalDados == 11){
			gana = apuesta * 2;
			System.out.println("Ha ganado: "+ gana +" euros.");
		}
		if(totalDados == 2 || totalDados == 3 || totalDados == 12){
			gana = 0;
			System.out.println("No gana nada, ha perdido todo su dinero");
		}
		
		if(totalDados == 4 || totalDados == 5 || totalDados == 6 || totalDados == 8 || totalDados == 9 || totalDados == 10 ) {
			System.out.println("Ha pasado a la siguiente ronda");
			
			dado1 = (int)(Math.random()*6 + 1);
			dado2 = (int)(Math.random()*6 + 1);
			System.out.print("Dado 1: "+ dado1 +"\nDado 2: "+ dado2 +"\n");
			System.out.println("La suma de los dados es: "+ (dado1 + dado2));
			
			if ((dado1 + dado2) == totalDados) {
				gana = apuesta * 2;
				System.out.println("Ha ganado: "+ gana +"€");
			} else if ((dado1 + dado2) == 7) {
				System.out.println("No gana nada, ha perdido todo su dinero");
			} else {
				System.out.println("Continua tirando");
			}
		}	
		
	}
}
