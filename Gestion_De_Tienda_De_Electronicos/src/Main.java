import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear proveedores
        Proveedor proveedor1 = new Proveedor("ElectroCorp", "contacto@electrocorp.com");
        Proveedor proveedor2 = new Proveedor("TechWorld", "soporte@techworld.com");

        // Crear productos
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Laptop("Dell XPS 13", 1200, proveedor1, 150));
        productos.add(new Smartphone("iPhone 14", 999, proveedor2, 10));
        productos.add(new Accesorio("Mouse Logitech", 50, proveedor1, 5));

        // Mostrar detalles y calcular precios
        System.out.println("=== Lista de Productos ===");
        for (Producto producto : productos) {
            System.out.println(producto);
            System.out.println("Precio Final: $" + producto.calcularPrecio());
            System.out.println("--------------------------");
        }

        // Calcular costo total del inventario
        double costoTotal = productos.stream().mapToDouble(Producto::calcularPrecio).sum();
        System.out.println("Costo Total del Inventario: $" + costoTotal);
    }
}


/*
    Encapsulacion
        - Los atributos de las clases estan protegidos mediante modificadores de acceso como private.
         Solo se accede a ellos mediante metodos getter

    Abstraccion:
        - Se utiliza la clase abstracta Producto y la interfaz PrecioCalculable para garantizar que todas las subclases
        implementen un comportamiento uniforme

    Herencia:
        - Laptop, Smartphone, Accesorios heredan de Producto, reutilizando atributos y metodos comunes

    Polimorfismo:
        - El metodo calcularPrecio se sobrescribe en cada subclase, permitiendo que cada producto tenga su propia
        logica de calculo

    Composicion:
        - Cada producto tiene un proveedor asociado, modelando la relacion "Tiene un"
 */