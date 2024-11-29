package cine;

public class Espectador {
    //Atributos
    @SuppressWarnings("unused")
    private String nombre;
    private int edad;
    private double dinero;
    //Constructor
    public Espectador(String nombre, int edad, double dinero){
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }
    //Método para ver si tiene suficiente dinero
    public boolean suficienteDinero(Cine cine){
        return dinero >= cine.getPrecio();
    }
    //Método para ver si tiene la edad suficiente
    public boolean suficienteEdad(Pelicula pelicula){
        return edad >= pelicula.getEdadMin();
    }
    //Método para ver si puede ver la película dinero & edad
    public boolean puedeComprar(Cine cine, Pelicula pelicula){
        return suficienteDinero(cine) && suficienteEdad(pelicula);
    }
}
