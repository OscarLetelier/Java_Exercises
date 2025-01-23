public class Producto {
    private String nombre;
    private String categoria;
    private double precio;

    //Constructor para inicializar valores del producto
    public Producto(String nombre, String categoria, double precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    // Metodos getter para acceder a los atributos privados
    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    // Metodo para mostrar la informacion del producto
    public void mostrarInformacion() {
        System.out.println("Producto: " + nombre);
        System.out.println("Categoria: " + categoria);
        System.out.println("Precio: " + precio);
    }
}
