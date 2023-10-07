package ar.edu.unlu.poo.p10;

import java.time.LocalDate;

public class EmpleadoPasante extends Empleado{
    public EmpleadoPasante(String nombreYApellido, String telefono, String cuit, LocalDate fechaCumpleanios){
        super(nombreYApellido, telefono, cuit,fechaCumpleanios);
    }
    @Override
    public double calcularSueldo() {
        return super.calcularSueldo() + 0;
    }
}
