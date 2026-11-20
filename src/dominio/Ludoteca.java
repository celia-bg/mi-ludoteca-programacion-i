package dominio;

import java.util.ArrayList;

public class Ludoteca {

    private ArrayList<Videojuego> videojuegos;

    public Ludoteca() {
        this.videojuegos = new ArrayList<>();
    }

    public void añadir(Videojuego videojuego) {
        if (videojuego != null) {
            videojuegos.add(videojuego);
        }
    }

    public Videojuego buscarPorTitulo(String titulo) {
        for (Videojuego v : videojuegos) {
            if (v.getTitulo().equals(titulo)) {
                return v;
            }
        }
        return null;
    }

    public void listar() {
        if (videojuegos.isEmpty()) {
            System.out.println("La ludoteca está vacía.");
            return;
        }
        for (Videojuego v : videojuegos) {
            v.mostrarFicha();
        }
    }

    public double calcularPuntuacionMedia() {
        if (videojuegos.isEmpty()) {
            return 0;
        }
        int suma = 0;
        for (Videojuego v : videojuegos) {
            suma += v.getPuntuacion();
        }
        return (double) suma / videojuegos.size();
    }

    public Videojuego obtenerMejorValorado() {
        Videojuego mejor = null;
        for (Videojuego v : videojuegos) {
            if (mejor == null || v.getPuntuacion() > mejor.getPuntuacion()) {
                mejor = v;
            }
        }
        return mejor;
    }

    @Override
    public String toString() {
        String resultado = "";
        for (Videojuego v : videojuegos) {
            resultado += v.toString() + "\n";
        }
        return resultado;
    }
}
