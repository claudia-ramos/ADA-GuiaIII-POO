import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String fin = "";

        List<Integer> listadeNombresContactos = new ArrayList<>();

        do{
            System.out.println("Ingresar un numero de contacto: ");
            listadeNombresContactos.add(scanner.nextInt());

            System.out.println("Desea ingresar otro contacto a la lista? Presione1111365769 'S' para seguir o de lo contrario presione otra tecla. ");
            fin = scanner.next();

        } while(fin.equalsIgnoreCase("s"));


        System.out.println("La lista de contactos agregados es: ");

        for(Integer numero : listadeNombresContactos) {
            System.out.println(numero);
        }


    }
}