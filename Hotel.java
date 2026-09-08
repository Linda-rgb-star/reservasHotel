import java.util.ArrayList;

public class Hotel {

    private String nombre;
    private ArrayList<Habitacion> habitaciones;
    private ArrayList<Huesped> huespedes;
    private ArrayList<Reserva> reservas;

    public Hotel(String nombre) {
        this.nombre = nombre;
        habitaciones = new ArrayList<>();
        huespedes = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public void registrarHuesped(Huesped huesped) {
        huespedes.add(huesped);
    }

    public void agregarReserva(Reserva reserva) {
        if (reserva != null) {
            reservas.add(reserva);
        }
    }

    public void eliminarReserva(Reserva reserva) {
        if (reservas.remove(reserva)) {

            System.out.println("Reserva eliminada correctamente.");

            // La habitación ni el huesped se eliminan.
            // Solo se elimina la relación que representaba la reserva.

            reserva.getHabitacion().cambiarEstado("Disponible");

        } else {
            System.out.println("La reserva no existe.");
        }
    }

    public void mostrarHabitacionesDisponibles() {

        System.out.println("Habitaciones Disponibles");

        for (Habitacion habitacion : habitaciones) {

            if (habitacion.getEstado().equals("Disponible")) {
                habitacion.mostrarDatos();
            }
        }
    }

    public void mostrarReservas() {

        System.out.println("Reservas del hotel");

        if (reservas.isEmpty()) {
            System.out.println("No hay reservas.");
        } else {

            for (Reserva reserva : reservas) {
                reserva.mostrarReserva();
            }
        }
    }
}
