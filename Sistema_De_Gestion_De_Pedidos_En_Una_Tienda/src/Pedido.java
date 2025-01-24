import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Pedido implements GestionPedidos<Producto> {
    private List<Producto> productos;

    public Pedido() {
        this.productos = new ArrayList<>();
    }

    @Override
    public void agregarProducto(Producto producto) throws PedidoInvalidoException {
        if (producto.getPrecio() <= 0 || producto.getCantidad() <= 0) {
            throw new PedidoInvalidoException("El producto tiene un precio o cantidad inválidos.");
        }
        productos.add(producto);
    }

    @Override
    public double calcularTotal() {
        return productos.stream()
                .mapToDouble(Producto::calcularCosto)
                .sum();
    }

    @Override
    public void mostrarProductos() {
        productos.forEach(System.out::println);
    }

    public List<Producto> filtrarPorPrecio(double precioMinimo) {
        return productos.stream()
                .filter(producto -> producto.getPrecio() >= precioMinimo)
                .collect(Collectors.toList());
    }

    public List<Producto> ordenarPorNombre() {
        return productos.stream()
                .sorted((p1, p2) -> p1.getNombre().compareToIgnoreCase(p2.getNombre()))
                .collect(Collectors.toList());
    }
}

