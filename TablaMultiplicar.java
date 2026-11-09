import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número: ");
        int numero = sc.nextInt();
        System.out.println();

        int i = 1;
        do {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        } while (i <= 12);

        sc.close();
    }
}