public class PerfilGamer {
    public static void main(String[] args) {
        String aliasJugador = "PixelMaster";
        int nivel = 1;
        double monedas = 250.50;
        boolean cuentaActiva = true;

        System.out.println("Jugador: " + aliasJugador);
        System.out.println("Nivel: " + nivel);
        System.out.println("Monedas: " + monedas);
        System.out.println("Cuenta activa: " + cuentaActiva);

        nivel = nivel + 1;
        monedas = monedas - 50.5;
        System.out.println("¡Subiste de nivel! Ahora eres nivel " + nivel);
        System.out.println("Monedas restantes: " + monedas);
    }
}