import java.util.Locale;
import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad = 0;
        int suma = 0;
        String continuar;

        do {
            int nota;

            // Valida que la nota esté entre 0 y 20
            do {
                System.out.print("Nota: ");
                nota = sc.nextInt();

                if (nota < 0 || nota > 20) {
                    System.out.println("Nota inválida. Debe estar entre 0 y 20.");
                }
            } while (nota < 0 || nota > 20);

            suma += nota;
            cantidad++;

            System.out.print("¿Continuar? (S/N): ");
            continuar = sc.next();
            System.out.println();
        } while (continuar.equalsIgnoreCase("S"));

        double promedio = (double) suma / cantidad;

        System.out.println("Cantidad de notas: " + cantidad);
        System.out.println("Suma total: " + suma);
        System.out.println(String.format(Locale.US, "Promedio: %.2f", promedio));

        sc.close();
    }
}