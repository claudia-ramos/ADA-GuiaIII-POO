import javax.swing.text.StyledEditorKit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String fin = "";

        List<String> listaRazas = new ArrayList<>();

        do{
            System.out.println("Ingresar un tipo de raza de perro: ");
            listaRazas.add(scanner.next());

            System.out.println("Desea ingresar otra raza de perro? Ingrese 'S' o de lo contrario ingrese otro tipo de tecla para salir. ");
            fin = scanner.next();

        } while(fin.equalsIgnoreCase("S"));

        System.out.println("Las razas de perros agredas a la lista son: ");

        for (String raza : listaRazas) {
            System.out.println(raza);
        }

        //Ejercicip 4

        Iterator<String> iterador = listaRazas.iterator();
        Boolean encontrado = false;

        System.out.println("Ingresar la raza de perro que quiere eliminar de la lista: ");
        String razaEliminar = scanner.next();

        while(iterador.hasNext()) {
            String elemento = iterador.next();
            if (elemento.equals(razaEliminar)) {
                iterador.remove();
                encontrado = true;
            }
        }

        if (encontrado) {
            System.out.println("La raza de perro fue encontrada y eliminada de la lista. ");
        } else {
            System.out.println("La raza de perro no fue encontrada en la lista. ");
        }

        System.out.println("La lista actualizada es:");

        for (String raza : listaRazas) {
            System.out.println(raza);
        }

    }
}