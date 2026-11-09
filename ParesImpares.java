import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int pares = 0;
        int impares = 0;

        do {
            System.out.print("Ingrese número (0 para terminar): ");
            numero = sc.nextInt();

            // El cero termina el ciclo y no se cuenta
            if (numero != 0) {
                if (numero % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        } while (numero != 0);

        System.out.println();
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);

        sc.close();
    }
}