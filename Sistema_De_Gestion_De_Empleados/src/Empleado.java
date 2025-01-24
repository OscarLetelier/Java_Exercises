public abstract class Empleado {
    private String nombre;
    private int id;

    // Constructor para inicializar los valores comunes a todos los empleados
    public Empleado(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    // Metodos para getter para acceder a los atributos privados
    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    // Metodo abstracto que implementado por las subclases
    public abstract double calcularSalario();

    // Metodo para mostrar la general del empleado
    public void mostrarInformacion() {
        System.out.println("ID: " + id + ", Nombre: " + nombre);
    }
}


/*
 Abstraccion: Creamos una clase abstracta Empleado que define la estructura comun para todos los empleados.
 Contiene un metodo abstracto calcularSalario que debe ser implementado por las subclases. Esto asegura que todas las
 subclases tengan un comportameinto especifico para calcular salarios.
 */
