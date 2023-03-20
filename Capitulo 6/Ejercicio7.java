/**Este programa muestra tres apuestas de la quiniela en tres columnas.
*@AmandaNR*/

public class Ejercicio7 {

	public static void main (String [] args) {
		
		int resultado;
	
		for(int fila = 1; fila <=14; fila++) {
			System.out.print("Fila "+ fila +": ");
			
			for(int i = 1; i <= 3; i++) {
				resultado = (int)(Math.random()*3 + 1);
				switch(resultado) {
					case 1:
					System.out.print("1 ");
					break;
					case 2:
					System.out.print("2 ");
					break;
					case 3:
					System.out.print("X ");
					break;
					default:
				}
			}
			
			System.out.println("");
			
		}
		
		System.out.print("Pleno al 15: Local ");
		
    int golesL = (int)(Math.random()*4 + 1);
		switch(golesL) {
			case 1:
			System.out.print("1 ");
			break;
			case 2:
			System.out.print("2 ");
			break;
			case 3:
			System.out.print("3 ");
			break;
			case 4:
			System.out.print("M ");
			break;
			default:
		}
		
		System.out.print("Visitante ");
    int golesV = (int)(Math.random()*4 + 1);
		switch(golesV) {
			case 1:
			System.out.print("1 ");
			break;
			case 2:
			System.out.print("2 ");
			break;
			case 3:
			System.out.print("3 ");
			break;
			case 4:
			System.out.print("M ");
			break;
			default:
		}
			
		System.out.println("");
		
	}
}
