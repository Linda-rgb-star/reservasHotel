public class Administrador {

    private String nombre;

    public Administrador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void cambiarEstadoHabitacion(Habitacion habitacion, String nuevoEstado) {
        habitacion.cambiarEstado(nuevoEstado);

        System.out.println(
            "El administrador " + nombre +
            " cambió el estado de la habitación " +
            habitacion.getNumero() +
            " a " + habitacion.getEstado()
        );
    }
}
