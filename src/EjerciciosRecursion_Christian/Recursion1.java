import java.util.Scanner;

class RetosRecursion { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RetosRecursion poli = new RetosRecursion();

        System.out.print("Pon un numero para los retos de recursion: ");
        int n = sc.nextInt();

        System.out.println("[R01] El factorial de " + n + " es: " + poli.g5_r01(n));
        
        System.out.print("[R05] Conteo hasta " + n + ": ");
        poli.g5_r05(n);
        System.out.println();
    }

    
    public int g5_r01(int n) {
        if (n <= 1) return 1;
        return n * g5_r01(n - 1);
    }

    public void g5_r05(int n) {
        if (n > 0) g5_r05(n - 1);
        System.out.print(n + " ");
    }
}