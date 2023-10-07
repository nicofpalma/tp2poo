package ar.edu.unlu.poo.p8;

public class Revista extends Publicacion{
    private String issn;
    private int numeroPublicacion;
    private int cantidadEjemplares;
    public Revista(String titulo, String editor, String telefonoContacto, String issn,
                   int numeroPublicacion, int anioPublicacion, int cantidadEjemplares){

        super(titulo, editor, telefonoContacto, anioPublicacion);
        this.issn = issn;
        this.numeroPublicacion = numeroPublicacion;
        this.cantidadEjemplares = cantidadEjemplares;
    }
    public String getIssn() {
        return issn;
    }

    public int getNumeroPublicacion() {
        return numeroPublicacion;
    }
}
