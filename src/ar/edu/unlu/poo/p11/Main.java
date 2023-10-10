package ar.edu.unlu.poo.p11;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Alquiler> alquileres = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        AutoDePasajeros autoDePasajeros = new AutoDePasajeros("CBC-565", 4);

        //Combi combi = new Combi("CBC-565"); --> esto da un excepcion indicando que la patente esta en uso

        Combi combi = new Combi("ADC-232");
        AutoVIP autoVIP = new AutoVIP("LML-676");
        CamionCarga camionCarga = new CamionCarga("PLJ-111");
        CamionetaFlete camionetaFlete = new CamionetaFlete("POL-343", 10000);

        Cliente cliente1 = new Cliente("Nicolás Palma", "Av. 12312", "213423");
        Presupuesto presupuesto = new Presupuesto(autoDePasajeros, LocalDate.now().plusDays(2), LocalDate.now().plusDays(4), cliente1);
        Alquiler alquiler1 = presupuesto.generarAlquiler();
        alquileres.add(alquiler1);

        Presupuesto presupuesto2 = new Presupuesto(camionetaFlete, LocalDate.now().plusDays(10), LocalDate.now().plusDays(11), cliente1);
        Alquiler alquiler2 = presupuesto2.generarAlquiler();
        alquileres.add(alquiler2);

        System.out.println(alquiler1.getSaldoAPagar());
        System.out.println(alquiler1.generarInformeDeAlquiler());
        System.out.println("Monto total de alquileres para el cliente1: $" + cliente1.montoTotalAlquileres());

        double montoTotalAlquileres = 0;
        for (int i = 0; i < alquileres.size(); i++) {
            montoTotalAlquileres += alquileres.get(i).getSaldoAPagar();
        }
        System.out.println("Monto total de todos los alquileres: $" + montoTotalAlquileres);
    }
}
