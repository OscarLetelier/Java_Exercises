import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            Pedido pedido = new Pedido();

            // Agregar productos
            pedido.agregarProducto(new Producto("Manzana", 0.5, 10));
            pedido.agregarProducto(new Producto("Leche", 1.2, 2));
            pedido.agregarProducto(new Producto("Pan", 0.8, 5));
            pedido.agregarProducto(new Producto("Café", 3.5, 1));

            // Mostrar productos
            System.out.println("=== Productos en el Pedido ===");
            pedido.mostrarProductos();

            // Calcular total
            System.out.println("\nTotal del Pedido: $" + pedido.calcularTotal());

            // Filtrar productos por precio
            System.out.println("\n=== Productos con Precio Mayor o Igual a 1.0 ===");
            List<Producto> filtrados = pedido.filtrarPorPrecio(1.0);
            filtrados.forEach(System.out::println);

            // Ordenar productos por nombre
            System.out.println("\n=== Productos Ordenados por Nombre ===");
            List<Producto> ordenados = pedido.ordenarPorNombre();
            ordenados.forEach(System.out::println);

        } catch (PedidoInvalidoException e) {
            System.err.println("Error al agregar producto: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
