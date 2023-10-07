package ar.edu.unlu.poo.p11;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehiculo {
    private String patente;
    private double precioBaseDiario;

    private static List<String> patentes = new ArrayList<>();

    public Vehiculo(String patente) throws Exception {
        this.patente = patente;
        patenteYaExiste();
        Vehiculo.patentes.add(patente);
        this.precioBaseDiario = 3000;

    }
    public abstract double calcularCostoAlquiler(int dias);
    public String getPatente() {
        return patente;
    }

    private void patenteYaExiste() throws Exception {
        for(String patenteUnica : patentes){
            if(patente.equals(patenteUnica)){
                throw new Exception("La patente ya está en uso");
            }
        }
    }

    public void setPrecioBaseDiario(double precioBaseDiario) {
        this.precioBaseDiario = precioBaseDiario;
    }

    public double getPrecioBaseDiario() {
        return precioBaseDiario;
    }
}
