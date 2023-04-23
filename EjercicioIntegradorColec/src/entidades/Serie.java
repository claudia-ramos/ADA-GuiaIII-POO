package entidades;

public class Serie {
    private String tipoCategoria;
    private Integer duracionMinutos;
    private String nombre;

    public Serie() {}

    public Serie(String nombre, String tipoCategoria, Integer duracionMinutos) {
        this.tipoCategoria = tipoCategoria;
        this.duracionMinutos = duracionMinutos;
        this.nombre = nombre;
    }

    public String getTipoCategoria() {
        return tipoCategoria;
    }

    public void setTipoCategoria(String tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }

    public Integer getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(Integer duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "SERIE:" + "\n" +
                "Nombre=" + nombre + "\n" +
                "TipoCategoria=" + tipoCategoria + "\n" +
                "DuracionMinutos=" + duracionMinutos + "\n" ;
    }
}
