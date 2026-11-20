package dominio;

public class VideojuegoRol extends Videojuego {
    private int numeroMisiones;

    public VideojuegoRol(String titulo, String plataforma, int puntuacion,
                         int horasJugadas, int numeroMisiones) {
        super(titulo, plataforma, puntuacion, horasJugadas);
        this.numeroMisiones = numeroMisiones;
    }

    public int getNumeroMisiones() { return numeroMisiones; }

    // Ampliación: descripcion() específico
    @Override
    public String descripcion() {
        return super.descripcion() + " - Misiones principales: " + numeroMisiones;
    }
}
