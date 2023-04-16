package Ejercicio2libro;

public class Gato extends Mamifero {
    //Atributos
    private String nombre;

    //Constructor
    public Gato(String sexo, String nombre){
        super(sexo);
        this.nombre = nombre;
    }
    public Gato(){
    
    }

    //Metodos
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void maulla(){
        System.out.println("Miauuu");
    }
    public void apareaCon(Gato novioa){
        if(this.sexo.equals(novioa.sexo)){
            throw new Exception();
        }
    }
}
