package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class SeriesServicio {
    ArrayList<Serie> series;

    public SeriesServicio() {
        series = new ArrayList<>();
    }

    public SeriesServicio(ArrayList<Serie> series) {
        this.series = series;
    }



    private void agregarALaLista(Serie serie) {
        series.add(serie);
    }

    public void agregarSerie() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        Serie serie = new Serie();
        String nombre, tipoCategoria;
        Integer duracionMinutos;

        System.out.println("Ingresar el nombre de la serie: ");
        nombre = scanner.next();
        serie.setNombre(nombre);

        System.out.println("Ingresar el tipo de categoria de la serie: ");
        tipoCategoria = scanner.next();
        serie.setTipoCategoria(tipoCategoria);

        System.out.println("Ingresar la duracion en minutos de la serie: ");
        duracionMinutos = scanner.nextInt();
        serie.setDuracionMinutos(duracionMinutos);

        agregarALaLista(serie);
    }

    public void verListadoCompleto() {
        for (Serie serie : series) {
            System.out.println(serie.toString());
        }
    }

    public void verListadoMenoresDe15Min() {
        for (Serie serie : series) {
            if (serie.getDuracionMinutos() < 15) {
                System.out.println(serie.toString());
            }
        }
    }

    public void verListadoMeyoresDe40Min() {
        for (Serie serie : series) {
            if (serie.getDuracionMinutos() > 40) {
                System.out.println(serie.toString());
            }
        }
    }

    public void verListadoRomance() {
        for (Serie serie : series) {
            if (serie.getTipoCategoria().equalsIgnoreCase("Romance")){
                System.out.println(serie);
            }
        }
    }

    public void verListadoComedia() {
        for (Serie serie : series) {
            if (serie.getTipoCategoria().equalsIgnoreCase("Comedia")){
                System.out.println(serie);
            }
        }
    }

    public void verListadoDrama() {
        for (Serie serie : series) {
            if (serie.getTipoCategoria().equalsIgnoreCase("Drama")){
                System.out.println(serie);
            }
        }
    }


}
