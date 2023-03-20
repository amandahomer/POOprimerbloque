package Apuntes;
public class Persona {

    String nombre;
    int edad;
    String ciudadResidencia;
    String profesion;
    String dni;

    public Persona(String s, int n){
        nombre = s;
        edad = n;
        ciudadResidencia = "Galicia";
        profesion = "estudiante";
        dni = "20202020A";
    }

    public void mostrarDatos(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("Ciudad: "+ ciudadResidencia);
        System.out.println("Profesion: "+ profesion);
        System.out.println("DNI: "+ dni);
        System.out.println(); 
    }
    
}
