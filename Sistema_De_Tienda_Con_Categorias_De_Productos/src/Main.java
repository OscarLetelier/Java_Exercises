import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda(); // Crear una instancia de la tienda
        Scanner scanner = new Scanner(System.in); // Scanner para leer datos del usuario

        int opcion;

        // Menu interactivo para el usuario
        do {
            System.out.println("\n Menu de Tienda");
            System.out.println("1, Agregar producto");
            System.out.println("2, Listar todos los productos");
            System.out.println("3. Listar productos por categoria");
            System.out.println("4. Salir");
            System.out.println("Selcciona una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); //Consumir salto de linea

            switch (opcion) {
                case 1:
                    // Solicitar datos del producto al usuario
                    System.out.println("Introduce el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Introduce la categoria del producto: ");
                    String categoria = scanner.nextLine();
                    System.out.println("Introduce el precio del Producto: ");
                    double precio = scanner.nextDouble();

                    //Crear y agregar el producto en la tienda
                    Producto producto = new Producto (nombre, categoria, precio);
                    tienda.agregarProducto(producto);
                    break;

                case 2:
                    // Listar todos los productos de la tienda
                    tienda.listarProductos();
                    break;

                case 3:
                    // Solicitar la categoria a buscar
                    System.out.println("Introduce la categoria a buscar: ");
                    String categoriaBuscar = scanner.nextLine();
                    break;

                case 4:
                    // Salir del programa
                    System.out.println("Saliendo del sistema....");

                default:
                    // Opcion no valida
                    System.out.println("Opcion no valida. Intentelo de nuevo");
            }
        } while (opcion != 4);

        scanner.close(); // Cerrar el scanner al terminar
    }
}