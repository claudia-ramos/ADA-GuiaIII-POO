package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductoServicio {

    private ArrayList<Producto> productos;

    public ProductoServicio() {
        productos = new ArrayList<>();
    }

    public ProductoServicio(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public Producto crearProducto(String tipo, Integer cantidad, Integer precioUnidad) {
        Producto producto = new Producto(tipo, cantidad, precioUnidad);
        return producto;
    }

    public void agregarProductos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cargando la lista de productos: ");
        String tipo, fin = "";
        Integer cantidad, precioUnidad;

        do{
            System.out.println("Ingresar el tipo del producto: ");
            tipo = scanner.next();

            System.out.println("Ingresar la cantidad de producto: ");
            cantidad = scanner.nextInt();

            System.out.println("Ingresar el precio por unidad del producto: ");
            precioUnidad = scanner.nextInt();

            productos.add(crearProducto(tipo,cantidad,precioUnidad));

            System.out.println("Desa ingresar otro producto? Ingrese la tecla 'S' o en otro caso, ingrese otra tecla. ");
            fin = scanner.next();

        }while(fin.equalsIgnoreCase("S"));
    }

    public void verListadoCompleto() {
        System.out.println("La lista completa es: ");
        for(Producto producto : productos) {
            System.out.println(producto.toString());
        }
    }

    public void verListaMayorA20() {
        System.out.println("La lista de los productos de mayor precio de $20: ");
        for(Producto producto : productos) {
            if (producto.getPrecioUnidad() >= 20) {
                System.out.println(producto.toString());
            }

        }
    }

    public void verListaMenoresA100() {
        System.out.println("La lista de los productos de menor precio de $100: ");
        for(Producto producto : productos) {
            if (producto.getPrecioUnidad() < 100) {
                System.out.println(producto.toString());
            }

        }
    }


}
