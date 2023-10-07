package ar.edu.unlu.poo.p10;

import java.time.LocalDate;

public class EmpleadoAsalariado extends Empleado{
    private int salarioFijoMensual;
    public EmpleadoAsalariado(String nombreYApellido, String telefono, String cuit, LocalDate fechaCumpleanios, int salarioFijoMensual){
        super(nombreYApellido, telefono, cuit, fechaCumpleanios);
        this.salarioFijoMensual = salarioFijoMensual;
    }
    @Override
    public double calcularSueldo() {
        return super.calcularSueldo() + salarioFijoMensual;
    }

    public int getSalarioFijoMensual() {
        return salarioFijoMensual;
    }
}
