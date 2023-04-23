package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class PeliculaServicio {

    private ArrayList<Pelicula> peliculas;

    public PeliculaServicio() {
        peliculas = new ArrayList<>();
    }

    public PeliculaServicio(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public Pelicula crearPelicula(String titulo, String director, Integer duracion) {
        Pelicula pelicula = new Pelicula(titulo, director, duracion);
        return pelicula;
    }

    public void agregarPeliculas() {
        Scanner scanner = new Scanner(System.in);
        String titulo, director, fin = "";
        Integer duracion;

        System.out.println("Carga de peliculas en la lista");
        do {

            System.out.println("Ingresar el titulo de la pelicula: ");
            titulo = scanner.next();

            System.out.println("Ingresar el director de la pelicula: ");
            director = scanner.next();

            System.out.println("Ingresar la duracion de la pelicula en horas: ");
            duracion = scanner.nextInt();

            peliculas.add(crearPelicula(titulo, director, duracion));

            System.out.println("Desea ingresar otra pelicula a la lista? Ingrese la tecla 'S' o en otro caso ingrese otra tecla. ");
            fin = scanner.next();

        } while(fin.equalsIgnoreCase("S"));

    }

    public void verListadoCompleto() {
        System.out.println("La lista de pelicuas agregadas es: " + "\n");
        for(Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
    }

    public void verListadoPeliculasMayores2Horas() {
        System.out.println("La lista de peliculas que duran mas de 2 horas es: ");
        for(Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() >= 2) {
                System.out.println(pelicula.toString());
            }
        }
    }

    public void verListadoPeliculasMenores2Horas() {
        System.out.println("La lista de peliculas que duran menos de 2 horas es: ");
        for(Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() < 2) {
                System.out.println(pelicula.toString());
            }
        }
    }




}
