package ar.edu.unlu.poo.p8;

import java.time.LocalDate;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Libro libroRelatividad = new Libro("Teoría de la relatividad", "Jorge Morales", "765345654", LocalDate.now().minusYears(10).getYear(), "Albert Einstein", "978-980-14-2517-5", 3245, 10);
        Libro libroInfantil = new Libro("Juegos para niños", "Mario Perez", "3453474556", 2022, "Maria Lopez", "157-545-45-7645-1", 150, 1);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(libroRelatividad);
        biblioteca.agregarLibro(libroInfantil);

        Socio socio1 = new Socio("Marcos Perez");
        Socio socio2 = new Socio("Martina Gimenez");

        System.out.println("-----\nPrestando libro: Teoría de la relatividad");
        biblioteca.prestarLibroPorTitulo("Teoría de la relatividad", socio2);
        System.out.println("-----");

        System.out.println("-----\nPrestando libro por autor: Maria Lopez");
        biblioteca.prestarLibroPorAutor("Maria Lopez", socio1);
        System.out.println("-----");

        System.out.println(biblioteca);

        System.out.println("\nEl libro que tiene más páginas es " + biblioteca.getLibroConMasPaginas(libroInfantil, libroRelatividad) + ".");

        System.out.println("Cantidad de préstamos en total: " +biblioteca.getCantidadPrestamos());

        System.out.println(biblioteca.cantidadDeEjemplaresDisponiblesLibros());

        System.out.println(biblioteca.ejemplaresDeLibroEnPrestamo());
    }
}
