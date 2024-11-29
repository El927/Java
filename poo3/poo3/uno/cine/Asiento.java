package cine;

@SuppressWarnings("unused")
public class Asiento {
    //Atributos
    private char columna;
    private int fila;
    private boolean ocupado;
    //Constructor
    public Asiento(char columna, int fila){
        this.columna = columna;
        this.fila = fila;
        this.ocupado = false;
    }
    //Método para reservar asiento
    public void reservar(){
        ocupado = true;
    }
    //Método para liberar asiento
    public void liberar(){
        ocupado = false;
    }
    //Método get para ver si el asiento está ocupado
    public boolean siOcupado(){
        return ocupado;
    }
}
