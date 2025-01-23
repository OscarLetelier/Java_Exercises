import java.util.ArrayList;

// Clase que representa la tienda y gestiona productos
public class Tienda {
    private ArrayList<Producto> productos; // Lista de productos en la tienda

    // Constructor que inicializa la lista de productos
    public Tienda() {
        productos = new ArrayList<>();
    }

    // Metodo para agregar un producto a la tienda
    public void agregarProducto(Producto producto) {
        productos.add(producto); // Añade el produto a la lista
        System.out.println("Producto agregado: " + producto.getNombre());
    }


    // Metodo para listar todos los productos
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en la Tienda.");
        } else {
            System.out.println("Lista de productos en la Tienda:");
            for (Producto producto : productos) {
                producto.mostrarInformacion();
                System.out.println("-------------------");
            }
        }
    }

    // Metodo para listar productos por categorias
    public void listarPorCategoria(String categoria) {
        System.out.println("Productos en la categoria: " + categoria);
        boolean encontrado = false;
        for (Producto producto : productos) {
            if (producto.getCategoria().equalsIgnoreCase(categoria)) {
                producto.mostrarInformacion();
                System.out.println("---------------");
                encontrado = true;
            }
        }
        if(!encontrado) {
            System.out.println("No hay productos en esta categoria");
        }
    }
}
