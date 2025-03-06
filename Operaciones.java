import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario los dos números
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        // Realizar las operaciones aritméticas
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = 0;
        int modulo = 0;

        // Realizar la división y el módulo solo si el segundo número no es cero
        if (num2 != 0) {
            division = num1 / num2;
            modulo = num1 % num2;
        } else {
            System.out.println("No se puede dividir por cero.");
        }

        // Imprimir los resultados
        System.out.println("Resultados:");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);

        // Mostrar resultados de división y módulo solo si la división no es por cero
        if (num2 != 0) {
            System.out.println("División: " + division);
            System.out.println("Módulo: " + modulo);
        }

        // Cerrar el scanner
        scanner.close();
    
    }
}
