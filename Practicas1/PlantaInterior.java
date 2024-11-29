package PRACTICAS1;

public class PlantaInterior extends Planta {
    // Constructor de la clase PlantaInterior
    public PlantaInterior(String nombre, int altura) {
        super(nombre, altura);
    }

    @Override
    public String sistemaRiego(String tipoPlanta) {
        if (tipoPlanta.equalsIgnoreCase("interior")) {
            return "sistema de riego permanente";
        } else {
            return "No aplica sistema de riego";
        }
    }
}
