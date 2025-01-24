public interface GestionPedidos<T> {
    void agregarProducto(T producto) throws PedidoInvalidoException;

    double calcularTotal();

    void mostrarProductos();
}
