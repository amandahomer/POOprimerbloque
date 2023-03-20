package Ejercicio3;

public class Pinguino extends Ave {
    //Atributos
    super();

    //Constructor
    public Pinguino(String sexo){
        super(sexo);
    }

    //Metodos
    @Override
    public void vuela(){
        System.out.println("No puedo volar");
    }
    
}
