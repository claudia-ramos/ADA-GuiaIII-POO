import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<String> listadeNombres = new ArrayList<>();

        System.out.println("Ingrese la cantidad de nombres que va a ingresar");
        int N = input.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese un nombre: ");
            String nombre = input.next();
            listadeNombres.add(nombre);

        }
        listadeNombres.remove(1);
        listadeNombres.remove(3);
        Collections.sort(listadeNombres);

        System.out.println("El tamaño de la lista es: " + listadeNombres.size());


        for (String valor : listadeNombres) {
            System.out.println("El nombre ingresado es: " + valor);


        }
    }
}