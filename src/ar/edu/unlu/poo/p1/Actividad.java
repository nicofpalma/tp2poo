package ar.edu.unlu.poo.p1;

public class Actividad {
    private String actividad;
    private Suscripcion suscripcionActividad;

    public Actividad(String actividad, Suscripcion suscripcionActividad){
        this.actividad = actividad;
        this.suscripcionActividad = suscripcionActividad;
    }

    public String toString() {
        return "ACTIVIDAD: " + actividad + "\n"
                + "(SUSCRIPCION " + suscripcionActividad + ")\n"
                + "------------------------------------\n";
    }

    public String getActividad() {
        return actividad;
    }

    public Suscripcion getSuscripcionActividad() {
        return suscripcionActividad;
    }
}