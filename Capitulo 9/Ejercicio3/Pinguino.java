package Ejercicio3;

public class Pinguino extends Ave {
    //Atributos
    private String nombre;

    //Constructor
    public Pinguino(String sexo, String nombre){
        super(sexo);
        this.nombre = nombre;
    }

    //Metodos
    @Override
    public void vuela(){
        System.out.println("No puedo volar");
    }
    
}
