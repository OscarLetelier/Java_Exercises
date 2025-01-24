public class EmpleadoTiempoCompleto extends Empleado{
    private double salarioBase;

    // Constructor para inicializar el empleado de tiempo completo
    public EmpleadoTiempoCompleto(String nombre, int id, double salarioBase) {
        super(nombre, id);
        this.salarioBase = salarioBase;
    }

    // Implementacion dle metodo abstracto para calcular el salario
    @Override
    public double calcularSalario() {
        return salarioBase;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: Tiempo Completo, Salario Base: $" + salarioBase);
    }
}

/*
    Herencia: La clase EmpleadoTiempoComleto hereda de Empleado y reutiliza atributos y metodos comunes
    Polimorfismo: Se soobreescribe el metodo calcularSalario para calcular el salario especifico
    de un empleado de tiempo completo.
 */


