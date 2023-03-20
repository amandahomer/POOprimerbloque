package Ejercicio8;

public class Terminal {
    //Atributos
    private String numAsociado;
    private int tiempoConver;
    //Constructor
    public Terminal(String numAsociado){
        this.numAsociado = numAsociado;
        this.tiempoConver = 0;
    }

    //Metodos
    public String getNumAsociado() {
        return numAsociado;
    }
    public void setNumAsociado(String numNuevo) {
        this.numAsociado = numNuevo;
    }
    public int getTiempoConver() {
        return tiempoConver;
    }
    public void setTiempoConver(int tiempoConverNuevo) {
        this.tiempoConver = tiempoConverNuevo;
    }
    public void llama(Terminal x, int tiempoLlamada) {
        this.tiempoConver += tiempoLlamada;
        x.tiempoConver += tiempoLlamada;
    }
    @Override
    public String toString() {
        return "Nº " + numAsociado + " - " + this.tiempoConver + "s de conversación ";
    }
}
