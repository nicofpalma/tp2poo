package ar.edu.unlu.poo.p8;

public class Publicacion {
    private String titulo;
    private String editor;
    private String telefonoContacto;
    private int anioPublicacion;

    public Publicacion(String titulo, String editor, String telefonoContacto, int anioPublicacion){
        this.titulo = titulo;
        this.editor = editor;
        this.telefonoContacto = telefonoContacto;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEditor() {
        return editor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

}
