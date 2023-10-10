package ar.edu.unlu.poo.p13.nuevo;

public class Persona {
    public String nombre;
    public String numeroDeTelefono;
    public String direccion;
    public Rol rol;
    public Persona(String nombre, String numeroDeTelefono, String direccion, Rol rol){
        this.nombre = nombre;
        this.numeroDeTelefono = numeroDeTelefono;
        this.direccion = direccion;
        this.rol = rol;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
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
