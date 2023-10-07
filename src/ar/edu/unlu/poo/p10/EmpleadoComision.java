package ar.edu.unlu.poo.p10;

import java.time.LocalDate;

public class EmpleadoComision extends Empleado{
    private int ventasRealizadas;
    private double porcentajeComision;
    public EmpleadoComision(String nombreYApellido, String telefono, String cuit, LocalDate fechaCumpleanios, int ventasRealizadas, double porcentajeComision){
        super(nombreYApellido, telefono, cuit, fechaCumpleanios);
        this.ventasRealizadas = ventasRealizadas;
        this.porcentajeComision = porcentajeComision;
    }
    @Override
    public double calcularSueldo() {
        return (ventasRealizadas * (ventasRealizadas * porcentajeComision)) + super.calcularSueldo();
    }

    public double calcularBonoCumpleanios(){
        return 0.005 * ventasRealizadas;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public int getVentasRealizadas() {
        return ventasRealizadas;
    }
}
