package ar.edu.unlu.poo.p2;

import java.util.List;

public class Paquete {
    private String destino;

    private Proveedor transporte;

    private Proveedor hospedaje;

    private Proveedor excursiones;

    private int precio;

    public Paquete(String destino, Proveedor transporte, Proveedor hospedaje, Proveedor excursiones, int precio){
        this.destino = destino;
        this.transporte = transporte;
        this.hospedaje = hospedaje;
        this.excursiones = excursiones;
        this.precio = precio;
    }

    public String toString(){
        return "--- PAQUETE " + destino + " ---\n"
                + "DESTINO: " + destino + "\n"
                + "MEDIO DE TRANSPORTE: \n" + transporte + "\n"
                + "HOSPEDAJE: \n" + hospedaje + "\n"
                + "EXCURSIONES: \n" + excursiones + "\n"
                + "PRECIO: $" + precio + "\n"
                + "--------------------------\n";
    }

    public String getDestino() {
        return destino;
    }

    public Proveedor getHospedaje() {
        return hospedaje;
    }

    public Proveedor getTransporte() {
        return transporte;
    }

    public Proveedor getExcursiones() {
        return excursiones;
    }

    public int getPrecio() {
        return precio;
    }
}
