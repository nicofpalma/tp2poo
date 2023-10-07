package ar.edu.unlu.poo.p11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Presupuesto {
    private Vehiculo vehiculo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Cliente cliente;

    public Presupuesto(Vehiculo vehiculo, LocalDate fechaInicio, LocalDate fechaFin, Cliente cliente) {
        this.vehiculo = vehiculo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public double calcularPresupuesto() {
        long dias = ChronoUnit.DAYS.between(fechaInicio, fechaFin);
        return vehiculo.calcularCostoAlquiler((int) dias);
    }
}
