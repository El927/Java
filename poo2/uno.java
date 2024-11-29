import java.util.*;

public class uno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Calculadora");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    sumar();
                    break;
                case 2:
                    restar();
                    break;
                case 3:
                    multiplicar();
                    break;
                case 4:
                    dividir();
                    break;
                case 5:
                    System.out.println("Cerrando el programa");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
        
        scanner.close();
    }

    public static int pedirNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        scanner.close();
        return numero;
    }

    public static void sumar() {
        int num1 = pedirNumero();
        int num2 = pedirNumero();
        int resultado = num1 + num2;
        System.out.println("La suma es: " + resultado);
    }

    public static void restar() {
        int num1 = pedirNumero();
        int num2 = pedirNumero();
        int resultado = num1 - num2;
        System.out.println("La resta es: " + resultado);
    }

    public static void multiplicar() {
        int num1 = pedirNumero();
        int num2 = pedirNumero();
        int resultado = num1 * num2;
        System.out.println("La multiplicación es: " + resultado);
    }

    public static void dividir() {
        int num1 = pedirNumero();
        int num2;
        do {
            num2 = pedirNumero();
            if (num2 == 0) {
                System.out.println("¡Error! No se puede dividir entre cero. Ingrese un divisor diferente.");
            }
        } while (num2 == 0);
        double resultado = (double) num1 / num2;
        System.out.println("La división es: " + resultado);
    }
}

