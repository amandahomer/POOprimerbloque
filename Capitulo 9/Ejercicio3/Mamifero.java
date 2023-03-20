package Ejercicio3;

public class Mamifero extends Animal {
    //Atributos
    super();
    private static int crias;

    //Constructor
    public Mamifero(String sexo){
        super(sexo);
        crias = 0;
    }

    //Metodos
    public void anda(){
        System.out.println("Estoy andando");
    }
    public int getCrias(){
        return crias;
    }
    public int setCrias(int numCrias){
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
