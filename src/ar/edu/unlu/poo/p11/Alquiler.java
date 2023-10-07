package ar.edu.unlu.poo.p11;

import java.time.LocalDate;

public class Alquiler {
    private Presupuesto presupuesto;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double saldoAPagar;

    public Alquiler(Presupuesto presupuesto, LocalDate fechaInicio, LocalDate fechaFin) {
        this.presupuesto = presupuesto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.saldoAPagar = calcularSaldoAPagar();
    }


    private double calcularSaldoAPagar() {
        return presupuesto.calcularPresupuesto();
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public double getSaldoAPagar() {
        return saldoAPagar;
    }

    public Presupuesto getPresupuesto() {
        return presupuesto;
    }
}

