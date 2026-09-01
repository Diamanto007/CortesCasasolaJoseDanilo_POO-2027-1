import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer lo que escribe el usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir el nombre
        System.out.print("¿Cómo te llamas? ");
        String nombre = scanner.nextLine();

        // Saludar al usuario
        System.out.println("¡Hola, " + nombre + "! Bienvenido a Java.");

        // Cerrar el scanner
        scanner.close();
    }
}
