package entidades;

public class Libro {
    private String titulo;
    private String autor;
    private Integer numeroPaginas;

    public Libro() {}

    public Libro(String titulo, String autor, Integer numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Libro:" +
                "Titulo='" + titulo + "\n" +
                "Autor='" + autor + "\n" +
                "NumeroPaginas=" + numeroPaginas +
                "\n";
    }
}
