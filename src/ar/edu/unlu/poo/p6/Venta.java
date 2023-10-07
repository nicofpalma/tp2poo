package ar.edu.unlu.poo.p6;

import java.time.LocalDate;

public class Venta {
    private LocalDate fecha;
    private double importeTotal;
    private Cliente cliente;
    private Expendedor expendedor;
    private double cantidadLitros;
    private Empleado empleado;

    public Venta(Cliente cliente, Expendedor expendedor, double cantidadLitros, Empleado empleado){
        this.fecha = LocalDate.now();
        this.cliente = cliente;
        this.expendedor = expendedor;
        this.empleado = empleado;
        this.cantidadLitros = cantidadLitros;
        this.importeTotal = calcularMonto();
    }

    private double calcularMonto(){
        return cantidadLitros * expendedor.getCombustible().getPrecioVenta();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getCantidadLitros() {
        return cantidadLitros;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public Expendedor getExpendedor() {
        return expendedor;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public LocalDate getFecha() {
        return fecha;
    }
}
