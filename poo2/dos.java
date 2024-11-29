import java.util.Random;

public class dos {

    public static void main(String[] args) {
        int[] vector = generarVector(10);
        System.out.println("Vector al derecho:");
        mostrarVectorAlDerecho(vector);
        System.out.println("\nVector al revés:");
        mostrarVectorAlRevés(vector);
    }

    public static int[] generarVector(int n) {
        int[] vector = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            vector[i] = random.nextInt(10) + 1;
        }
        return vector;
    }

    public static void mostrarVectorAlDerecho(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
    }

    public static void mostrarVectorAlRevés(int[] vector) {
        for (int i = vector.length - 1; i >= 0; i--) {
            System.out.print(vector[i] + " ");
        }
    }
}
