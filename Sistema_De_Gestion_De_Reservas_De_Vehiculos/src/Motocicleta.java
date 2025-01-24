public class Motocicleta extends Vehiculo{
    private boolean incluyeCasco;

    public Motocicleta(String marca, String modelo, double tarifaDiaria, boolean incluyeCasco) {
        super(marca, modelo, tarifaDiaria);
        this.incluyeCasco = incluyeCasco;
    }

    @Override
    public double calcularCostoReserva(int dias) {
        return dias * getTarifaDiaria();
    }

    @Override
    public String toString() {
        return super.toString() + ", Incluye Casco: " + (incluyeCasco ? "Si" : "No");
    }
}
