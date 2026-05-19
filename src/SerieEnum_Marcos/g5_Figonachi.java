package SerieEnum_Marcos;

public class g5_Figonachi {
<<<<<<< HEAD

// con el for
=======
>>>>>>> 598b951e6eb7f62f0a922b25650cd6d66fa4269d
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

// con el while
/*
public class g5_Figonachi {
    public void MostrarFigonachi() {
        System.out.println("Serie de Figonachi:");
        int Num = 0;
        int n1 = 1;
        int count = 0;
        while (count < 10) {
            System.out.print(Num + " ");
            int next = Num + n1;
            Num = n1;
            n1 = next;
            count++;
        }
        System.out.println();
    }
}
*/

// con el do while
/*
public class g5_Figonachi {
    public void MostrarFigonachi() {
        System.out.println("Serie de Figonachi:");
        int Num = 0;
        int n1 = 1;
        int count = 0;
        do {
            System.out.print(Num + " ");
            int next = Num + n1;
            Num = n1;
            n1 = next;
            count++;
        } while (count < 10);
        System.out.println();
    }
}
*/