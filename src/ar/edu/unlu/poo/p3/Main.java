package ar.edu.unlu.poo.p3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear listas de objetos
        List<Alumno> alumnos = new ArrayList<>();
        List<Diagramacion> diagramaciones = new ArrayList<>();
        List<Profesor> profesores = new ArrayList<>();
        List<Salon> salones = new ArrayList<>();
        List<Disciplina> disciplinas = new ArrayList<>();

        // Crear datos alumnos
        Alumno alumno1 = new Alumno("Juan", "Pérez", "juanperez@gmail.com", "1235435");
        Alumno alumno2 = new Alumno("María", "González", "mariagonzalez@gmail.com", "3453434");
        Alumno alumno3 = new Alumno("Luis", "Martínez", "luismartinez@gmail.com", "5678787");
        Alumno alumno4 = new Alumno("Ana", "Rodríguez", "anarodriguez@gmail.com", "9876543");
        Alumno alumno5 = new Alumno("Pedro", "Sánchez", "pedrosanchez@gmail.com", "6754321");
        Alumno alumno6 = new Alumno("Laura", "Fernández", "laurafernandez@gmail.com", "8765432");
        Alumno alumno7 = new Alumno("Carlos", "López", "carloslopez@gmail.com", "2345678");
        Alumno alumno8 = new Alumno("Lucía", "Gómez", "luciagomez@gmail.com", "3456789");
        Alumno alumno9 = new Alumno("Jorge", "Díaz", "jorgediaz@gmail.com", "4567890");

        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);
        alumnos.add(alumno5);
        alumnos.add(alumno6);
        alumnos.add(alumno7);
        alumnos.add(alumno8);
        alumnos.add(alumno9);

        // Crear datos para profesores
        Profesor profesor1 = new Profesor("Carlos", "Martínez");
        Profesor profesor2 = new Profesor("Laura", "Rodríguez");
        Profesor profesor3 = new Profesor("Jorge", "Ramírez");
        profesores.add(profesor1);
        profesores.add(profesor2);

        // Crear datos para salones
        Salon salon1 = new Salon("Salón A");
        Salon salon2 = new Salon("Salón B");
        salones.add(salon1);
        salones.add(salon2);

        // Crear datos disciplinas y diagramaciones
        Disciplina disciplinaTango = new Disciplina("Tango");
        Disciplina disciplinaSalsa = new Disciplina("Salsa");

        Diagramacion diagramacionTango1 = new Diagramacion("Lunes y viernes", "14hs", Nivel.INICIAL, profesor1, salon1);
        Diagramacion diagramacionTango2 = new Diagramacion("Martes y sábado", "09hs", Nivel.INTERMEDIO, profesor2, salon2);
        Diagramacion diagramacionSalsa1 = new Diagramacion("Miercoles y jueves", "18hs", Nivel.AVANZADO, profesor3, salon1);
        Diagramacion diagramacionSalsa2 = new Diagramacion("Lunes y miercoles", "08hs", Nivel.INICIAL, profesor3, salon1);

        diagramacionSalsa1.inscribirAlumno(alumno1);
        diagramacionSalsa1.inscribirAlumno(alumno2);
        diagramacionSalsa1.inscribirAlumno(alumno3);

        diagramacionTango2.inscribirAlumno(alumno7);
        diagramacionTango2.inscribirAlumno(alumno8);

        diagramacionTango1.inscribirAlumno(alumno6);
        diagramacionTango1.inscribirAlumno(alumno3);
        diagramacionTango1.inscribirAlumno(alumno4);
        diagramacionTango1.inscribirAlumno(alumno5);
        diagramacionTango1.inscribirAlumno(alumno9);

        disciplinaTango.agregarDiagramacion(diagramacionTango1);
        disciplinaTango.agregarDiagramacion(diagramacionTango2);
        disciplinaSalsa.agregarDiagramacion(diagramacionSalsa1);
        disciplinaSalsa.agregarDiagramacion(diagramacionSalsa2);

        diagramaciones.add(diagramacionTango1);
        diagramaciones.add(diagramacionTango2);
        diagramaciones.add(diagramacionSalsa1);
        diagramaciones.add(diagramacionSalsa2);

        disciplinas.add(disciplinaTango);
        disciplinas.add(disciplinaSalsa);

        // Asignar las listas a la academia
        Academia academiaDeDanzas = new Academia();

        academiaDeDanzas.setAlumnos(alumnos);
        academiaDeDanzas.setProfesores(profesores);
        academiaDeDanzas.setSalones(salones);
        academiaDeDanzas.setDisciplinas(disciplinas);

        System.out.println(academiaDeDanzas.disciplinaConMasIngresos());

    }

}
