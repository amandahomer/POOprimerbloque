package misFunciones;
/**Funciones Geometricas
*@AmandaNR*/

public class FunGeometricas {
	
	//N7 Area Rectangulo
	/**
	*@param a un numero decimal
	*@param b un numero decimal
	*@return area un numero decimal
	*/
	public static double areaRectangulo(double a, double b) {
		
		double area = a * b;
		
		return area;
		
	}
	
	
	//N8 Perimetro Rectangulo
	/**
	*@param a un numero decimal
	*@param b un numero decimal
	*@return perim un numero decimal
	*/
	public static double perimetroRectangulo(double a, double b) {
		
		double perim = 2 * areaRectangulo(a, b);
		
		return perim;
		
	}
	
	
	//N14 Dibuja un triangulo
	/**
	*@param num un numero entero
	*@param caracter un String, cadena de caracteres
	*@return triangulo de altura num rellena de caracter
	*/
	public static void dibujaTriangulo(int num, String caracter) {
		
		int planta = 1;
		int longitud = 1;
		int espacios = num - 1;
		
		while (planta <= num) {
			for (int i = 1; i <= espacios; i++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= longitud; i++) {
				System.out.print(caracter);
			}
			
			System.out.println();
			
			planta++;
			espacios--;
			longitud = longitud + 2;
		}
		
	}
	
	
	
	//N21 Menu
	/**
	*@return menu
	*/
	public static void menu() {
		
		System.out.println("<<<< MENU >>>>");
		System.out.println("1 Circunferencia");
		System.out.println("2 Area");
		System.out.println("3 Volumen");
		System.out.println("4 Todas");
		System.out.println("5 Salir");
		System.out.print("Elija una opcion: ");
		
	}
	
	
	
	//N21 pideRadio
	/**
	*@return pide el radio
	*/
	public static void pideRadio() {
		
		System.out.print("Introduce el radio: ");
		
	}
	
	
	//N21 Circunferencia
	/**
	*@param r un numero decimal
	*@return cir un numero decimal
	*/
	public static double circunferencia(double r) {
		
		double cir = (2 * 3.14) * r;
		
		return cir;
		
	}
	
	
	//N21 Area
	/**
	*@param r un numero decimal
	*@return a un numero decimal
	*/
	public static double area(double r) {
		
		double a = 3.14 * (r * r);
		
		return a;
		
	}
	
	
	//N21 M1 Volumen
	/**
	*@param r un numero decimal
	*@return v un numero decimal
	*/
	public static double volumen(double r) {
		
		double v = 3.14 * (r * r * r);
		
		return v;
		
	}

}
