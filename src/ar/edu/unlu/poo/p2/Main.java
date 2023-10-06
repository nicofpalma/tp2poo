package ar.edu.unlu.poo.p2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String args[]){
        // AGENCIA SUNBEACH
        Agencia sunBeach = new Agencia("SunBeach");

        // Proveedores medios de transporte
        Proveedor proveedorAviones = new Proveedor("Aerolineas Argentinas", TipoProveedor.MEDIOS_DE_TRANSPORTE, "aerolineas@argentinas.com.ar");
        Proveedor proveedorCruceros = new Proveedor("Cruceros Launch", TipoProveedor.MEDIOS_DE_TRANSPORTE, "cruceroslaunch@info.com");
        Proveedor proveedorMicros = new Proveedor("Micros Jorge", TipoProveedor.MEDIOS_DE_TRANSPORTE, "microsjorge@info.com");

        // Proveedores hospedajes
        Proveedor proveedorHotelesBookit = new Proveedor("Bookit", TipoProveedor.HOSPEDAJES, "bookit@info.com");
        Proveedor proveedorHosteriasMateo = new Proveedor("Hosterias Mateo", TipoProveedor.HOSPEDAJES, "hosteriasmateo@gmail.com");
        Proveedor proveedorBungalos = new Proveedor("Búngalos Joaquín", TipoProveedor.HOSPEDAJES, "joaquinbungalos@gmail.com");

        // Proveedores excursiones
        Proveedor proveedorExcursionesMarta = new Proveedor("Excursiones Marta", TipoProveedor.EXCURSIONES, "excursionesmarta@gmail.com");
        Proveedor proveedorExcursionesTomas = new Proveedor("Excursiones Tomas", TipoProveedor.EXCURSIONES, "tomasexcursiones@info.com");
        Proveedor proveedorExcursionesNicolas = new Proveedor("Excursiones Nicolas", TipoProveedor.EXCURSIONES, "nicolasexcursiones@info.com");

        Paquete paqueteBsAs = new Paquete("Buenos Aires", proveedorAviones, proveedorHosteriasMateo, proveedorExcursionesNicolas, 10000);
        sunBeach.agregarPaquete(paqueteBsAs);

        Paquete paqueteMadrid = new Paquete("Rio de Janeiro", proveedorCruceros, proveedorBungalos, proveedorExcursionesMarta, 500000);
        sunBeach.agregarPaquete(paqueteMadrid);

        Paquete paqueteBariloche = new Paquete("Bariloche", proveedorMicros, proveedorHotelesBookit, proveedorExcursionesTomas, 30000);
        sunBeach.agregarPaquete(paqueteBariloche);

        System.out.println(sunBeach.verListaDeProveedores());
        System.out.println(sunBeach.verListaDePaquetes());

        Cliente juanPerez = new Cliente("Juan", "Perez", "juanperez@gmail.com");
        Cliente joseLopez = new Cliente("Jose", "Lopez", "joselopez@gmail.com");
        Cliente mariaGonzalez = new Cliente("María", "González", "mariagonzalez@gmail.com");
        Cliente marcosGomez = new Cliente("Marcos", "Gomez", "marcosgomez@gmail.com");
        Cliente josefinaLopez = new Cliente("Josefina", "Lopez", "josefinalopez@gmail.com");

        sunBeach.agregarCliente(juanPerez);
        sunBeach.agregarCliente(joseLopez);
        sunBeach.agregarCliente(mariaGonzalez);
        sunBeach.agregarCliente(marcosGomez);
        sunBeach.agregarCliente(josefinaLopez);

        System.out.println(sunBeach.verListaDeClientes());

        sunBeach.comprarPaquete("Bariloche", josefinaLopez);
        sunBeach.comprarPaquete("Rio de Janeiro", marcosGomez);
        sunBeach.comprarPaquete("Bariloche", mariaGonzalez);
        sunBeach.comprarPaquete("Buenos Aires", juanPerez);
        sunBeach.comprarPaquete("Buenos Aires", marcosGomez);
        sunBeach.comprarPaquete("Buenos Aires", joseLopez);

        System.out.println(sunBeach.listadoDeComprasPorDestino());
    }
}
