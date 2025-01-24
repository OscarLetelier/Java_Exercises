public class Camion extends Vehiculo{
    private double cargaMaxima;

    public Camion(String marca, String modelo, double tarifaDiaria, double cargaMaxima) {
        super(marca, modelo, tarifaDiaria);
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public double calcularCostoReserva(int dias) {
        return dias * getTarifaDiaria() + (cargaMaxima * 10);
    }

    @Override
    public String toString() {
        return super.toString() + ", Carga Maxima: " + cargaMaxima + " Toneladas";
    }
}
