package cine;

@SuppressWarnings("unused")
public class Cine{
    //Atributos
    private Pelicula pelicula;
    private double precio;
    //Constructor
    public Cine(Pelicula pelicula, double precio){
        this.pelicula = pelicula;
        this.precio = precio;
    }
    //Método get precio pelicula
    public double getPrecio(){
        return precio;
    }
}
