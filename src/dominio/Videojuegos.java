package dominio;

public class Videojuegos{
    
    private String titulo;
    private String plataforma;
    private int puntuacion;
    private int horasJugadas;

    public Videojuegos(String titulo, String plataforma, int puntuacion, int horasJugadas) {
         setTitulo(titulo);
         setPlataforma(plataforma);
         setPuntuacion(puntuacion);
         setHorasJugadas(horasJugadas);

    }

    public Videojuegos(String titulo, String plataforma) {
        this(titulo, plataforma, 0, 0);
    }

    public String getTitulo() {
        return titulo;
    }

    public int setTitulo(String titulo) {
        if (titulo.isEmpty()) {
            return -1;
        }
        this.titulo = titulo;
        return 0;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public int setPuntuacion(int puntuacion) {
        if (puntuacion < 0 || puntuacion > 100) {
            return -1;
        }
        this.puntuacion = puntuacion;
        return 0;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public int setPlataforma(String plataforma) {
        if (plataforma.isEmpty()) {
            return -1;
        }
        this.plataforma = plataforma;
        return 0;
    }

    public int getHorasJugadas() {
        return horasJugadas;
    }

    public int setHorasJugadas(int horasJugadas) {
        if (horasJugadas < 0) {
            return -1;
        }
        this.horasJugadas = horasJugadas;
        return 0;
    }
    
    public String descripcion() {
        return toString();
    }

    @Override
    public String toString() {
        return titulo +  "(" + plataforma + ") - Puntuación: " + puntuacion
                + " - Horas: " + horasJugadas;
    }

    @Override
    public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
        return false;
    }
    Videojuegos otro = (Videojuegos) obj;
    return this.titulo.equals(otro.titulo);
}

@Override
public int hashCode() {
    return titulo.hashCode();
}
}