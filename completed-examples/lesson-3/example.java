public class TextoAventura {
    public static void main(String[] args) {
        String aliasJugador = "PixelMaster";
        int energia = 80;

        // Decisiones: if-else
        System.out.println(aliasJugador + " llega al puente colgante...");

        if (energia >= 50) {
            System.out.println("Tienes energia suficiente. ¡Cruzas el puente!");
        } else {
            System.out.println("Estas agotado. Descansa antes de cruzar.");
        }

        // Bucle for: cuenta regresiva
        System.out.println("Preparando el cohete...");

        for (int i = 5; i >= 1; i--) {
            System.out.println("Despegue en " + i);
        }

        System.out.println("¡Despegue!");

        // Bucle while: buscar 3 llaves
        int llaves = 0;

        while (llaves < 3) {
            llaves = llaves + 1;
            System.out.println("¡Encontraste una llave! Llaves: " + llaves);
        }

        System.out.println("Tienes las 3 llaves. ¡Puedes salir del laberinto!");

        // Solución del reto: sobrevive al laberinto
        boolean tieneLlaveDorada = true;

        System.out.println(aliasJugador + " encuentra un cofre en el laberinto...");

        if (tieneLlaveDorada) {
            System.out.println("¡Abres el cofre y encuentras 100 monedas!");
        } else {
            System.out.println("El cofre sigue cerrado. Necesitas la llave dorada.");
        }

        for (int intento = 1; intento <= 3; intento++) {
            System.out.println("Intento de salto " + intento);
        }
    }
}
