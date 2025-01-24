public class Accesorio extends Producto{
    private double descuento;

    public Accesorio(String nombre, double precioBase, Proveedor proveedor, double descuento) {
        super(nombre, precioBase, proveedor);
        this.descuento = descuento;
    }

    @Override
    public double calcularPrecio() {
        return getPrecioBase() - descuento;
    }

    @Override
    public String toString() {
        return super.toString() + ", Descuento: $" + descuento;
    }
}
