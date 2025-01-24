package models;

public abstract class Publicacion {
    private String titulo;
    private int anoPublicacion;
    private int paginas;

    public Publicacion(String titulo, int anoPublicacion, int paginas) {
        if (titulo.isEmpty() || anoPublicacion < 0 || paginas <= 0) {
            throw new IllegalArgumentException("Datos inválidos para la publicación.");
        }
        this.titulo = titulo;
        this.anoPublicacion = anoPublicacion;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public int getPaginas() {
        return paginas;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Año: " + anoPublicacion + ", Páginas: " + paginas;
    }
}

