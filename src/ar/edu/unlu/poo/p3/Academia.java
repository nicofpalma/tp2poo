package ar.edu.unlu.poo.p3;
import java.util.ArrayList;
import java.util.List;

public class Academia {
    private List<Disciplina> disciplinas;
    private List<Salon> salones;
    private List<Alumno> alumnos;
    private List<Profesor> profesores;

    public Academia(){
        this.disciplinas = new ArrayList<>();
        this.salones = new ArrayList<>();
        this.alumnos = new ArrayList<>();
        this.profesores = new ArrayList<>();
    }

    public String disciplinaConMasIngresos(){
        String disciplinaMayor = "";
        int maxIngresos = 0;

        for(Disciplina disciplina : disciplinas){
            int ingresosDisciplina = disciplina.calcularIngresos();

            if(ingresosDisciplina > maxIngresos){
                maxIngresos = ingresosDisciplina;
                disciplinaMayor = disciplina.getNombre();
            }
        }

        return "La disciplina con más ingresos es " + disciplinaMayor + ", con $" + maxIngresos + " registrados.";
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public List<Salon> getSalones() {
        return salones;
    }

    public void setSalones(List<Salon> salones) {
        this.salones = salones;
    }
}
