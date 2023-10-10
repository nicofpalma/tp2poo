package ar.edu.unlu.poo.p13.original;

import java.util.ArrayList;
import java.util.List;

public class Vuelo {
    List<Persona> miembrosVuelo = new ArrayList<>();
    public Vuelo(List<Persona> personas){
        miembrosVuelo = personas;
    }

    public List<Persona> getMiembrosVuelo() {
        return miembrosVuelo;
    }

    public void setMiembrosVuelo(List<Persona> miembrosVuelo) {
        this.miembrosVuelo = miembrosVuelo;
    }

    public void addPersona(Persona persona){
        miembrosVuelo.add(persona);
    }
}
