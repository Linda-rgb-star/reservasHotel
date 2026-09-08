public class Reserva {

    private Huesped huesped;
    private Habitacion habitacion;
    private String fechaEntrada;
    private String fechaSalida;

    public Reserva(
        Huesped huesped,
        Habitacion habitacion,
        String fechaEntrada,
        String fechaSalida
    ) {
        this.huesped = huesped;
        this.habitacion = habitacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void mostrarReserva() {
        System.out.println("RESERVA");
        System.out.println("Huésped: " + huesped.getNombre());
        System.out.println("Habitación: " + habitacion.getNumero());
        System.out.println("Tipo: " + habitacion.getTipo());
        System.out.println("Entrada: " + fechaEntrada);
        System.out.println("Salida: " + fechaSalida);
    }
}
