package Ejercicio9;

import Ejercicio8.Terminal;
import java.text.DecimalFormat;

public class Movil extends Terminal {
    //Atributos
    private String tarifa;
    private double tarificado;
    //Constructor
    public Movil(String numAsociado, String tarifa) {
        super(numAsociado);
        this.tarifa = tarifa;
        this.tarificado = 0;
    }

    //Metodos
    @Override
    public void llama(Terminal x, int tiempoLlamada) {
        super.llama(x, tiempoLlamada);
        double minutos = (double) tiempoLlamada / 60;

        switch(this.tarifa) {
            case "rata":
            this.tarificado += minutos * 0.06;
            break;
            case "mono":
            this.tarificado += minutos * 0.12;
            break;
            case "bisonte":
            this.tarificado += minutos * 0.30;
            break;
            default:
        }
    }

    @Override
    public String toString() {
        DecimalFormat formatoEuros = new DecimalFormat("0.00");
        return "Nº " + this.getNumAsociado() + " - " + this.getTiempoConver() + "seg de conversacion - tarificados " + formatoEuros.format(this.tarificado) + " euros";
    }

}
