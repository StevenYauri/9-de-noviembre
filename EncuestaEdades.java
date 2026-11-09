import java.util.Locale;
import java.util.Scanner;

public class EncuestaEdades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantidad = 0;
        int suma = 0;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int mayoresDeEdad = 0;
        String continuar;

        do {
            int edad;

            // Valida que la edad sea un valor razonable (0 a 120)
            do {
                System.out.print("Ingrese la edad: ");
                edad = sc.nextInt();

                if (edad < 0 || edad > 120) {
                    System.out.println("Edad inválida. Debe estar entre 0 y 120.");
                }
            } while (edad < 0 || edad > 120);

            cantidad++;
            suma += edad;

            if (edad > mayor) {
                mayor = edad;
            }
            if (edad < menor) {
                menor = edad;
            }
            if (edad >= 18) {
                mayoresDeEdad++;
            }

            System.out.print("¿Registrar otra persona? (S/N): ");
            continuar = sc.next();
            System.out.println();
        } while (continuar.equalsIgnoreCase("S"));

        double promedio = (double) suma / cantidad;

        System.out.println("===== RESULTADOS DE LA ENCUESTA =====");
        System.out.println("Personas encuestadas: " + cantidad);
        System.out.println(String.format(Locale.US, "Promedio de edad: %.2f", promedio));
        System.out.println("Edad mayor: " + mayor);
        System.out.println("Edad menor: " + menor);
        System.out.println("Mayores de edad (18 o más): " + mayoresDeEdad);

        sc.close();
    }
}