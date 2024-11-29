import java.util.Random;

public class tres {

    public static void main(String[] args) {
        int[] A = generarVector();
        int[] B = generarVector();
        int[] C = sumarVectores(A, B);

        System.out.println("Vector A:");
        mostrarVector(A);
        System.out.println("Vector B:");
        mostrarVector(B);
        System.out.println("Vector C (A + B):");
        mostrarVector(C);
    }

    public static int[] generarVector() {
        int[] vector = new int[20];
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            vector[i] = random.nextInt(20) + 1;
        }
        return vector;
    }

    public static int[] sumarVectores(int[] A, int[] B) {
        int[] resultado = new int[20];
        for (int i = 0; i < 20; i++) {
            resultado[i] = A[i] + B[i];
        }
        return resultado;
    }

    public static void mostrarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
    }
}
