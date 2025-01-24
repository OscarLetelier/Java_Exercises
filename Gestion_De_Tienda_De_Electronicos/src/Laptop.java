public class Laptop extends Producto {
    private double costoAdicionalGarantia;

    public Laptop(String nombre, double precioBase, Proveedor proveedor, double costoAdicionalGarantia) {
        super(nombre, precioBase, proveedor);
        this.costoAdicionalGarantia = costoAdicionalGarantia;
    }

    @Override
    public double calcularPrecio() {
        return getPrecioBase() + costoAdicionalGarantia;
    }

    @Override
    public String toString() {
        return super.toString() + ", Garantia: $" + costoAdicionalGarantia;
    }
}
