public class Main {

    public static void main(String[] args) {

        // crear el hotel
        Hotel hotel = new Hotel("Hotel Paraíso");

        // crear habitaciones
        Habitacion habitacion101 = new Habitacion(101, "Sencilla");
        Habitacion habitacion102 = new Habitacion(102, "Doble");
        Habitacion habitacion201 = new Habitacion(201, "Suite");

        // agregar habitaciones al hotel
        hotel.agregarHabitacion(habitacion101);
        hotel.agregarHabitacion(habitacion102);
        hotel.agregarHabitacion(habitacion201);

        // crear administrador
        Administrador administrador =
            new Administrador("Carlos");

        // crear huésped
        Huesped huesped =
            new Huesped("Linda", "1031809999");

        //registrar huésped
        hotel.registrarHuesped(huesped);

        System.out.println("\nHabitaciones disponibles:");
        huesped.consultarHabitacionesDisponibles(hotel);

        System.out.println("\nCambio de estado de habitación");

        administrador.cambiarEstadoHabitacion(
            habitacion201,
            "Mantenimiento"
        );

        // mostrar habitaciones disponibles nuevamente
        System.out.println("\nHabitaciones disponibles");

        huesped.consultarHabitacionesDisponibles(hotel);

        // el huésped realiza una reserva
        System.out.println("\nRealizando reserva");

        Reserva reserva = huesped.realizarReserva(
            habitacion101,
            "10/09/2026",
            "15/09/2026"
        );

        // guardar la reserva en el hotel
        hotel.agregarReserva(reserva);

        // mostrar las reservas
        System.out.println("\nReservas");

        hotel.mostrarReservas();

        System.out.println("\nHabitaciones disponibles");

        hotel.mostrarHabitacionesDisponibles();

        System.out.println("\nEliminando  reserva");

        hotel.eliminarReserva(reserva);

        // verificar que el huésped sigue existiendo
        System.out.println(
            "\nEl huésped continúa en el sistema: "
            + huesped.getNombre()
        );

        // verificar que la habitación sigue existiendo
        System.out.println(
            "La habitación continúa en el sistema: "
            + habitacion101.getNumero()
        );

        System.out.println("\nHabitaiciones disponibles");

        hotel.mostrarHabitacionesDisponibles();
    }
}
