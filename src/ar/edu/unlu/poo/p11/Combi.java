package ar.edu.unlu.poo.p11;

public class Combi extends Vehiculo{
    public Combi(String patente) throws Exception {
        super(patente);
        setPrecioBaseDiario(4500);
    }

    @Override
    public double calcularCostoAlquiler(int dias) {
        double costo = getPrecioBaseDiario() * dias;
        return costo;
    }
}
