import java.util.Scanner;

public class DatosUsuario {
    private String nombre;
    private int edad;
    private String email;

    public void solicitarDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        nombre = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el búfer después de leer un entero

        System.out.print("Ingrese su correo electrónico: ");
        email = scanner.nextLine();
    }

    public void mostrarDatos() {
        System.out.println("Datos del usuario:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Correo electrónico: " + email);
    }
}

