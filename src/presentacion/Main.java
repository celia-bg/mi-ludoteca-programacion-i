package presentacion;

import dominio.Ludoteca;
import dominio.Videojuegos;

public class Main {
    public static void main(String[] args) {
        Ludoteca ludoteca = new Ludoteca();
        Videojuegos v1 = new Videojuegos("Hollow Knight", "PC", 95, 40);
        Videojuegos v2 = new Videojuegos("Blasphemous", "Switch", 94, 25);
        Videojuegos v3 = new Videojuegos("God of War", "PS4", 85, 30);

        ludoteca.agregar(v1);
        ludoteca.agregar(v2);
        ludoteca.agregar(v3);

        System.out.println("=== Listado ===");
        System.out.print(ludoteca);

        System.out.println("=== Búsqueda existente ===");
        System.out.println(ludoteca.buscarPorTitulo("Hollow Knight"));

        System.out.println("=== Búsqueda inexistente ===");
        System.out.println(ludoteca.buscarPorTitulo("Tetris"));

        System.out.println("=== Ludoteca vacía ===");
        System.out.print(new Ludoteca());
    }
}
