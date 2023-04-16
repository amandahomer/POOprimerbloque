package Ejercicio2libro;

public class Mamifero extends Animal {
    //Atributos
    private int crias;

    //Constructor
    public Mamifero(String sexo){
        super(sexo);
        crias = 0;
    }
    public Mamifero(){
      
    }

    //Metodos
    public void anda(){
        System.out.println("Estoy andando");
    }
    public int getCrias(){
        return crias;
    }
    public void setCrias(int numCrias){
        this.crias = numCrias;
    }
    public void tenCria() {
        if (this.getSexo().equals("macho")) {
          System.out.println("No puedo tener crias");
        } else {
          System.out.println("He tenido una cria");
        }
      }

}
