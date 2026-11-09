import java.util.Scanner;

public class ValidacionContrasena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String CORRECTA = "Java2026";
        String contrasena;

        do {
            System.out.print("Ingrese contraseña: ");
            contrasena = sc.nextLine();

            if (!contrasena.equals(CORRECTA)) {
                System.out.println("Contraseña incorrecta");
                System.out.println();
            }
        } while (!contrasena.equals(CORRECTA));

        System.out.println("Acceso permitido");

        sc.close();
    }
}