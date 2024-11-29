package escuela;

public class Persona {
    //Atributos
    protected String nombre;
    protected int edad;
    protected String sexo;
    //Constructor
    public Persona(String nombre, int edad, String sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    //Método para mostrar que el objeto no está presente, 100% probabilidad.
    public boolean asistir(){
        return true;
    }
}
