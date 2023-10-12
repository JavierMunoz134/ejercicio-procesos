public class Main {
    public static void main(String[] args) {
        int[] arrayNumeros = new int[10];
        Utilidades.rellenarArrayAleatorio(arrayNumeros);

        long startTime = System.nanoTime();
        for (int numero : arrayNumeros) {
            boolean esPrimo = Utilidades.esPrimo(numero);
            System.out.println(numero + " es primo: " + esPrimo);
        }
        long endTime = System.nanoTime();

        long elapsedTime = endTime - startTime;
        System.out.println("\nTiempo de ejecución: ");
        System.out.println("Segundos: " + elapsedTime / 1e9);
        System.out.println("Milisegundos: " + elapsedTime / 1e6);
        System.out.println("Nanosegundos: " + elapsedTime);

        if (elapsedTime < 1e9) {
            System.out.println("\nHaciendo el cálculo para 100 elementos:");

            int[] arrayNumeros100 = new int[100];
            Utilidades.rellenarArrayAleatorio(arrayNumeros100);

            startTime = System.nanoTime();
            for (int numero : arrayNumeros100) {
                boolean esPrimo = Utilidades.esPrimo(numero);
                System.out.println(numero + " es primo: " + esPrimo);
            }
            endTime = System.nanoTime();

            elapsedTime = endTime - startTime;
            System.out.println("\nTiempo de ejecución para 100 elementos: ");
            System.out.println("Segundos: " + elapsedTime / 1e9);
            System.out.println("Milisegundos: " + elapsedTime / 1e6);
            System.out.println("Nanosegundos: " + elapsedTime);
        }
    }
}
