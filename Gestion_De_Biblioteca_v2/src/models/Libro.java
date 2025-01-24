package models;

public class Libro extends Publicacion {
    private String autor;

    public Libro(String titulo, int anoPublicacion, int paginas, String autor) {
        super(titulo, anoPublicacion, paginas);
        if (autor.isEmpty()) {
            throw new IllegalArgumentException("El autor no puede estar vacío.");
        }
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Autor: " + autor;
    }
}
