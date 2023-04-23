package entidades;

import java.util.Scanner;

public class Menu {

    public Menu() {}

    public void menu() {

        Scanner scanner = new Scanner(System.in);
        Libreria libreria = new Libreria();
        Boolean salir = false;
        String opcion = "";

        while(!salir) {

            System.out.println("\n" + " ----------- Sistema de carga -----------" + "\n"
                    + "Ingresar una opcion para continuar:" + "\n"
                    + "-1 Agregar libro. " + "\n"
                    + "-2 Listar la lista de libros. " + "\n"
                    + "-3 Listar la lista de libros de mas y/o igual de 300 paginas. " + "\n"
                    + "-4 Listar la lista de libros de menos de 150 paginas. " + "\n"
                    + "- 5. Cerrar del sistema." + "\n"
                    + "Seleccion: ");

            opcion = scanner.next();

            switch (opcion) {
                case "1":
                    System.out.println("Agregar libro: ");
                    libreria.agregarLibro();
                    break;

                case "2":
                    libreria.verListadoCompleto();
                    break;

                case "3":
                    libreria.verListadoMayorYIgual300Paginas();
                    break;

                case "4":
                    libreria.verListadoMenor150Paginas();
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
