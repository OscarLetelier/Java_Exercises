public class Smartphone extends Producto{
    private double impuestoAdicional;

    public Smartphone (String nombre, double precioBase, Proveedor proveedor, double impuestoAdicional) {
        super(nombre, precioBase, proveedor);
        this.impuestoAdicional = impuestoAdicional;
    }

    @Override
    public double calcularPrecio() {
        return getPrecioBase() + (getPrecioBase() * impuestoAdicional / 100);
    }

    @Override
    public String toString() {
        return super.toString() + ", Impuesto: " + impuestoAdicional + "%";
    }
}
