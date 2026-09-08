public class Cliente {

    private String nombre;
    private String documento;

    public Huesped(String nombre, String documento) {
        this.nombre = nombre;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void consultarHabitacionesDisponibles(Hotel hotel) {
        hotel.mostrarHabitacionesDisponibles();
    }

    public Reserva realizarReserva(Habitacion habitacion, String fechaEntrada, String fechaSalida) {

        if (habitacion.getEstado().equals("Disponible")) {

            Reserva reserva = new Reserva(
                this,
                habitacion,
                fechaEntrada,
                fechaSalida
            );

            habitacion.cambiarEstado("Ocupada");

            System.out.println("Reserva realizada correctamente.");

            return reserva;

        } else {

            System.out.println(
                "No se puede realizar la reserva. " +
                "La habitación no está disponible."
            );

            return null;
        }
    }
}
