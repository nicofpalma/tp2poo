package ar.edu.unlu.poo.p13.original;

public class Pasajero extends Persona{
    private int numeroDePasajero;
    public Pasajero(String nombre, String numeroDeTelefono, String direccion, int numeroDePasajero){
        super(nombre, numeroDeTelefono, direccion);
        this.numeroDePasajero = numeroDePasajero;
    }

    public int getNumeroDePasajero() {
        return numeroDePasajero;
    }
}
