import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Base: ");
        int base = sc.nextInt();

        System.out.print("Exponente: ");
        int exponente = sc.nextInt();
        System.out.println();

        if (exponente <= 0) {
            System.out.println("El exponente debe ser un número positivo.");
        } else {
            long resultado = 1;
            int contador = 1;

            // Único ciclo: multiplica la base por sí misma 'exponente' veces
            do {
                resultado *= base;
                contador++;
            } while (contador <= exponente);

            System.out.println("Resultado: " + resultado);
        }

        sc.close();
    }
}