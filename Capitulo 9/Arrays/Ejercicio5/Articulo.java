package Ejercicio5;

public class Articulo {
    //Atributos
    private String codigo;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int numUnidades;
    //Constructor
    public Articulo(String cod, String descrip, double precioC, double precioV, int numUnid){
        this.codigo = cod;
        this.descripcion = descrip;
        this.precioCompra = precioC;
        this.precioVenta = precioV;
        this.numUnidades = numUnid;
    }

    public Articulo(String cod) {
        this.codigo = cod;
    }

    //Metodos
    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String cod){
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

    public String toString(){
        String cadena = "";
        cadena += "\nCodigo: "+ this.codigo;
        cadena += "\nDescrcipcion: "+ this.descripcion;
        cadena += "\nPrecio de Compra: "+ this.precioCompra;
        cadena += "\nPrecio de Venta: "+ this.precioVenta;
        cadena += "\nStock: "+ this.numUnidades;
        return cadena;
    }


}
