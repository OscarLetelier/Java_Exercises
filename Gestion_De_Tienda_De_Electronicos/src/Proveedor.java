public class Proveedor {
    private String nombre;
    private String contacto;

    // Consturctor
    public Proveedor(String nombre, String contacto) {
        this.nombre = nombre;
        this.contacto = contacto;
    }

    // Metodos getters
    public String getNombre() {
        return nombre;
    }

    public String getContacto() {
        return contacto;
    }

    @Override
    public String toString() {
        return "Proveedor: " + nombre + ", Contacto: " + contacto;
    }
}

/*
    Un Producto tendra un objeto de tipo proveedor, mostrando la relacion "Tiene un"
 */
