import java.util.Random;

public class NumerosAleatorios {

    public static void main(String[] args) {
        final int CANTIDAD = 500;
        final int MIN = 10;
        final int MAX = 1000;

        Random random = new Random();
        int[] numeros = new int[CANTIDAD];
        long sumaTotal = 0;

        for (int i = 0; i < CANTIDAD; i++) {
            numeros[i] = random.nextInt(MAX - MIN + 1) + MIN;
            sumaTotal += numeros[i];
        }

        double promedio = (double) sumaTotal / CANTIDAD;

        System.out.println("==============================================");
        System.out.println("   SERIE DE 500 NÚMEROS ALEATORIOS (10-1000)  ");
        System.out.println("==============================================");
        System.out.println();
        System.out.println("Primeros 10 números generados:");
        System.out.print("  ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%4d", numeros[i]);
            if (i < 9) System.out.print(", ");
        }
        System.out.println(" ...");
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.printf("  Suma total de los 500 números: %,d%n", sumaTotal);
        System.out.printf("  Promedio de los 500 números:   %.2f%n", promedio);
        System.out.println("----------------------------------------------");
    }
}
