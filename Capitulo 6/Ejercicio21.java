/**Este programa genera una secuencia de cinco monedas de curso
legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 
2 céntimos, 5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 
1 euro y 2 euros. Las dos posiciones posibles son cara y cruz.
*@AmandaNR*/

public class Ejercicio21 {

	public static void main (String [] args) {
		
		String moneda = "";
		String resul = "";
		
		for(int i = 0; i < 5; i++) {
			switch((int)(Math.random()*8)) {
				case 0:
				moneda = "1 centimo";
				break;
				case 1:
				moneda = "2 centimos";
				break;
				case 2:
				moneda = "5 centimos";
				break;
				case 3:
				moneda = "10 centimos";
				break;
				case 4:
				moneda = "20 centimos";
				break;
				case 5:
				moneda = "50 centimos";
				break;
				case 6:
				moneda = "1 euro";
				break;
				case 7:
				moneda = "2 ceuros";
				break;
				default:
			}
		
			switch((int)(Math.random()*2)) {
				case 0:
				resul = "cara";
				break;
				case 1:
				resul = "cruz";
				break;
				default:
			}
			
			System.out.println(moneda +": "+ resul);
			
		}
	}
}
