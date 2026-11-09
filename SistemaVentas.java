import java.util.Locale;
import java.util.Scanner;

public class SistemaVentas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // para escribir decimales con punto

        double montoTotal = 0;
        int cantidadTotal = 0;
        int registros = 0;
        String continuar;

        do {
            System.out.print("Nombre del producto: ");
            String nombre = sc.nextLine();

            System.out.print("Precio: S/ ");
            double precio = sc.nextDouble();

            System.out.print("Cantidad: ");
            int cantidad = sc.nextInt();
            sc.nextLine(); // limpia el salto de línea pendiente

            double subtotal = precio * cantidad;
            montoTotal += subtotal;
            cantidadTotal += cantidad;
            registros++;

            System.out.println(String.format(Locale.US, "Venta registrada: %s -> S/ %.2f", nombre, subtotal));

            System.out.print("¿Registrar otra venta? (S/N): ");
            continuar = sc.nextLine();
            System.out.println();
        } while (continuar.equalsIgnoreCase("S"));

        double promedio = montoTotal / registros;

        System.out.println("===== RESUMEN DE VENTAS =====");
        System.out.println(String.format(Locale.US, "Monto total vendido: S/ %.2f", montoTotal));
        System.out.println("Cantidad total de productos vendidos: " + cantidadTotal);
        System.out.println(String.format(Locale.US, "Promedio de venta por producto: S/ %.2f", promedio));

        sc.close();
    }
}