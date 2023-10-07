package ar.edu.unlu.poo.p6;

public class Empleado {
    private String nombreYApellido;
    private String direccion;
    private String dni;
    private String telefono;

    public Empleado(String nombreYApellido, String direccion, String dni, String telefono) {
        this.nombreYApellido = nombreYApellido;
        this.direccion = direccion;
        this.dni = dni;
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDNI() {
        return dni;
    }

    public String getNombreYApellido() {
        return nombreYApellido;
    }
}
