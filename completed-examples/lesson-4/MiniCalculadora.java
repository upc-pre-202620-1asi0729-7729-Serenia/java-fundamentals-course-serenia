import java.util.Scanner;

public class MiniCalculadora {
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = lector.nextLine();

        System.out.print("Ingresa primer numero entero: ");
        int numero1 = lector.nextInt();

        System.out.print("Ingresa segundo numero entero: ");
        int numero2 = lector.nextInt();

        int resultado = sumar(numero1, numero2);

        System.out.println("Hola " + nombre + ", el resultado de la suma es: " + resultado);

        lector.close();
    }
}
