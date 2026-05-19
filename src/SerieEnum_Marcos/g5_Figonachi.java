package SerieEnum_Marcos;

public class g5_Figonachi {

// con el for
    public void MostrarFigonachi(int count) {
        System.out.println("Serie de Figonachi:");
        int n1 = 0;
        int n2 = 1;
        int next;
        for (int i = 0; i < count; i++) {
            System.out.print(n1 + " ");
            next = n1 + n2;
            n1 = n2;
            n2 = next;
        }
        System.out.println();
    }
}

// con el while
/*
public class g5_Figonachi {
    public void MostrarFigonachi(int count) {
        System.out.println("Serie de Figonachi:");
        int n1 = 0;
        int n2 = 1;
        int count = 0;
        while (count < count) {
            System.out.print(n1 + " ");
            int next = n1 + n2;
            n1 = n2;
            n2 = next;
            count++;
        }
        System.out.println();
    }
}
*/

// con el do while
/*
public class g5_Figonachi {
    public void MostrarFigonachi(int count) {
        System.out.println("Serie de Figonachi:");
        int n1 = 0;
        int n2 = 1;
        int number = 0;
        do {
            System.out.print(n1 + " ");
            int next = n1 + n2;
            n1 = n2;
            n2 = next;
            number++;
        } while (number < count);
        System.out.println();
    }
}
*/