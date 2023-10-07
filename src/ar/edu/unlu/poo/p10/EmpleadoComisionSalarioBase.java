package ar.edu.unlu.poo.p10;

import java.time.LocalDate;

public class EmpleadoComisionSalarioBase extends EmpleadoComision{
    private int salarioBase;
    public EmpleadoComisionSalarioBase(String nombreYApellido, String telefono, String cuit, LocalDate fechaCumpleanios, int ventasRealizadas, double porcentajeComision, int salarioBase){
        super(nombreYApellido, telefono, cuit, fechaCumpleanios, ventasRealizadas, porcentajeComision);
        this.salarioBase = salarioBase;
    }
    @Override
    public double calcularSueldo() {
        return super.calcularSueldo() + salarioBase;
    }
    public int getSalarioBase() {
        return salarioBase;
    }

    public double calcularBonoCumpleanios(){
        return 0.005 * salarioBase;
    }
}
