package ar.edu.unlu.poo.p11;

import java.time.LocalDate;

public class Alquiler extends Presupuesto{
    private final double saldoAPagar;

    public Alquiler(Vehiculo vehiculo, LocalDate fechaInicio, LocalDate fechaFin, Cliente cliente, double saldoAPagar) {
        super(vehiculo, fechaInicio, fechaFin, cliente);
        this.saldoAPagar = saldoAPagar;
        cliente.agregarAlquiler(this);
    }
    public double getSaldoAPagar() {
        return saldoAPagar;
    }

    public String generarInformeDeAlquiler(){
        return "--- ALQUILER ---\n" +
                "VEHICULO: " + getVehiculo().getClass().getSimpleName() + "\n"
                + "FECHA INICIO: " + getFechaInicio() + "\n"
                + "FECHA FIN: " + getFechaFin() + "\n"
                + "CLIENTE: " + getCliente().getNombre();
    }
}

