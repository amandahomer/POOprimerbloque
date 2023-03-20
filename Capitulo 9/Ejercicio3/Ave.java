package Ejercicio3;

public class Ave extends Animal {
    //Atributos
    super();
    private static int huevos;

    //Constructor
    public Ave(String sexo){
        super(sexo);
        huevos = 0;
    }

    //Metodos
    public void vuela(){
        System.out.println("Estoy volando");
    }
    public int gethuevos(){
        return huevos;
    }
    public int sethuevos(int numHuevos){
        this.huevos = numHuevos;
    }
    public void ponHuevo() {
        if (this.getSexo().equals("macho")) {
          System.out.println("No puedo poner huevos");
        } else {
          System.out.println("He puesto un huevo");
        }
      }
}
