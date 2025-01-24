import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();

        // Agregar empleados de diferentes tipos
        empleados.add(new EmpleadoTiempoCompleto("Juan",1, 3000));
        empleados.add(new EmpleadoMedioTiempo("Ana", 2, 13, 80));
        empleados.add(new Contratista("Luis", 3, 2000));

        // Mostrar informacion de cada empleado y calcular sus salarios
        System.out.println("==== Lista de Empleados ====");
        for (Empleado empleado : empleados) {
            empleado.mostrarInformacion();
            System.out.println("Salario Calculado: $" + empleado.calcularSalario());
            System.out.println("------------------");
        }
    }
}

/*
    Abstraccion:
        - La clase abstracta Empleado establece una plantilla común para todos los empleados,
        asegurando que todos implementen el metodo calcularSalario.
        - Esto es util para definir un comportamiento uniforme y evitar duplicacion de codigo base.

    Herencia:
        - Las subclases (EmpleadoTiempoCompleto, EmpleadoMedioTiempo, y Contratista) heredan los atributos y
        metodos de Empleado, reutiliuzando código base.

    Polimorfismo:
        - Usamos el metodo calcularSalario de forma polimórfica. En la clase principal, tratamos todos los empleados
        como objetos de tipo Empleado, pero cada subclase proporciona su propia implementacion.

    Encapsulación:
        - Los atributos están protegidos mediante modificadores de acceso como private, y solo se acceden
        a ellos mediante métodos controlados.
 */