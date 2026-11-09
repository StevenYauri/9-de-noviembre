import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Número secreto aleatorio entre 1 y 100
        // (para usar uno fijo, cambia por: int secreto = 25;)
        int secreto = random.nextInt(100) + 1;
        int intentos = 0;
        int numero;

        System.out.println("Adivina el número secreto (entre 1 y 100)");

        do {
            System.out.print("Ingrese un número: ");
            numero = sc.nextInt();
            intentos++;

            if (numero > secreto) {
                System.out.println("Muy alto");
            } else if (numero < secreto) {
                System.out.println("Muy bajo");
            }
        } while (numero != secreto);

        System.out.println("¡Correcto!");
        System.out.println("Intentos realizados: " + intentos);

        sc.close();
    }
}