package dominio;

import java.util.ArrayList;

/**
 * Ludoteca agrupa referencias a videojuegos creados de forma independiente
 * (relación de agregación). La colección es privada: Main no conoce el ArrayList.
 */
public class Ludoteca {

    // REQ-02: atributo privado
    private ArrayList<Videojuegos> videojuegos;

    // REQ-02: se inicializa en el constructor
    public Ludoteca() {
        this.videojuegos = new ArrayList<>();
    }

    public void agregar(Videojuegos videojuego) {
        if (videojuego != null) {
            videojuegos.add(videojuego);
        }
    }

    public Videojuegos buscarPorTitulo(String titulo) {
        for (Videojuegos v : videojuegos) {
            if (v.getTitulo().equals(titulo)) {
                return v;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String resultado = "";
        for (Videojuegos v : videojuegos) {
            resultado += v.toString() + "\n";
        }
        return resultado;
    }
}