package ar.edu.unlu.poo.p8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Biblioteca {
    private List<Libro> libros = new ArrayList<>();
    private List<Socio> socios = new ArrayList<>();
    private Map<Libro, Socio> librosEnPrestamo = new HashMap<>();
    private int cantPrestamos = 0;
    public String toString(){
        String mostrarLibros = "";
        for(int i = 0; i < libros.size(); i++){
            mostrarLibros += "\n------------------------------------------\n" +
                            libros.get(i).toString() +
                            "\n------------------------------------------\n" ;
        }
        return mostrarLibros;
    }

    public void agregarLibro(Libro libro){
        libros.add(libro);
    }

    public void prestarLibroPorTitulo(String titulo){
        int indiceLibro = buscarLibroPorTitulo(titulo);
        if(indiceLibro != -1){
            boolean prestado = libros.get(indiceLibro).prestarEjemplar();
            if(prestado){
                cantPrestamos++;
            }
        } else {
            System.out.println("\nEl libro que está intentando obtener, no existe en la biblioteca.\n");
        }
    }

    public void prestarLibroPorTitulo(String titulo, Socio socio){
        int indiceLibro = buscarLibroPorTitulo(titulo);
        if(indiceLibro != -1){
            boolean prestado = libros.get(indiceLibro).prestarEjemplar();
            if(prestado){
                cantPrestamos++;
                librosEnPrestamo.put(libros.get(indiceLibro), socio);
            }
        } else {
            System.out.println("\nEl libro que está intentando obtener, no existe en la biblioteca.\n");
        }
    }

    public void prestarLibroPorAutor(String autor){
        int indiceLibro = buscarLibroPorAutor(autor);
        if(indiceLibro != -1){
            boolean prestado = libros.get(indiceLibro).prestarEjemplar();
            if(prestado){
                cantPrestamos++;
            }
        } else {
            System.out.println("\nEl libro que está intentando obtener, no existe en la biblioteca.\n");
        }
    }

    public void prestarLibroPorAutor(String autor, Socio socio){
        int indiceLibro = buscarLibroPorAutor(autor);
        if(indiceLibro != -1){
            boolean prestado = libros.get(indiceLibro).prestarEjemplar();
            if(prestado){
                cantPrestamos++;
                librosEnPrestamo.put(libros.get(indiceLibro), socio);
            }
        } else {
            System.out.println("\nEl libro que está intentando obtener, no existe en la biblioteca.\n");
        }
    }

    public void prestarLibroPorIsbn(String isbn, Socio socio){
        int indiceLibro = buscarLibroPorIsbn(isbn);
        if(indiceLibro != -1){
            boolean prestado = libros.get(indiceLibro).prestarEjemplar();
            if (prestado){
                cantPrestamos++;
                librosEnPrestamo.put(libros.get(indiceLibro), socio);
            }
        } else {
            System.out.println("\nEl libro que está intentando obtener, no existe en la biblioteca.\n");
        }
    }
    public void prestarLibroPorIsbn(String isbn){
        int indiceLibro = buscarLibroPorIsbn(isbn);
        if(indiceLibro != -1){
            boolean prestado = libros.get(indiceLibro).prestarEjemplar();
            if (prestado){
                cantPrestamos++;
            }
        } else {
            System.out.println("\nEl libro que está intentando obtener, no existe en la biblioteca.\n");
        }
    }
    public int buscarLibroPorTitulo(String titulo){
        for(int i = 0; i < libros.size(); i++){
            if(libros.get(i).getTitulo().equalsIgnoreCase(titulo)){
                return i;
            }
        }
        return -1;
    }

    public int buscarLibroPorAutor(String autor){
        for(int i = 0; i < libros.size(); i++){
            if(libros.get(i).getAutor().equalsIgnoreCase(autor)){
                return i;
            }
        }
        return -1;
    }

    public int buscarLibroPorIsbn(String isbn){
        for(int i = 0; i < libros.size(); i++){
            if(libros.get(i).getISBN().equalsIgnoreCase(isbn)){
                return i;
            }
        }
        return -1;
    }

    public int getCantidadPrestamos(){
        return cantPrestamos;
    }

    public String cantidadDeEjemplaresDisponiblesLibros(){
        String informe = "--- CANTIDAD DE EJEMPLARES DISPONIBLES POR LIBRO ---\n";
        for (int i = 0; i < libros.size(); i++) {
            informe += libros.get(i).getTitulo() + " (" + libros.get(i).cantidadDeEjemplaresDisponibles() + ")\n";
        }
        return informe;
    }

    public String ejemplaresDeLibroEnPrestamo(){
        String informe = "--- EJEMPLARES EN PRESTAMO ---\n";
        for(Libro libro : librosEnPrestamo.keySet()){
            Socio socio = librosEnPrestamo.get(libro);
            informe += "Libro: " + libro.getTitulo() + " - Prestado a " + socio.getNombre() + "\n";
        }
        return informe;
    }

    public String getLibroConMasPaginas(Libro libroA, Libro libroB){
        int mayorCantPaginas = Integer.max(libroA.getNumPaginas(), libroB.getNumPaginas());
        String tituloDelMayor;
        if(mayorCantPaginas == libroA.getNumPaginas()){
            tituloDelMayor = libroA.getTitulo();
        } else {
            tituloDelMayor = libroB.getTitulo();
        }
        return tituloDelMayor;
    }


}
