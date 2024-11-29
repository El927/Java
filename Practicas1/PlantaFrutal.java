package PRACTICAS1;

public class PlantaFrutal extends Planta {
    // Constructor de la clase PlantaFrutal
    public PlantaFrutal(String nombre, int altura) {
        super(nombre, altura);
    }

    @Override
    public String sistemaRiego(String tipoPlanta) {
        if (tipoPlanta.equalsIgnoreCase("frutal")) {
            return "sistema de riego por goteo";
        } else {
            return "No aplica sistema de riego";
        }
    }
}
