package SerieEnum_Marcos;

public class g5_MasTres {

// con el for
    public void MostrarMasTres() {
        System.out.println("Serie de Mas Tres:");
        int num = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print(num + " ");
            num += 3;
        }
        System.out.println();
    }
}

// con el while
/*
public class g5_MasTres {
    public void MostrarMasTres() {
        System.out.println("Serie de Mas Tres:");
        int num = 1;
        int count = 0;
        while (count < 10) {
            System.out.print(num + " ");
            num += 3;
            count++;
        }
        System.out.println();
    }
}
*/

// con el do while
/*
public class g5_MasTres {
    public void MostrarMasTres() {
        System.out.println("Serie de Mas Tres:");
        int num = 1;
        int count = 0;
        do {
            System.out.print(num + " ");
            num += 3;
            count++;
        } while (count < 10);
        System.out.println();
    }
}
*/