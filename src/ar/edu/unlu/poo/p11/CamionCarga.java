package ar.edu.unlu.poo.p11;

public class CamionCarga extends Vehiculo{
    public CamionCarga(String patente) throws Exception {
        super(patente);
        setPrecioBaseDiario(100000);
    }

    @Override
    public double calcularCostoAlquiler(int dias) {
        if(dias < 30){
            return 75000 * dias;
        } else {

            return getPrecioBaseDiario() * dias;
        }
    }


}
