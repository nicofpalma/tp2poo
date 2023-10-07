package ar.edu.unlu.poo.p6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Expendedor expendedorNafta = new Expendedor(Combustible.NAFTA);
        Expendedor expendedorGasoil = new Expendedor(Combustible.GASOIL);
        Expendedor expendedorKerosene = new Expendedor(Combustible.KEROSENE);

        Empleado juanEmpleado = new Empleado("Juan Lopez", "Av 123", "4346834", "126456456");
        Empleado joseEmpleado = new Empleado("Jose Perez", "Av 654", "6756433", "96456456");
        Empleado mariaEmpleada = new Empleado("Maria Gonzalez", "Av 232", "6565456", "93482348");

        List<Empleado> empleados = new ArrayList<>();
        empleados.add(juanEmpleado);
        empleados.add(joseEmpleado);
        empleados.add(mariaEmpleada);

        Cliente cliente1 = new Cliente("ABC-123");
        Cliente cliente2 = new Cliente("DFE-546");
        Cliente cliente3 = new Cliente("LGF-455");
        Cliente cliente4 = new Cliente("LOJ-765");

        Venta venta1 = new Venta(cliente1, expendedorNafta, 200, mariaEmpleada);
        Venta venta2 = new Venta(cliente2, expendedorGasoil, 40, juanEmpleado);
        Venta venta3 = new Venta(cliente3, expendedorGasoil, 77, joseEmpleado);
        Venta venta4 = new Venta(cliente1, expendedorKerosene, 45, juanEmpleado);
        Venta venta5 = new Venta(cliente1, expendedorGasoil, 88, juanEmpleado);
        Venta venta6 = new Venta(cliente3, expendedorKerosene, 76, joseEmpleado);
        Venta venta7 = new Venta(cliente4, expendedorNafta, 65, mariaEmpleada);
        Venta venta8 = new Venta(cliente1, expendedorNafta, 155, mariaEmpleada);
        Venta venta9 = new Venta(cliente4, expendedorGasoil, 99, joseEmpleado);
        Venta venta10 = new Venta(cliente1, expendedorKerosene, 45.4, juanEmpleado);

        List<Venta> ventas = new ArrayList<>();
        ventas.add(venta1);
        ventas.add(venta2);
        ventas.add(venta3);
        ventas.add(venta4);
        ventas.add(venta5);
        ventas.add(venta6);
        ventas.add(venta7);
        ventas.add(venta8);
        ventas.add(venta9);
        ventas.add(venta10);

        Informes informes = new Informes(ventas, empleados);

        System.out.println(expendedorNafta);
        System.out.println(informes.informeVentasPorCombustible());
        System.out.println(informes.informeVentasPorExpendedor());
        System.out.println(informes.informeLitrosPorExpendedor());
        System.out.println(informes.informeVentasPorEmpleado());
        System.out.println(informes.informeTop10Clientes());
    }

}
