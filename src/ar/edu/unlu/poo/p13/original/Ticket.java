package ar.edu.unlu.poo.p13.original;

public class Ticket {
    private Vuelo vuelo;
    private Pasajero pasajero;
    public Ticket(Vuelo vuelo, Pasajero pasajero){
        this.vuelo = vuelo;
        this.pasajero = pasajero;
    }
    public Pasajero getPasajero() {
        return pasajero;
    }
    public Vuelo getVuelo() {
        return vuelo;
    }
}
