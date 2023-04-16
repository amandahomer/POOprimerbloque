package Ejercicio2libro;

public abstract class Animal {
    //Atributos
    private String sexo;
    private int numPatas;

    //Constructor
    public Animal(){
        this.sexo = "macho";
        this.numPatas = 0;
    }

    public Animal(String sexo2) {
    }

    //Metodos
    public String getSexo(){
        return sexo;
    }
    public int getnumPatas(){
        return numPatas;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public void setNumPatas(int patas){
        this.numPatas = patas;
    }
    public void duerme(){
        System.out.println("Zzzzzz");
    }
    public void come(String comida){
        System.out.println("Estoy comiendo: "+ comida);
    }


    
}

