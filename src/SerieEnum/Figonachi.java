package SerieEnum;

public class Figonachi {
    public static void main(String[] args) {
        int Num = 0;
        int n1 = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println(Num);
            int next = Num + n1;
            Num = n1;
            n1 = next;
        }
    }
}
