package Ejercicio11;

import java.text.DecimalFormat;

public class TarjetaRegalo {
    //Atributos
    private double saldo;
    private String numero;
    //Constructor
    public TarjetaRegalo(double saldo) {
        this.saldo = saldo;
        this.numero = "";
        for(int i = 0; i <5; i++) {
            this.numero += (int)(Math.random()* 10);
        }
    }

    @Override
    public String toString() {
        DecimalFormat dosDecimales = new DecimalFormat("0.00");
        return "Tarjeta num " + numero + " Saldo "+ dosDecimales.format(saldo) + " euros";
    }

    public void gasta(double gasto) {
        if(gasto > saldo) {
            System.out.printf("No tiene suficiente saldo para gastar %.2f euros\n", gasto);
        } else {
            saldo -= gasto;
        }
        }
    

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public  TarjetaRegalo fusionaCon(TarjetaRegalo x) {
        double nuevoSaldo = this.getSaldo() + x.getSaldo();
        this.setSaldo(0);
        x.setSaldo(0);
        return new TarjetaRegalo(nuevoSaldo);
    }

}
