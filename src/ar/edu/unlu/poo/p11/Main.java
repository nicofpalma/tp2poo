package ar.edu.unlu.poo.p11;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        AutoDePasajeros autoDePasajeros = new AutoDePasajeros("CBC-565", 4);

        //Combi combi = new Combi("CBC-565"); --> esto da un excepcion indicando que la patente esta en uso

        Combi combi = new Combi("ADC-232");
        AutoVIP autoVIP = new AutoVIP("LML-676");
        CamionCarga camionCarga = new CamionCarga("PLJ-111");
        CamionetaFlete camionetaFlete = new CamionetaFlete("POL-343", 10000);

        Cliente cliente1 = new Cliente("Nicolás Palma", "Av. 12312", "213423");
        Presupuesto presupuesto = new Presupuesto(autoDePasajeros, LocalDate.now().plusDays(2), LocalDate.now().plusDays(4), cliente1);
        Alquiler alquiler = new Alquiler(presupuesto, presupuesto.getFechaInicio(), presupuesto.getFechaFin());
        System.out.println(alquiler.getSaldoAPagar());

    }
}
