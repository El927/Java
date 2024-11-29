package poo2;

public class directivo extends empleado{

    public directivo(){}

    public directivo(String nombre){
        super(nombre);
    }

    public String toString(){
        return "Directivo " + getNombre();
    }
}
