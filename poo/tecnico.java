package poo2;

public class tecnico extends operario{

    public tecnico(){}

    public tecnico(String nombre){
        super(nombre);
    }

    public String toString(){
        return "Técnico " + getNombre();
    }
}
