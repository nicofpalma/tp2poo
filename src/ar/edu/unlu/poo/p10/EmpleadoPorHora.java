package ar.edu.unlu.poo.p10;

import java.time.LocalDate;

public class EmpleadoPorHora extends Empleado{
    private int cantHorasTrabajadas;
    private int tarifaHora;

    public EmpleadoPorHora(String nombreYApellido, String telefono, String cuit, LocalDate fechaCumpleanios, int cantHorasTrabajadas, int tarifaHora){
        super(nombreYApellido,telefono,cuit, fechaCumpleanios);
        this.cantHorasTrabajadas = cantHorasTrabajadas;
        this.tarifaHora = tarifaHora;
    }
    @Override
    public double calcularSueldo() {
        double sueldo = cantHorasTrabajadas * tarifaHora;
        if(cantHorasTrabajadas > 40){
            sueldo *= 1.2;
        }
        return sueldo + super.calcularSueldo();
    }

    public int getCantHorasTrabajadas() {
        return cantHorasTrabajadas;
    }

    public int getTarifaHora() {
        return tarifaHora;
    }
}
