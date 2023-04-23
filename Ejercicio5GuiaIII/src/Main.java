import entidades.Alumno;
import entidades.AlumnoServicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AlumnoServicio listaAlumno = new AlumnoServicio();
        Scanner scanner = new Scanner(System.in);
        String fin = "", nombre;
        Integer nota1, nota2, nota3;

        listaAlumno.crearAlumnos("Fer", 10, 9, 8);
        listaAlumno.crearAlumnos("Maru", 10, 10, 10);


        System.out.println("Carga de lista de alumnos. ");
        do {
            System.out.println("Ingresar el nombre del alumno: ");
            nombre = scanner.next();

            System.out.println("Ingresar la primera nota del alumno: ");
            nota1 = scanner.nextInt();

            System.out.println("Ingresar la segunda nota del alumno: ");
            nota2 = scanner.nextInt();

            System.out.println("Ingresar la tercer nota del alumno: ");
            nota3 = scanner.nextInt();

            listaAlumno.crearAlumnos(nombre, nota1, nota2, nota3 );

            System.out.println("Desa ingresar otro alumno a la lista? Ingrese la tecla 'S' o de lo contrario ingrese otra tecla para salir. ");
            fin = scanner.next();


        } while(fin.equalsIgnoreCase("S"));

        System.out.println("La lista actualizada es: ");
        listaAlumno.verListado();

    }
}