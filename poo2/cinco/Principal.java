package cinco;

import java.util.Scanner;

public class Principal {
    private Scanner scanner;
    private ListaDeActores lista;

    public Principal() {
        scanner = new Scanner(System.in);
        lista = new ListaDeActores();
    }

    public void menu() {
        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1) Agregar Nombres");
            System.out.println("2) Modificar Nombres");
            System.out.println("3) Borrar Nombres");
            System.out.println("4) Buscar Nombre y posición");
            System.out.println("5) Visualizar Nombres");
            System.out.println("6) Cantidad de actores");
            System.out.println("7) Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            comenzar(opcion);
        } while (opcion != 7);
    }

    public void comenzar(int opcion) {
        switch (opcion) {
            case 1:
                agregarNombre();
                break;
            case 2:
                modificarNombre();
                break;
            case 3:
                borrarNombre();
                break;
            case 4:
                buscarNombre();
                break;
            case 5:
                visualizarNombres();
                break;
            case 6:
                cantidadDeActores();
                break;
            case 7:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    public void agregarNombre() {
        System.out.print("Ingrese el nombre del actor: ");
        String nombre = scanner.nextLine();
        lista.agregarNombre(nombre);
    }

    public void modificarNombre() {
        System.out.print("Ingrese el nombre del actor a modificar: ");
        String nombreAnterior = scanner.nextLine();
        System.out.print("Ingrese el nuevo nombre del actor: ");
        String nombreNuevo = scanner.nextLine();
        lista.modificarNombre(nombreAnterior, nombreNuevo);
    }

    public void borrarNombre() {
        System.out.print("Ingrese el nombre del actor a borrar: ");
        String nombre = scanner.nextLine();
        lista.borrarNombre(nombre);
    }

    public void buscarNombre() {
        System.out.print("Ingrese el nombre del actor a buscar: ");
        String nombre = scanner.nextLine();
        int posicion = lista.buscarNombre(nombre);
        if (posicion != -1) {
            System.out.println("El actor " + nombre + " se encuentra en la posición " + (posicion + 1));
        } else {
            System.out.println("El actor " + nombre + " no se encuentra en la lista.");
        }
    }

    public void visualizarNombres() {
        System.out.println("Lista de actores:");
        lista.visualizarNombres();
    }

    public void cantidadDeActores() {
        int cantidad = lista.cantidadDeActores();
        System.out.println("Cantidad de actores: " + cantidad);
    }

    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.menu();
    }
}
