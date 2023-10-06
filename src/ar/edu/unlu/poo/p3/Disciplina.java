package ar.edu.unlu.poo.p3;
import java.util.List;
import java.util.ArrayList;

public class Disciplina {
    private String nombre;
    private List<Diagramacion> diagramaciones;
    public Disciplina(String nombre){
        this.nombre = nombre;
        this.diagramaciones = new ArrayList<>();
    }
    public int calcularIngresos(){
        int ingresos = 0;
        for (Diagramacion diagramacion : diagramaciones) {
            List <Alumno> alumnos = diagramacion.getAlumnos();
            for(Alumno alumno : alumnos){
                ingresos += 10;
            }
            diagramacion.sumarIngresoProfesor();
        }
        return ingresos;
    }
    public void agregarDiagramacion(Diagramacion diagramacion){
        diagramaciones.add(diagramacion);
    }
    public String getNombre() {
        return nombre;
    }
    public List<Diagramacion> getDiagramaciones() {
        return diagramaciones;
    }
}
