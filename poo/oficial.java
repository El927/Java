package poo2;

public class oficial extends operario{

    public oficial(){}

    public oficial(String nombre){
        super(nombre);
    }

    public String toString(){
        return "Oficial " + getNombre();
    }
}
