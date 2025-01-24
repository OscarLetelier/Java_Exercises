package interfaces;

import java.util.List;

public interface GestionPublicaciones<T> {
    void agregarPublicacion(T publicacion) throws PubliInvalidaException;

    List<T> buscarPorTitulo(String titulo);

    List<T> ordenarPorAno();

    int calcularTotalPaginas();
}
