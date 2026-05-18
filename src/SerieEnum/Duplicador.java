package SerieEnum;

public class Duplicador {
    public void MostrarDup() {
        int num = 1;
        System.out.println("Serie del Duplicador:");
        for (int i = 0; i < 10; i++) {
            System.out.print(num + " ");
            num *= 2;
        }
        System.out.println();
    }
}
