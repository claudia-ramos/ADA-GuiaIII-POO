package entidades;

import java.util.Scanner;

public class Menu {

    public Menu() {}

    public void menu() {

        Scanner scanner = new Scanner(System.in);
        MascotaServicio mascotaServicio = new MascotaServicio();
        Boolean salir = false;
        String opcion = "";

        while(!salir) {

            System.out.println("\n" + " ----------- Sistema de carga -----------" + "\n"
            + "Ingresar una opcion para continuar:" + "\n"
            + "-1 Agregar mascota. " + "\n"
            + "-2 Listar la lista de mascotas. " + "\n"
            + "-3 Listar la lista de mascotas mayor a 6 anios. " + "\n"
            + "-4 Listar la lista de mascotas menores a 5 anios. " + "\n"
            + "- 5. Cerrar del sistema." + "\n"
            + "Seleccion: ");

            opcion = scanner.next();

            switch (opcion) {
                case "1":
                    System.out.println("Agregar mascota: ");
                    mascotaServicio.agregarMascota();
                    break;

                case "2":
                    mascotaServicio.verListadoCompleto();
                    break;

                case "3":
                    mascotaServicio.verListadoMayor6Anios();
                    break;

                case "4":
                    mascotaServicio.verListadoMenor5Anios();
                    break;

                case "5":
                    System.out.println("Fin del proceso.");
                    salir = true;
                    break;

                default:
                    System.out.println("Ingrese una opcion valida. ");
            }


        }
    }
}
