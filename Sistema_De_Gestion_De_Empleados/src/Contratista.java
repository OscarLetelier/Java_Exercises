public class Contratista extends Empleado{
    private double tarifaContrato;

    // Constructo para inicializar el contratista
    public Contratista(String nombre, int id, double tarifaContrato) {
        super(nombre, id);
        this.tarifaContrato = tarifaContrato;
    }

    // Implementacion del metodo abstracto para calcular el salario
    @Override
    public double calcularSalario() {
        return tarifaContrato;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: Contratista, Tarifa de Contrato $" + tarifaContrato);
    }
}

/*
    Polimorfismo: Se proporciona una implementacion unica del metodo
    calcularSalario para los contratistas, diferenciandose de los otros tipos de empleados
 */
