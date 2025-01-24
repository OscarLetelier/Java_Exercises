public class Auto  extends Vehiculo {
    private boolean tieneGPS;

    public Auto(String marca, String modelo, double tarifaDiaria, boolean tieneGPS) {
        super(marca, modelo, tarifaDiaria);
        this.tieneGPS = tieneGPS;
    };

    @Override
    public double calcularCostoReserva(int dias) {
        double costo = dias * getTarifaDiaria();
        if (tieneGPS) {
            costo += 5 * dias; // Cargo adicional por GPS
        }
        return costo;
    }

    @Override
    public String toString() {
        return super.toString() + ", GPS: " + (tieneGPS ? "Si" : "No");
    }
}
