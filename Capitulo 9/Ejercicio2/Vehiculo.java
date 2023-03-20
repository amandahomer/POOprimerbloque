package Ejercicio2;

public abstract class Vehiculo {
    //Atributos de clase
    private static int vehiculosCreados = 1;
    private static int kilometrosTotales = 0;
    //Atributos de instancia
    private int kilometrosRecorridos;
    
    //Constructor
    public Vehiculo() {
        this.kilometrosRecorridos = 0;
    }

    public void recorrer(int km){
        this.kilometrosRecorridos += km;
        kilometrosTotales += km;
    }

    public int getkilometrosRecorridos() {
        return kilometrosRecorridos;
    }
    public static int getkilometrosTotales() {
        return kilometrosTotales;
    }
    public int getVehiculosCreados(){
        return vehiculosCreados;
    }
    public void setkilometrosRecorridos(int km) {
				kilometrosRecorridos += km;
        kilometrosTotales += km;
		}
    public void setVehiculosCreados(int nuevoVehiculo){
				vehiculosCreados = nuevoVehiculo;
		}

}
