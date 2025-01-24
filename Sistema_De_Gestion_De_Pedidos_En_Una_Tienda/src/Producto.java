public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        if (precio < 0 || cantidad < 0) {
            throw  new IllegalArgumentException("El precio o la cantidad no puede ser menor a 0");
        }
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double calcularCosto() {
        return precio * cantidad;
    }

    @Override
    public String toString() {
        return "Producto [Nombre: " + nombre + ", Precio: $" + precio + ", Cantidad: " + cantidad + "]";
    }
}
