package PRACTICAS1;

public class PlantaExterior extends Planta {
    // Constructor de la clase PlantaExterior
    public PlantaExterior(String nombre, int altura) {
        super(nombre, altura);
    }

    @Override
    public String sistemaRiego(String tipoPlanta) {
        if (tipoPlanta.equalsIgnoreCase("exterior")) {
            return "sistema de riego por goteo";
        } else {
            return "No aplica sistema de riego";
        }
    }
}
