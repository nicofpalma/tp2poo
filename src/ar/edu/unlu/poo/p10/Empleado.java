package ar.edu.unlu.poo.p10;

import java.time.LocalDate;

public abstract class Empleado {
    private String nombreYApellido;
    private String telefono;
    private String cuit;
    private LocalDate fechaCumpleanios;
    public Empleado(String nombreYApellido, String telefono, String cuit, LocalDate fechaCumpleanios){
        this.nombreYApellido = nombreYApellido;
        this.telefono = telefono;
        this.cuit = cuit;
        this.fechaCumpleanios = fechaCumpleanios;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNombreYApellido() {
        return nombreYApellido;
    }

    public String getCuit() {
        return cuit;
    }

    public LocalDate getFechaCumpleanios() {
        return fechaCumpleanios;
    }

    public double calcularSueldo() {
        double sueldo = 0.0;

        // Verificar si es el mes de cumpleaños
        LocalDate fechaActual = LocalDate.now();
        if (fechaActual.getMonthValue() == fechaCumpleanios.getMonthValue()) {
            sueldo += 2000.0;
            // Verificar el tipo de empleado
            if (this instanceof EmpleadoAsalariado) {
                sueldo += 1000.0; // Empleado asalariado cobra $1000 extra
            } else if (this instanceof EmpleadoComision) {
                // Calcular el 0.5% del bruto de ventas y agregarlo al sueldo
                sueldo += ((EmpleadoComision) this).calcularBonoCumpleanios();
            } else if (this instanceof EmpleadoComisionSalarioBase) {
                // Calcular el 0.5% del bruto de ventas y agregar $1000 extra al sueldo
                sueldo += ((EmpleadoComisionSalarioBase) this).calcularBonoCumpleanios();
                sueldo += 1000.0;
            }
        }

        return sueldo;
    }
}
