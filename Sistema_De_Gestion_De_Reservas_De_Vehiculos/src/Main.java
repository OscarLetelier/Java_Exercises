import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear Clientes
        Cliente cliente1 = new Cliente("Juan Perez", 3);
        Cliente cliente2 = new Cliente("Ana Lopez", 6);

        // Crear Vehiculos
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Auto("Toyora", "Corrola", 50, true));
        vehiculos.add(new Motocicleta("Yamaha", "YZF-R3", 30, true));
        vehiculos.add(new Camion("Volvo", "FH16", 100, 20));

        // Realizar Reservas
        System.out.println("\n==== Reservas de Vehiculos ====\n");
        for (Vehiculo vehiculo : vehiculos) {
            int dias = 3; // Duracion del alquiler
            double costo = vehiculo.calcularCostoReserva(dias);

            // Aplicar descuento para clentes frecuentes
            if (cliente2.esClienteFrecuente()) {
                costo *= 0.9; // 10% de descuento
            }

            System.out.println(cliente2.getNombre() + "ha reservado el vehiculo: ");
            System.out.println(vehiculo);
            System.out.println("Costo Total: $" + costo);
            System.out.println("-------------------------------");
        }
    }
}


/**
 *  Encapsulacion:
 *      Los datos privados de la clase tarifaDiaria, Marca, etc.) estan protegidos y se accede a ellos
 *      mediante getters
 *
 *  Herencia:
 *      Las clases derivadas (Auto, Motociclete, Camion) Heredan de la clase base Vehiculo
 *
 *  Polimorfismo:
 *      El metodo calcularCostoReserva se sobrescribe en cada subclase, mostrando comportamientos
 *      unicos.
 *
 *  Abstraccion:
 *      La interfaz reservable define un contrato comun que debe cumplir todas las clases
 *      que puedan ser reservadas
 *
 *  Uso de colecciones genericas:
 *      La lista ArrayList<Vehiculo> permite almacenar diferentes tipos de vehiculos y tratarlos de manera
 *      polimorfica
 */