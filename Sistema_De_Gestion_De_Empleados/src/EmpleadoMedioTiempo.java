public class EmpleadoMedioTiempo  extends Empleado {
    private double salarioPorHora;
    private int horasTrabajadas;

    // Constructor para inicializar el empleado de medio tiempo
    public EmpleadoMedioTiempo(String nombre, int id, double salarioPorHora, int horasTrabajadas) {
        super(nombre, id);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    // Implementacion del metodo abstracto para calcular el salario
    @Override
    public double calcularSalario() {
        return salarioPorHora * horasTrabajadas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: Medio Tiempo, Salario por Hora: $" + salarioPorHora + ", Horas Trabajadas: " + horasTrabajadas);
    }
}


/*
    Encapsulacion: Los atributos salarioPorHora y horasTrabajadas son privados, y se accede a ellos unicamente
    a traves del metodo calcularSalario
 */