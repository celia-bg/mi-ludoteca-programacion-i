package dominio;

public class VideojuegoEstrategia extends Videojuego {
    private String tipoEstrategia;

    public VideojuegoEstrategia(String titulo, String plataforma, int puntuacion,
                                int horasJugadas, String tipoEstrategia) {
        super(titulo, plataforma, puntuacion, horasJugadas);
        this.tipoEstrategia = tipoEstrategia;
    }

    public String getTipoEstrategia() { return tipoEstrategia; }

    @Override
    public String descripcion() {
        return super.descripcion() + " - Tipo de estrategia: " + tipoEstrategia;
    }
}
