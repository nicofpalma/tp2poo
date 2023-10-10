package ar.edu.unlu.poo.p13.nuevo;
public class Ticket {
    private Vuelo vuelo;
    private Persona persona;
    private static int numeroPasajero = 0;
    public Ticket(Vuelo vuelo, Persona persona){
        this.vuelo = vuelo;
        this.persona = persona;
        ++Ticket.numeroPasajero;
    }
    public Persona getPasajero() {
        return persona;
    }
    public Vuelo getVuelo() {
        return vuelo;
    }

    public static int getNumeroPasajero() {
        return numeroPasajero;
    }
    public Persona getPersona() {
        return persona;
    }
}
