import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la nota del estudiante: ");
        double nota = scanner.nextDouble();

        if (nota >= 70) {
            System.out.println(nombre + " está APROBADO.");
        } else {
            System.out.println(nombre + " está REPROBADO.");
        }

        scanner.close();
    }
}
