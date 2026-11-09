import java.util.Scanner;

public class SumaPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int suma = 0;

        do {
            System.out.print("Ingrese número: ");
            numero = sc.nextInt();

            // Solo se suman los números positivos (el negativo termina el ciclo)
            if (numero >= 0) {
                suma += numero;
            }
        } while (numero >= 0);

        System.out.println();
        System.out.println("Suma total: " + suma);

        sc.close();
    }
}