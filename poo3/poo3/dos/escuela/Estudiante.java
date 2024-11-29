package escuela;

import java.util.Random;

public class Estudiante extends Persona{
    //Atributos y herecia
    protected int calificacion;
    //Constructor
    public Estudiante(String nombre, int edad, String sexo, int calificacion){
        super(nombre, edad, sexo);
        this.calificacion = calificacion;
    }
    //Método get sexo estudiante
    public String getSexo(){
        return sexo;
    }
    //Método para mostrar que el objeto no está presente, 50%(1/2) probabilidad.
    @Override
    public boolean asistir() {
        Random probabilidad = new Random();
        return probabilidad.nextDouble() < 0.5;
    }
    // Método para verificar si el estudiante está aprobado
    public boolean aprobar() {
        return calificacion >= 5;
    }
}