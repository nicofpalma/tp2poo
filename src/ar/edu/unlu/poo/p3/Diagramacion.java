package ar.edu.unlu.poo.p3;

import java.util.ArrayList;
import java.util.List;

public class Diagramacion {
    private String dias;
    private String horario;
    private Nivel nivel;
    private Profesor profesor;
    private Salon salon;
    private List<Alumno> alumnos;

    public Diagramacion(String dias, String horario, Nivel nivel, Profesor profesor, Salon salon){
        this.dias = dias;
        this.horario = horario;
        this.nivel = nivel;
        this.profesor = profesor;
        this.salon = salon;
        this.alumnos = new ArrayList<>();
    }

    public void inscribirAlumno(Alumno alumno){
        alumnos.add(alumno);
    }

    public void sumarIngresoProfesor(){
        profesor.sumarCobroMensual();
    }

    public String getHorario() {
        return horario;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public String getDias() {
        return dias;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public Salon getSalon() {
        return salon;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }
}
