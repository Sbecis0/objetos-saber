import java.util.List;

public class Libro {
    private String isbn;
    private String titulo;
    private Editorial editorial;
    private List<Autor> autores;
    private Tema tema;

    public Libro(String isbn, String titulo, Editorial editorial, List<Autor> autores, Tema tema) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.editorial = editorial;
        this.autores = autores;
        this.tema = tema;
    }
    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public Tema getTema() {
        return tema;
    }
}
