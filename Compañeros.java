import java.util.Scanner;

public class Compañeros {
    public static void main(String[] args) {
        // Crear un arreglo para 10 nombres
        String[] nombres = new String[10];
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese los nombres
        System.out.println("Ingresa 10 nombres:");

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }

        // Imprimir los nombres
        System.out.println("\nNombres ingresados:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println((i + 1) + ". " + nombres[i]);
        }

        // Cerrar el scanner
        scanner.close();
    }
}
