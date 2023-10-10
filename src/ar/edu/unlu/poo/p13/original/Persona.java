package ar.edu.unlu.poo.p13.original;

public class Persona {
    public String nombre;
    public String numeroDeTelefono;
    public String direccion;
    public Persona(String nombre, String numeroDeTelefono, String direccion){
        this.nombre = nombre;
        this.numeroDeTelefono = numeroDeTelefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNumeroDeTelefono() {
        return numeroDeTelefono;
    }
}
