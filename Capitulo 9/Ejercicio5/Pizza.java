package Ejercicio5;

public abstract class Pizza {
    //Atributos clase
    private static int totalPedidas = 0;
    private static int totalServidas = 0;
    //Atributos instancia
    private String tamanio;
    private String tipo;
    private String estado;

    //Constructor
    public Pizza(String tamanio, String tipo){
        this.tamanio = tamanio;
        this.tipo = tipo;
        this.estado = "pedida";
        Pizza.totalPedidas++;
    }

    //Metodos
    public int getTotalPedidas(){
        return Pizza.totalPedidas;
    }
    public int getTotalServidas(){
        return Pizza.totalServidas;
    } 
    public void sirve(){
        if (this.estado.equals("pedida")) {
            this.estado = "servida";
            Pizza.totalServidas++;
          } else {
            System.out.println("Ya se ha servido");
          }
    }
}
