public class Cliente {
    private String nombre;
    private int reservasPrevias;

    public Cliente(String nombre, int reservasPrevias) {
        this.nombre = nombre;
        this.reservasPrevias = reservasPrevias;
    }

    public boolean esClienteFrecuente() {
        return reservasPrevias >= 5;
    }

    public String getNombre() {
        return nombre;
    }

    public void incrementarReservas() {
        reservasPrevias++;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre + ", Reservas Previas: " + reservasPrevias;
    }
}
