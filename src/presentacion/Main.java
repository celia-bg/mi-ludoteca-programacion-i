package presentacion;

import dominio.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Paso 1: crear la ludoteca
        Ludoteca ludoteca = new Ludoteca();

        // Paso 2: añadir los juegos
        ludoteca.añadir(new Videojuego("Zelda", "Switch", 90, 40));
        ludoteca.añadir(new Videojuego("Hollow Knight", "PC", 95, 80));
        ludoteca.añadir(new VideojuegoRol("Baldurs Gate 3", "PS5", 97, 120, 35));
        ludoteca.añadir(new VideojuegoDeportivo("FIFA 24", "PS5", 75, 60, "Fútbol"));
        ludoteca.añadir(new VideojuegoEstrategia("Civilization VI", "PC", 88, 200, "Por turnos"));
        ludoteca.añadir(new VideojuegoOnline("Fortnite", "PC", 80, 150, 100));

        // Paso 3: listar
        System.out.println("=== Listado ===");
        ludoteca.listar();

        // Paso 4: buscar
        System.out.print("Título a buscar: ");
        String titulo = sc.nextLine();
        Videojuego encontrado = ludoteca.buscarPorTitulo(titulo);
        if (encontrado == null) {
            System.out.println("No existe ningún juego con el título \"" + titulo + "\".");
        } else {
            encontrado.mostrarFicha();
        }

        // Paso 5: estadísticas
        System.out.println("=== Estadísticas ===");
        System.out.println("Puntuación media: " + ludoteca.calcularPuntuacionMedia());
        Videojuego mejor = ludoteca.obtenerMejorValorado();
        if (mejor == null) {
            System.out.println("No hay juegos para elegir el mejor valorado.");
        } else {
            System.out.print("Mejor valorado: ");
            mejor.mostrarFicha();
        }

        sc.close();
    }
}
