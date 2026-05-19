package EjerciciosRecursion_Christian;

public class Recursion1 { 

    public int g5_r01(int n) {
        if (n <= 1) return 1;
        return n * g5_r01(n - 1);
    }

    public void g5_r05(int n) {
        if (n > 0) g5_r05(n - 1);
        System.out.print(n + " ");
    }
}