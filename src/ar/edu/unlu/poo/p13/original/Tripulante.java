package ar.edu.unlu.poo.p13.original;

public class Tripulante extends Persona{
    private String cargo;
    private ReciboSueldo reciboSueldo;
    public Tripulante(String nombre, String numeroDeTelefono, String direccion, String cargo, ReciboSueldo reciboSueldo){
        super(nombre, numeroDeTelefono, direccion);
        this.cargo = cargo;
        this.reciboSueldo = reciboSueldo;
    }
    public String getCargo() {
        return cargo;
    }
    public ReciboSueldo getReciboSueldo() {
        return reciboSueldo;
    }
}
