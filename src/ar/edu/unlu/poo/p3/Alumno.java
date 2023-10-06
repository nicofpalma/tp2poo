package ar.edu.unlu.poo.p3;

public class Alumno {
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    public Alumno(String nombre, String apellido, String email, String telefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    public String toString(){
        return "NOMBRE Y APELLIDO: " + nombre + " " + apellido
                + "\nEMAIL: " + email
                + "\nTELEFONO: " + telefono;
    }
    public String getApellido() {
        return apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public String getEmail() {
        return email;
    }
    public String getTelefono() {
        return telefono;
    }
}
