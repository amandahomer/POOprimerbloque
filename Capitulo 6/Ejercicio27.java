/**Este programa implementa el juego piedra, papel y tijera. 
Primero, el usuario introduce su jugada y luego el ordenador  
genera al azar una de las opciones. Si el usuario introduce una 
opción incorrecta, el programa deberá mostrar un mensaje de error.
@AmandaNR*/

import java.util.Scanner;

public class Ejercicio27 {

	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
	
		System.out.print("Turno del jugador (introduzca piedra, papel o tijera): ");
		String jug = s.nextLine();
		
		int pc = ((int)(Math.random()*3)); //Turno del ordenador
		String ordenador = "";
		
		switch(pc) {
			case 0:
			ordenador = "piedra";
			break;
			case 1:
			ordenador = "papel";
			break;
			case 2:
			ordenador = "tijera";
			break;
			default:
		}
		
		System.out.println("Turno del ordenador: "+ ordenador);
		
		if(ordenador.equals(jug)) {
			System.out.println("Empate");
		} else {
			int ganador = 1;
			switch(ordenador) {
				case "piedra":
				if(jug.equals("tijera")){
					ganador = 2;
				}
				break;
				case "papel":
				if(jug.equals("piedra")){
					ganador = 2;
				}
				break;
				case "tijera":
				if(jug.equals("papel")){
					ganador = 2;
				}
				break;
				default:
			}
			
			if(ganador == 1) {
			System.out.println("Gana el jugador");
			} else {
				System.out.println("Gana el ordenador");
			}
			
		}
	}
}
