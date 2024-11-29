package cinco;

import java.util.ArrayList;

public class ListaDeActores {
    private ArrayList<String> actores;

    public ListaDeActores() {
        actores = new ArrayList<>();
    }

    public void agregarNombre(String nombre) {
        if (!actores.contains(nombre)) {
            actores.add(nombre);
            System.out.println("Nombre agregado correctamente.");
        } else {
            System.out.println("No se puede insertar porque el nombre de actor ya existe.");
        }
    }

    public void modificarNombre(String nombreAnterior, String nombreNuevo) {
        int indice = actores.indexOf(nombreAnterior);
        if (indice != -1) {
            actores.set(indice, nombreNuevo);
            System.out.println("Nombre modificado correctamente.");
        } else {
            System.out.println("El nombre de actor a modificar no existe en la lista.");
        }
    }

    public void borrarNombre(String nombre) {
        if (actores.remove(nombre)) {
            System.out.println("Nombre borrado correctamente.");
        } else {
            System.out.println("El nombre de actor a borrar no existe en la lista.");
        }
    }

    public int buscarNombre(String nombre) {
        return actores.indexOf(nombre);
    }

    public void visualizarNombres() {
        for (String actor : actores) {
            System.out.println(actor);
        }
    }

    public int cantidadDeActores() {
        return actores.size();
    }
}

