package SerieEnum_Marcos;

public class NumerosPrimos {
    public void MostrarPrimos() {
        System.out.println("Serie de Números Primos:");
        int count = 0;
        int num = 2; // El primer número primo
        while (count < 10) {
            if (esPrimo(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }

    private static boolean esPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
