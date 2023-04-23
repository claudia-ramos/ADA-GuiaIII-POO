package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Libreria {
    private ArrayList<Libro> libros;

    public Libreria() {
        libros = new ArrayList<>();
    }

    public Libreria(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public Libro crearLibro(String titulo, String autor, Integer numeroPaginas) {
        Libro libro = new Libro(titulo, autor, numeroPaginas);
        return libro;
    }

    public void agregarLibro() {
        Scanner scanner = new Scanner(System.in);
        String autor, titulo;
        Integer numeroPaginas;
        System.out.println("Ingrear el titulo del libro:");
        titulo = scanner.next();

        System.out.println("Ingrese el autor del libro: ");
        autor = scanner.next();

        System.out.println("Ingrese el numero de paginas del libro: ");
        numeroPaginas = scanner.nextInt();

        libros.add(crearLibro(titulo, autor, numeroPaginas));

    }

    public void verListadoCompleto() {
        for(Libro libro : libros) {
            System.out.println(libros.toString());
        }
    }

    public void verListadoMayorYIgual300Paginas() {
        for (Libro libro : libros) {
            if(libro.getNumeroPaginas() >= 300) {
                System.out.println(libro.toString());
            }
        }
    }

    public void verListadoMenor150Paginas() {
        for (Libro libro : libros) {
            if(libro.getNumeroPaginas() < 150) {
                System.out.println(libro.toString());
            }
        }
    }


}
