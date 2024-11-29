package escuela;

import java.util.Random;

public class Profesor extends Persona{
    //Atributo y herencia
    protected Materia materia;
    //Constructor
    public Profesor(String nombre, int edad, String sexo, Materia materia){
        super(nombre, edad, sexo);
        this.materia = materia;
    }
    //Método get
    public Materia getMateria(){
        return materia;
    }
    //Método para mostrar que el objeto no está presente, 20%(1/5) probabilidad.
    @Override
    public boolean asistir() {
        Random probabilidad = new Random();
        return probabilidad.nextDouble() >= 0.2;
    }
}
