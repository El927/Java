package PRACTICAS1;

public class Main {
    public static void main(String[] args) {
        Planta plantaExterior = new PlantaExterior("Rosales", 50);

        System.out.println("Nombre de la planta: " + plantaExterior.getNombre());
        System.out.println("Altura de la planta: " + plantaExterior.getAltura());

        String sistemaRiegoExterior = plantaExterior.sistemaRiego("exterior");
        System.out.println("SRP de exterior: " + sistemaRiegoExterior);

        Planta plantaInterior = new PlantaInterior("Orquídea", 30);

        System.out.println("\nNombre de la planta: " + plantaInterior.getNombre());
        System.out.println("Altura de la planta: " + plantaInterior.getAltura());


        String sistemaRiegoInterior = plantaInterior.sistemaRiego("interior");
        System.out.println("SRP de interior: " + sistemaRiegoInterior);

        Planta plantaFrutal = new PlantaFrutal("Manzano", 100);

        System.out.println("\nNombre de la planta: " + plantaFrutal.getNombre());
        System.out.println("Altura de la planta: " + plantaFrutal.getAltura());

        String sistemaRiegoFrutal = plantaFrutal.sistemaRiego("frutal");
        System.out.println("SRP de frutal: " + sistemaRiegoFrutal);
    }
}