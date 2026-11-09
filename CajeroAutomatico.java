import java.util.Locale;
import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 5000;
        int opcion;

        do {
            System.out.println("===== CAJERO AUTOMÁTICO =====");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(String.format(Locale.US, "Su saldo actual es: S/ %.2f", saldo));
                    break;

                case 2:
                    System.out.print("Ingrese el monto a retirar: S/ ");
                    double retiro = sc.nextDouble();

                    if (retiro <= 0) {
                        System.out.println("Monto inválido.");
                    } else if (retiro > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= retiro;
                        System.out.println(String.format(Locale.US, "Retiro exitoso. Nuevo saldo: S/ %.2f", saldo));
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el monto a depositar: S/ ");
                    double deposito = sc.nextDouble();

                    if (deposito <= 0) {
                        System.out.println("Monto inválido.");
                    } else {
                        saldo += deposito;
                        System.out.println(String.format(Locale.US, "Depósito exitoso. Nuevo saldo: S/ %.2f", saldo));
                    }
                    break;

                case 4:
                    System.out.println("Gracias por usar el cajero. ¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }

            System.out.println();
        } while (opcion != 4);

        sc.close();
    }
}