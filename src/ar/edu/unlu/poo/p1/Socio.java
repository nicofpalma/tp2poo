package ar.edu.unlu.poo.p1;


public class Socio {
    private String nombre;

    private String apellido;

    private String telefono;

    private String direccion;

    private String email;

    private Suscripcion suscripcion;


    public Socio(String nombre, String apellido, String telefono, String direccion, String email, Suscripcion suscripcion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.suscripcion = suscripcion;
    }

    public String toString(){
        return
                "------------------------------------" + "\n"
                        + "NOMBRE: " + nombre + "\n"
                        + "APELLIDO: " + apellido + "\n"
                        + "TELEFONO: " + telefono + "\n"
                        + "DIRECCION: " + direccion + "\n"
                        + "EMAIL: " + email + "\n"
                        + "SUSCRIPCION " + suscripcion + "\n"
                        + "------------------------------------";
    }


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public Suscripcion getSuscripcion() {
        return suscripcion;
    }
}