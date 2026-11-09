import java.util.Locale;
import java.util.Scanner;

public class ConversionTemperaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("===== CONVERSIÓN DE TEMPERATURAS =====");
            System.out.println("1. Celsius a Fahrenheit");
            System.out.println("2. Fahrenheit a Celsius");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese grados Celsius: ");
                    double c = sc.nextDouble();
                    // Se usa 9.0/5.0 para evitar la división entera (9/5 daría 1)
                    double f = (c * 9.0 / 5.0) + 32;
                    System.out.println(String.format(Locale.US, "%.2f °C = %.2f °F", c, f));
                    break;

                case 2:
                    System.out.print("Ingrese grados Fahrenheit: ");
                    double fa = sc.nextDouble();
                    double ce = (fa - 32) * 5.0 / 9.0;
                    System.out.println(String.format(Locale.US, "%.2f °F = %.2f °C", fa, ce));
                    break;

                case 3:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }

            System.out.println();
        } while (opcion != 3);

        sc.close();
    }
}