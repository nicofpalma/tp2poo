package ar.edu.unlu.poo.p2;

public class Cliente {
    private String nombre;
    private String apellido;
    private String email;

    public Cliente(String nombre, String apellido, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public String toString(){
        return "NOMBRE Y APELLIDO: " + nombre + " " + apellido + "\n"
                + "EMAIL: " + email + "\n";
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }
}
