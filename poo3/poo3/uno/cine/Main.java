package cine;

public class Main {
    public static void main(String[] args){
        // Crear una película
        Pelicula pelicula = new Pelicula("El Señor de los Anillos", 13, "Peter Jackson", 180);

        // Crear un cine con la película y un precio de entrada
        Cine cine = new Cine(pelicula, 10.0);

        // Crear un espectador
        Espectador espectador = new Espectador("Juan", 25, 15.0);

        // Verificar si el espectador puede comprar una entrada
        if (espectador.puedeComprar(cine, pelicula)) {
            System.out.println("El espectador puede comprar una entrada.");
        } else {
            System.out.println("El espectador no puede comprar una entrada.");
        }

        // Crear un asiento
        Asiento asiento = new Asiento('A', 1);

        // Reservar el asiento
        asiento.reservar();
        
        // Verificar si el asiento está ocupado
        if (asiento.siOcupado()) {
            System.out.println("El asiento está ocupado.");
        } else {
            System.out.println("El asiento está libre.");
        }
        // Liberar asiento
        asiento.liberar();
        //Verificar de nuevo
        if (asiento.siOcupado()) {
            System.out.println("El asiento está ocupado.");
        } else {
            System.out.println("El asiento está libre.");
        }
    }
}