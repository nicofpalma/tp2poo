package ar.edu.unlu.poo.p8;

import java.time.LocalDate;

public class Tesis extends Publicacion{
    private String autor;
    private LocalDate mesPublicacion;

    public Tesis(String titulo, String editor, String telefonoContacto, String autor, int anioPublicacion, LocalDate mesPublicacion){
        super(titulo, editor, telefonoContacto, anioPublicacion);
        this.autor = autor;
        this.mesPublicacion = mesPublicacion;
    }

    public String getAutor() {
        return autor;
    }

    public LocalDate getMesPublicacion() {
        return mesPublicacion;
    }
}
