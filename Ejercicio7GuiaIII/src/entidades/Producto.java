package entidades;

import javax.sound.sampled.Port;

public class Producto {
    private String tipo;
    private int cantidad;
    private int precioUnidad;

    public Producto() {}

    public Producto(String tipo, int cantidad, int precioUnidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(int precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    @Override
    public String toString() {
        return "Producto:" +  "\n" +
                "Tipo='" + tipo + "\n" +
                "Cantidad=" + cantidad + "\n" +
                "PrecioUnidad=" + precioUnidad + "\n";
    }
}
