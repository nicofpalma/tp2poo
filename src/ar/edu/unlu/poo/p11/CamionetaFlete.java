package ar.edu.unlu.poo.p11;

public class CamionetaFlete extends Vehiculo{
    private double pesoAutorizadoTotal;

    public CamionetaFlete(String patente, double pesoAutorizadoTotal) throws Exception {
        super(patente);
        this.pesoAutorizadoTotal = pesoAutorizadoTotal;
    }

    @Override
    public double calcularCostoAlquiler(int dias) {
        double costo = super.getPrecioBaseDiario() * dias;
        costo += 600 * pesoAutorizadoTotal * dias;
        return costo;
    }
}
