package ar.edu.unlu.poo.p11;

public class AutoDePasajeros extends Vehiculo{
    private int cantidadAsientos;
    public AutoDePasajeros(String patente, int cantidadAsientos) throws Exception {
        super(patente);
        this.cantidadAsientos = cantidadAsientos;
    }

    @Override
    public double calcularCostoAlquiler(int dias) {
        double costo = getPrecioBaseDiario() * dias;
        costo += 300 * cantidadAsientos * dias;
        return costo;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }
}
