package cuatro;

import java.util.Scanner;

public class GestorPersona {
    private Scanner scanner;

    public GestorPersona() {
        scanner = new Scanner(System.in);
    }

    public Persona cargarDatos() {
        System.out.println("Introduce el nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Introduce el apellido:");
        String apellido = scanner.nextLine();
        System.out.println("Introduce la calle:");
        String calle = scanner.nextLine();
        System.out.println("Introduce el teléfono:");
        String telefono = scanner.nextLine();
        String[] aficiones = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Introduce la afición " + (i + 1) + ":");
            aficiones[i] = scanner.nextLine();
        }
        return new Persona(nombre, apellido, calle, telefono, aficiones);
    }

    public void mostrarDatos(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Calle: " + persona.getCalle());
        System.out.println("Teléfono: " + persona.getTelefono());
        System.out.println("Aficiones:");
        for (String aficion : persona.getAficiones()) {
            System.out.println("- " + aficion);
        }
    }

    public void cambiarDatos(Persona persona) {
        System.out.println("¿Deseas cambiar algún dato? (s/n)");
        String respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase("s")) {
            System.out.println("Introduce el nuevo nombre:");
            persona.setNombre(scanner.nextLine());
            System.out.println("Introduce el nuevo apellido:");
            persona.setApellido(scanner.nextLine());
            System.out.println("Introduce la nueva calle:");
            persona.setCalle(scanner.nextLine());
            System.out.println("Introduce el nuevo teléfono:");
            persona.setTelefono(scanner.nextLine());
            String[] aficiones = new String[3];
            for (int i = 0; i < 3; i++) {
                System.out.println("Introduce la nueva afición " + (i + 1) + ":");
                aficiones[i] = scanner.nextLine();
            }
            persona.setAficiones(aficiones);
            System.out.println("Datos cambiados correctamente.");
        } else {
            System.out.println("No se han realizado cambios.");
        }
    }
}
