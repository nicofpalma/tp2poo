package ar.edu.unlu.poo.p11;

public class AutoVIP extends Vehiculo{

    public AutoVIP(String patente) throws Exception {
        super(patente);
    }

    @Override
    public double calcularCostoAlquiler(int dias) {
        double costo = super.getPrecioBaseDiario() * dias;
        costo += 500 * dias;
        return costo;
    }
}
