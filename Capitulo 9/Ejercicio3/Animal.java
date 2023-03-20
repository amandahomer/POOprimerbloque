package Ejercicio3;

public abstract class Animal {
    //Atributos
    private static String sexo;
    private static int numPatas;

    //Constructor
    public Animal(){
        this.sexo = "macho";
        this.numPatas = 0;
    }

    //Metodos
    public String getsexo(){
        return sexo;
    }
    public int getnumPatas(){
        return numPatas;
    }
    public String getSexo(String sexo){
        this.sexo = sexo;
    }
    public int setNumPatas(int patas){
        numPatas = patas;
    }
    public void duerme(){
        System.out.println("Zzzzzz");
    }
    public void come(String comida){
        System.out.println("Estoy comiendo: "+ comida);
    }


    
}

