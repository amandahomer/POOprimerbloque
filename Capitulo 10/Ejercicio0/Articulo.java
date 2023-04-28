package Ejercicio0;

public class Articulo {
    //Atributos
    private int codigo;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int numUnidades;
    //Constructor
    public Articulo(int cod, String descrip, double precioC, double precioV, int numUnid){
        this.codigo = cod;
        this.descripcion = descrip;
        this.precioCompra = precioC;
        this.precioVenta = precioV;
        this.numUnidades = numUnid;
    }

    public Articulo(int cod) {
        this.codigo = cod;
    }

    //Metodos
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int cod){
        this.codigo = cod;
    }

    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descrip){
        this.descripcion = descrip;
    }

    public double getPrecioCompra(){
        return precioCompra;
    }
    public void setPrecioCompra(double precioC){
        this.precioCompra = precioC;
    }

    public double getPrecioVenta(){
        return precioVenta;
    }
    public void setPrecioVenta(double precioV){
        this.precioVenta = precioV;
    }

    public int getNumUnidades(){
        return numUnidades;
    }
    public void setNumUnidades(int numUnid){
        this.numUnidades = numUnid;
    }

    @Override
    public String toString(){
        String cadena = "";
        cadena += "\n| CODIGO: "+ this.codigo +" | DESCRIPCION: "+ this.descripcion +
        " | PRECIO COMPRA: "+ this.precioCompra +" | PRECIO VENTA: "+ this.precioVenta + 
        " | STOCK: "+ this.numUnidades +" |";
        return cadena;
    }

    /*Metodos array
    public static int posicion(String codigo){
        int contador = 0;
        for(int i = 0; i < array.size(); i++){
            contador++;
        }
        System.out.print("El tamaño del array es: "+ contador);
    }*/


}
