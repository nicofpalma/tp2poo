package ar.edu.unlu.poo.p8;

import java.time.LocalDate;

public class Diario extends Publicacion{
    private LocalDate mesPublicacion;
    private LocalDate diaPublicacion;

    public Diario(String titulo, String editor, String telefonoContacto, int anioPublicacion, LocalDate mesPublicacion, LocalDate diaPublicacion){
        super(titulo, editor, telefonoContacto, anioPublicacion);
        this.mesPublicacion = mesPublicacion;
        this.diaPublicacion = diaPublicacion;
    }
    public LocalDate getMesPublicacion() {
        return mesPublicacion;
    }
    public LocalDate getDiaPublicacion() {
        return diaPublicacion;
    }
}
