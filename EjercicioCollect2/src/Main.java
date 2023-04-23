import javax.jws.soap.SOAPBinding;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> listaNombres = new ArrayList<>();
        listaNombres.add("Maria");
        listaNombres.add("Juan");
        listaNombres.add("German");
        listaNombres.add("Alvaro");
        listaNombres.add("Maru");

        System.out.println("Los nombres de la primer lista son: ");
        for(String nombre : listaNombres) {
            System.out.println(nombre);
        }

        System.out.println("Ingresar la cantidad de nombres que quiere ingresar a la segunda lista: ");
        int dimLista = scanner.nextInt();

        listaNombres.clear();

        System.out.println("Ingresar los nombres a la segunda lista: ");

        for(int i = 0; i < dimLista; i++) {
            listaNombres.add(scanner.next());
        }

        System.out.println("Los nombres ingresado en la segunda lista son: ");
        for(String nombre : listaNombres) {
            System.out.println(nombre);
        }

    }
}