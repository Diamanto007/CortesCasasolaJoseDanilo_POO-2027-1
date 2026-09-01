import java.util.Scanner;

public class MayorYParidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número entero: ");
        int a = scanner.nextInt();

        System.out.print("Ingresa el segundo número entero: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("El número mayor es: " + a);
        } else if (b > a) {
            System.out.println("El número mayor es: " + b);
        } else {
            System.out.println("Ambos números son iguales.");
        }

        int suma = a + b;
        if (suma % 2 == 0) {
            System.out.println("La suma de ambos (" + suma + ") es PAR.");
        } else {
            System.out.println("La suma de ambos (" + suma + ") es IMPAR.");
        }

        scanner.close();
    }
}
