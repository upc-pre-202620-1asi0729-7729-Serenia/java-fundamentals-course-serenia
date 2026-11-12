public class SimuladorMascota {
    public static void main(String[] args) {
        Mascota m1 = new Mascota("Firulais", "Perro");
        Mascota m2 = new Mascota("Mishi", "Gato");

        m1.jugar();
        m1.jugar();

        System.out.println("Energia de Firulais: " + m1.getNivelEnergia());
        System.out.println("Energia de Mishi: " + m2.getNivelEnergia());

        m1.alimentar();
        m1.dormir();
    }
}
