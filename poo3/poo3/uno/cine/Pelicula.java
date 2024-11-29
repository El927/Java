package cine;

@SuppressWarnings("unused")
public class Pelicula{
    //Atributos
    private String titulo;
    private int edadMin;
    private String director;
    private int duracion;
    //Constructor
    public Pelicula(String titulo, int edadMin, String director, int duracion){
        this.titulo = titulo;
        this.edadMin = edadMin;
        this.director = director;
        this.duracion = duracion;
    }
    //Método get para edad mínima
    public int getEdadMin(){
        return edadMin;
    }
}
