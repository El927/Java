package PRACTICAS1;

public abstract class Planta {
    protected String nombre;
    protected int altura;

    public abstract String sistemaRiego(String tipoPlanta);

    public Planta(String nombre, int altura) {
        this.nombre = nombre;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAltura() {
        return altura;
    }
}