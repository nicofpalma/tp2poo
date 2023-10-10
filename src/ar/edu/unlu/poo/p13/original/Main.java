package ar.edu.unlu.poo.p13.original;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pasajero carlos = new Pasajero("Carlos Lopez", "123123", "Av. 123", 1);
        ReciboSueldo recibo = new ReciboSueldo("Recibo de sueldo 2/2023", 100000);
        Tripulante jorge = new Tripulante("Jorge Perez", "11231", "Av. 654", "Piloto", recibo);

        List<Persona> personas = new ArrayList<>();
        personas.add(carlos);
        personas.add(jorge);
        Vuelo vuelo1 = new Vuelo(personas);

        Ticket ticketCarlos = new Ticket(vuelo1, carlos);
        // Ticket ticketJorge = new Ticket(vuelo1, jorge); --> No se puede crear un ticket para un tripulante, solo para un pasajero.
    }
}
