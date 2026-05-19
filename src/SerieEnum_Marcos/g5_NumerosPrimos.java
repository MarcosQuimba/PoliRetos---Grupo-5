package SerieEnum_Marcos;

public class g5_NumerosPrimos {
<<<<<<< HEAD

    public void MostrarPrimos(int cantidad) {
=======
    public void MostrarPrimos() {
>>>>>>> 598b951e6eb7f62f0a922b25650cd6d66fa4269d
        System.out.println("Serie de Números Primos:");
        int count = 0;
        int num = 2;
        while (count < cantidad) {
            if (esPrimo(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }

    private boolean esPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
