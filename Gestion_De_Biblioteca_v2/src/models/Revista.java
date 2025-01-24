package models;

public class Revista extends Publicacion {
    private int numeroEdicion;

    public Revista(String titulo, int anoPublicacion, int paginas, int numeroEdicion) {
        super(titulo, anoPublicacion, paginas);
        if (numeroEdicion <= 0) {
            throw new IllegalArgumentException("El número de edición debe ser positivo.");
        }
        this.numeroEdicion = numeroEdicion;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    @Override
    public String toString() {
        return super.toString() + ", Edición: " + numeroEdicion;
    }
}
