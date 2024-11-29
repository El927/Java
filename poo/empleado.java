package poo2;

public class empleado {

    private String nombre;

    public empleado(){
    }

    public empleado(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public String toString(){
        return "Empleado " + nombre;
    }
}