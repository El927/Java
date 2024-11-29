package cuatro;

public class Principal {
    public static void main(String[] args) {
        GestorPersona gestorPersona = new GestorPersona();

        Persona persona = gestorPersona.cargarDatos();

        System.out.println("Datos de la persona:");
        gestorPersona.mostrarDatos(persona);

        gestorPersona.cambiarDatos(persona);

        System.out.println("Datos de la persona actualizados:");
        gestorPersona.mostrarDatos(persona);
    }
}
