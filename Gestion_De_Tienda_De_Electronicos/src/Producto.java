public abstract class Producto implements PrecioCalculable {
    private String nombre;
    private double precioBase;
    private Proveedor proveedor;

    public Producto(String nombre, double precioBase, Proveedor proveedor) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.proveedor = proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + ", Precio Base: $" + precioBase;
    }
}


