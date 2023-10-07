package ar.edu.unlu.poo.p8;

public class Libro extends Publicacion{
    private String autor;
    private String isbn;
    private int numPaginas;
    private int numEjemplares;
    private int numEjemplaresPrestados = 0;
    public Libro(String titulo, String editor, String telefonoContacto, int anioPublicacion, String autor, String isbn, int numPaginas, int numEjemplares){
        super(titulo, editor, telefonoContacto, anioPublicacion);
        this.autor = autor;
        this.isbn = isbn;
        this.numPaginas = numPaginas;
        this.numEjemplares = numEjemplares;
    }

    public String toString(){
        return
                "El libro " + getTitulo()
                + " creado por el autor " + autor
                + " tiene " + numPaginas + " páginas, quedan "
                + cantidadDeEjemplaresDisponibles() + " disponibles y se prestaron " + numEjemplaresPrestados + ".";
    }
    public void setAutor(String autor) {this.autor = autor;}
    public String getAutor(){return autor;}
    public void setISBN(String isbn){this.isbn = isbn;}
    public String getISBN() {return isbn;}
    public void setNumPaginas(int numPaginas){this.numPaginas = numPaginas;}
    public int getNumPaginas() {return numPaginas;}
    public void setNumEjemplares(int numEjemplares) {this.numEjemplares = numEjemplares;}
    public int getNumEjemplares() {return numEjemplares;}
    public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {this.numEjemplaresPrestados = numEjemplaresPrestados;}
    public int getNumEjemplaresPrestados() {return numEjemplaresPrestados;}
    public int cantidadDeEjemplaresDisponibles() {return numEjemplares - numEjemplaresPrestados;}

    public boolean prestarEjemplar(){
        boolean prestado = false;
        if(cantidadDeEjemplaresDisponibles() > 1){
            numEjemplaresPrestados++;
            prestado = true;
        } else {
            System.out.println("\nNo quedan ejemplares disponibles del libro "  + getTitulo() + " para prestar.\n");
        }
        return prestado;
    }

    public boolean devolverEjemplar(){
        boolean devuelto = false;
        if(numEjemplaresPrestados > 0){
            numEjemplaresPrestados--;
            devuelto = true;
        } else {
            System.out.println("\n No hay ejemplares prestados para devolver.\n");
        }
        return devuelto;
    }

}
