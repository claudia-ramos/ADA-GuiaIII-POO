package entidades;

import java.util.Scanner;

public class Menu {

    public Menu() {}

    public void menu() {

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        SeriesServicio seriesServicio = new SeriesServicio();
        Boolean salir = false;
        String opcion = "";

        while(!salir) {

            System.out.println("\n" + " ----------- Sistema de carga de series. :) -----------" + "\n"
                    + "Ingresar una opcion para continuar:" + "\n"
                    + "-1 Agregar una serie. " + "\n"
                    + "-2 Listar la lista de series. " + "\n"
                    + "-3 Listar la lista de series de menos de 15 minutos. " + "\n"
                    + "-4 Listar la lista de series de mas de 40 minutos. " + "\n"
                    + "-5 Listar la lista de series de Romance. " + "\n"
                    + "-6 Listar la lista de series de Drama. " + "\n"
                    + "-7 Listar la lista de series de Comedia. " + "\n"
                    + "-8 Cerrar del sistema." + "\n"
                    + "Seleccion: ");

            opcion = scanner.next();

            switch (opcion) {
                case "1":
                    System.out.println("Agregar una serie: ");
                    seriesServicio.agregarSerie();
                    break;

                case "2":
                    seriesServicio.verListadoCompleto();
                    break;

                case "3":
                    seriesServicio.verListadoMenoresDe15Min();
                    break;

                case "4":
                    seriesServicio.verListadoMeyoresDe40Min();
                    break;

                case "5":
                    seriesServicio.verListadoRomance();
                    break;

                case "6":
                    seriesServicio.verListadoDrama();
                    break;

                case "7":
                    seriesServicio.verListadoComedia();
                    break;

                case "8":
                    System.out.println("Saliendo del sistema...");
                    salir = true;
                    break;

                default:
                    System.out.println("Ingrese una opcion valida. ");
            }


        }
    }
}