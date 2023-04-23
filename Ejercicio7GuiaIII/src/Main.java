import entidades.ProductoServicio;

public class Main {
    public static void main(String[] args) {
        ProductoServicio productoServicio = new ProductoServicio();
        productoServicio.agregarProductos();
        productoServicio.verListadoCompleto();
        productoServicio.verListaMayorA20();
        productoServicio.verListaMenoresA100();
    }
}