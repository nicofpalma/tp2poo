package ar.edu.unlu.poo.p1;

import java.util.ArrayList;
import java.util.List;

public class ClubDeportivo {
    private List<Socio> socios;
    private List<Actividad> actividades;

    public ClubDeportivo() {
        this.socios = new ArrayList<>();
        this.actividades = new ArrayList<>();
    }

    public void agregarActividad(Actividad actividad){
        this.actividades.add(actividad);
    }

    public void inscribirSocio(String nombre, String apellido, String telefono, String direccion, String email, Suscripcion suscripcion){
        Socio socio = new Socio(nombre, apellido, telefono, direccion, email, suscripcion);
        socios.add(socio);
    }

    public String generarReporteNuevosSocios(){
        String listaDeSocios = "";
        if(socios.isEmpty()){
            listaDeSocios = "No hay nuevos socios inscriptos este mes";
        } else {
            for (int i = 0; i < socios.size(); i++) {
                listaDeSocios += socios.get(i);
            }
        }

        return "--- REPORTE MENSUAL DE NUEVOS SOCIOS ---\n" + listaDeSocios;
    }

    public String listarActividadesPorSuscripcion(Suscripcion suscripcion){
        String listaDeActividadesPorSuscripcion = "";

        for (int i = 0; i < actividades.size(); i++) {
            if(actividades.get(i).getSuscripcionActividad() == suscripcion){
                listaDeActividadesPorSuscripcion += actividades.get(i);
            }
        }
        if(listaDeActividadesPorSuscripcion == ""){
            listaDeActividadesPorSuscripcion = "No hay actividades bajo la suscripción " + suscripcion;
        }

        return "--- LISTA DE ACTIVIDADES POR SUSCRIPCION " + suscripcion + "---\n" + listaDeActividadesPorSuscripcion;
    }

    public String listarSociosPorSuscripcion(Suscripcion suscripcion){
        String listaDeSociosPorSuscripcion = "";
        for (int i = 0; i < socios.size(); i++) {
            if(socios.get(i).getSuscripcion() == suscripcion){
                listaDeSociosPorSuscripcion += socios.get(i);
            }
        }
        if(listaDeSociosPorSuscripcion == ""){
            listaDeSociosPorSuscripcion = "No hay socios bajo la suscripcion " + suscripcion;
        }

        return "--- LISTA DE SOCIOS POR SUSCRIPCION " + suscripcion + "---\n" + listaDeSociosPorSuscripcion;
    }

    public List<Actividad> getActividades() {
        return actividades;
    }

    public List<Socio> getSocios() {
        return socios;
    }
}
