public abstract class Vehiculo implements Reservable {
    private String marca;
    private String modelo;
    private double tarifaDiaria;


    // Constructor
    public Vehiculo(String marca, String modelo, double tarifaDiaria) {
        this.marca = marca;
        this.modelo = modelo;
        this.tarifaDiaria = tarifaDiaria;
    }

    // Metodos getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getTarifaDiaria() {
        return tarifaDiaria;
    }

    @Override
    public String toString() {
        return "Vehiculo [Marca: " + marca + ", Modelo: " + modelo + ", Tarifa Diaria: $" + tarifaDiaria + "]";
    }
}


/**
 * Encapsulacion y Herencia: Los atributos y metodos comunes estan en esta clase base abstracta
 */

