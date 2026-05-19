package SerieEnum_Marcos;

public class g5_Figonachi {
    public void MostrarFigonachi() {
        System.out.println("Serie de Figonachi:");
        int Num = 0;
        int n1 = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print(Num + " ");
            int next = Num + n1;
            Num = n1;
            n1 = next;
        }
        System.out.println();
    }
}
