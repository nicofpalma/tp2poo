package ar.edu.unlu.poo.p6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Informes {
    private List<Venta> ventas;
    private List<Empleado> empleados;
    private List<Cliente> topClientesMesAnterior;

    public Informes(List<Venta> ventas, List<Empleado> empleados, List<Cliente> topClientesMesAnterior){
        this(ventas, empleados);
        this.topClientesMesAnterior = topClientesMesAnterior;
    }

    public Informes(List<Venta> ventas, List<Empleado> empleados){
        this.ventas = ventas;
        this.empleados = empleados;
        this.topClientesMesAnterior = new ArrayList<>();
    }

    // Cambiar a List<Cliente>
    public String informeTop10Clientes(){
        Map<Cliente, Double> ventasClientes = new HashMap<>();

        for(Venta venta : ventas){
            Cliente cliente = venta.getCliente();
            double montoActual = venta.getImporteTotal();

            if(ventasClientes.containsKey(cliente)){
                double sumaAnterior = ventasClientes.get(cliente);
                ventasClientes.put(cliente, sumaAnterior + montoActual);
            } else {
                ventasClientes.put(cliente, montoActual);
            }
        }

        // Ordenar el hashmap, transformarlo a list, y limitarlo a 10
        List<Map.Entry<Cliente, Double>> ventasOrdenadas = ventasClientes.entrySet().stream()
                .sorted((a, b) -> Double.compare(b.getValue(), a.getValue()))
                .limit(10)
                .collect(Collectors.toList());

        if(!topClientesMesAnterior.isEmpty()){
            topClientesMesAnterior.clear();
        }
        for(Map.Entry<Cliente, Double> entry : ventasOrdenadas){
            topClientesMesAnterior.add(entry.getKey());
        }

        String informe = "--- TOP 10 CLIENTES ---\n";
        for(Map.Entry<Cliente, Double> entry : ventasOrdenadas){
            double descuento = 0.0;

            if(topClientesMesAnterior.contains(entry.getKey())){
                descuento = entry.getValue() * 0.05;
            }

            informe += "Cliente: " + entry.getKey().getPatente() + " (monto total: $" + entry.getValue() + ", descuento: $" + descuento + ")\n";
        }

        return informe;
    }

    public String informeVentasPorCombustible(){
        int totalVentas = ventas.size();
        int ventasNafta = 0;
        int ventasGasoil = 0;
        int ventasKerosene = 0;

        for(Venta venta: ventas){
            switch(venta.getExpendedor().getCombustible()){
                case NAFTA:
                    ventasNafta++;
                    break;
                case GASOIL:
                    ventasGasoil++;
                    break;
                case KEROSENE:
                    ventasKerosene++;
                    break;
            }
        }

        double proporcionNafta = (double) ventasNafta / totalVentas * 100;
        double proporcionGasoil =  (double) ventasGasoil / totalVentas * 100;
        double proporcionKerosone = (double) ventasKerosene / totalVentas * 100;

        String informe = "--- INFORME DE VENTAS POR COMBUSTIBLE ---\n";
        informe += "TOTAL DE VENTAS: " + totalVentas + "\n"
                + "VENTAS DE NAFTA: " + ventasNafta + " (" + proporcionNafta + "%)\n"
                + "VENTAS DE GASOIL: " + ventasGasoil + " (" + proporcionGasoil + "%)\n"
                + "VENTAS DE KEROSENE: " + ventasKerosene + " (" + proporcionKerosone + "%)";

        return informe;
    }

    public String informeVentasPorExpendedor(){
        Map<Expendedor, Double> ventasExpendedor = new HashMap<>();

        for(Venta venta : ventas ){
            Expendedor expendedor = venta.getExpendedor();
            double importeActual = venta.getImporteTotal();

            if(ventasExpendedor.containsKey(expendedor)){
                double sumaAnterior = ventasExpendedor.get(expendedor);
                ventasExpendedor.put(expendedor, sumaAnterior + importeActual);
            } else {
                ventasExpendedor.put(expendedor, importeActual);
            }
        }

        List<Map.Entry<Expendedor, Double>> ventasOrdenadas = ventasExpendedor.entrySet().stream()
                .sorted((a, b) -> Double.compare(b.getValue(), a.getValue()))
                .collect(Collectors.toList());

        String informe = "--- INFORME DE VENTAS POR EXPENDEDOR ---\n";
        for(Map.Entry<Expendedor, Double> entry : ventasOrdenadas){
            informe += "Expendedor: " + entry.getKey().getIdExpendedor() + " - " + entry.getKey().getCombustible() + " (monto total: $" + entry.getValue() + ")\n";
        }
        return  informe;
    }

    public String informeLitrosPorExpendedor(){
        Map<Expendedor, Double> litrosExpendedor = new HashMap<>();

        for(Venta venta : ventas){
            Expendedor expendedor = venta.getExpendedor();
            double litrosActuales = venta.getCantidadLitros();

            if(litrosExpendedor.containsKey(expendedor)){
                double sumaAnterior = litrosExpendedor.get(expendedor);
                litrosExpendedor.put(expendedor, sumaAnterior + litrosActuales);
            } else {
                litrosExpendedor.put(expendedor, litrosActuales);
            }
        }

        List<Map.Entry<Expendedor, Double>> litrosOrdenados = litrosExpendedor.entrySet().stream()
                .sorted((a, b) -> Double.compare(b.getValue(), a.getValue()))
                .collect(Collectors.toList());

        String informe = "--- INFORME DE LITROS POR EXPENDEDOR ---\n";
        for(Map.Entry<Expendedor, Double> entry : litrosOrdenados){
            informe += "Expendedor: " + entry.getKey().getIdExpendedor() + " - " + entry.getKey().getCombustible() + " (litros totales: " + entry.getValue() + " litros)\n";
        }
        return informe;
    }

    public String informeVentasPorEmpleado(){
        Map<Empleado, Double> ventasEmpleado = new HashMap<>();

        for(Venta venta : ventas){
            Empleado empleado = venta.getEmpleado();
            double ventaActual = venta.getImporteTotal();

            if(ventasEmpleado.containsKey(empleado)){
                double sumaAnterior = ventasEmpleado.get(empleado);
                ventasEmpleado.put(empleado, sumaAnterior + ventaActual);
            } else {
                ventasEmpleado.put(empleado, ventaActual);
            }
        }
        List<Map.Entry<Empleado, Double>> litrosOrdenados = ventasEmpleado.entrySet().stream()
                .sorted((a, b) -> Double.compare(b.getValue(), a.getValue()))
                .limit(10)
                .collect(Collectors.toList());

        String informe = "--- INFORME DE VENTAS POR EMPLEADO ---\n";
        for(Map.Entry<Empleado, Double> entry : litrosOrdenados){
            informe += "Empleado: " + entry.getKey().getNombreYApellido() + " - DNI: " + entry.getKey().getDNI() + " (monto de ventas: $" + entry.getValue() + ")\n";
        }
        return informe;
    }
}
