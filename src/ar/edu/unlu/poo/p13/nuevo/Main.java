package ar.edu.unlu.poo.p13.nuevo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Rol tripulante = new Rol("Tripulante");
        Rol pasajero = new Rol("Pasajero");
        Persona persona1 = new Persona("Juan Perez", "234234", "Av 123", tripulante);
        Persona persona2 = new Persona("Jose Lopez", "2234213", "Av 123", pasajero);

        List<Persona> personas = new ArrayList<>();
        personas.add(persona1);
        personas.add(persona2);

        persona1.setRol(pasajero);

        Vuelo vuelo = new Vuelo(personas);
        Ticket ticket1 = new Ticket(vuelo, persona1);
        Ticket ticket2 = new Ticket(vuelo, persona2);


    }
}
