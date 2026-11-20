package dominio;

public class VideojuegoOnline extends Videojuego {
    private int numeroJugadores;

    public VideojuegoOnline(String titulo, String plataforma, int puntuacion,
                            int horasJugadas, int numeroJugadores) {
        super(titulo, plataforma, puntuacion, horasJugadas);
        this.numeroJugadores = numeroJugadores;
    }

    public int getNumeroJugadores() { return numeroJugadores; }

    @Override
    public String descripcion() {
        return super.descripcion() + " - Jugadores: " + numeroJugadores;
    }
}
