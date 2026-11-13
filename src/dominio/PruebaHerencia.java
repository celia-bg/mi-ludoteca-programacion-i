
public class PruebaHerencia {
    public static void main(String[] args) {
        VideojuegoRol r = new VideojuegoRol("Baldurs Gate 3", "PS5", 9.7, 120, 35);
        VideojuegoDeportivo d = new VideojuegoDeportivo("FIFA 24", "PS5", 7.5, 60, "Fútbol");
        System.out.println(r.descripcion());
        System.out.println(d.descripcion());
        System.out.println(r.getTitulo() + " -> " + r.getNumeroMisiones() + " misiones"); 
    }
}