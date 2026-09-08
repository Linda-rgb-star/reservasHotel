public class Habitacion {

    private int numero;
    private String tipo;
    private String estado;

    public Habitacion(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.estado = "Disponible";
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEstado() {
        return estado;
    }

    // Este método será utilizado únicamente por el Administrador
    public void cambiarEstado(String nuevoEstado) {
        if (nuevoEstado.equals("Disponible") ||
            nuevoEstado.equals("Ocupada") ||
            nuevoEstado.equals("Mantenimiento")) {

            estado = nuevoEstado;

        } else {
            System.out.println("Estado no válido.");
        }
    }

    public void mostrarDatos() {
        System.out.println(
            "Habitación " + numero +
            "Tipo: " + tipo +
            "Estado: " + estado
        );
    }
}
