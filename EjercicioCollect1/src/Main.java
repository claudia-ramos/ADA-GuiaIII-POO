import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> listaNumeros = new ArrayList<Integer>();

        listaNumeros.add(2);
        listaNumeros.add(5);
        listaNumeros.add(12);
        listaNumeros.add(1);
        listaNumeros.add(4);
        listaNumeros.add(10);
        listaNumeros.add(3);

        System.out.println("Los numeros de la lista 1 son: ");
        for(Integer num : listaNumeros) {
            System.out.println(num);
        }

        listaNumeros.clear();

        System.out.println("Ingrese cuantos numero quiere agregar a la lista: ");
        int dimLista = scanner.nextInt();

        for(int i = 0; i < dimLista; i ++) {
            listaNumeros.add(scanner.nextInt());
        }

        System.out.println("Los numeros iungresados a la lista son: ");
        for(Integer num : listaNumeros) {
            System.out.println(num);
        }

    }
}