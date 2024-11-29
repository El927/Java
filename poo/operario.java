package poo2;

public class operario extends empleado{

    public operario(){}

    public operario(String nombre){
        super(nombre);
    }

    public String toString(){
        return "Operario " + getNombre();
    }
}
