package dominio;

public class VideojuegoDeportivo extends Videojuego {
    private final String deporte;

    public VideojuegoDeportivo(String titulo, String plataforma, int puntuacion,
                               int horasJugadas, String deporte) {
        super(titulo, plataforma, puntuacion, horasJugadas);
        this.deporte = deporte;
    }

    public String getDeporte() { return deporte; }

    @Override
    public String descripcion() {
        return super.descripcion() + " - Deporte: " + deporte;
    }
}
