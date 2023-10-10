package ar.edu.unlu.poo.p11;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Alquiler> alquileres = new ArrayList<>();

    public Cliente(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public double montoTotalAlquileres(){
        double montoTotal = 0;
        for (int i = 0; i < alquileres.size(); i++) {
            montoTotal += alquileres.get(i).getSaldoAPagar();
        }
        return montoTotal;
    }

    public void agregarAlquiler(Alquiler alquiler) {
        alquileres.add(alquiler);
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public List<Alquiler> getAlquileres() {
        return alquileres;
    }

}

