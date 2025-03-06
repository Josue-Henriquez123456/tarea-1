import java.util.Scanner;

public class Datos_personales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear arreglo multidimensional para 3 empleados
        String[][] empleados = new String[3][4];

        // Ingresar datos de empleados
        for (int i = 0; i < empleados.length; i++) {
            System.out.println("Información para el empleado " + (i + 1) + ":");

            System.out.print("Nombre: ");
            empleados[i][0] = scanner.nextLine();

            System.out.print("Apellido: ");
            empleados[i][1] = scanner.nextLine();

            System.out.print("Carrera: ");
            empleados[i][2] = scanner.nextLine();

            System.out.print("Lugar de trabajo: ");
            empleados[i][3] = scanner.nextLine();

            System.out.println();
        }

        // Imprimir información de empleados
        System.out.println("Información de empleados:");
        for (int i = 0; i < empleados.length; i++) {
            System.out.println("Empleado " + (i + 1) + ":");
            System.out.println("Nombre: " + empleados[i][0]);
            System.out.println("Apellido: " + empleados[i][1]);
            System.out.println("Carrera: " + empleados[i][2]);
            System.out.println("Lugar de trabajo: " + empleados[i][3]);
            System.out.println();
        }

        scanner.close();
    }
}
