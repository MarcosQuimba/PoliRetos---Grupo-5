package SerieEnum_Marcos;

public class g5_MasTres {

// con el for
    public void MostrarMasTres(int count) {
        System.out.println("Serie de Mas Tres:");
        int num = 1;
        for (int i = 0; i < count; i++) {
            System.out.print(num + " ");
            num += 3;
        }
        System.out.println();
    }
}

// con el while
/*
public class g5_MasTres {
    public void MostrarMasTres(int count) {
        System.out.println("Serie de Mas Tres:");
        int num = 1;
        int i = 0;
        while (i < count) {
            System.out.print(num + " ");
            num += 3;
            i++;
        }
        System.out.println();
    }
}
*/

// con el do while
/*
public class g5_MasTres {
    public void MostrarMasTres(int count) {
        System.out.println("Serie de Mas Tres:");
        int num = 1;
        int i = 0;
        do {
            System.out.print(num + " ");
            num += 3;
            i++;
        } while (i < count);
        System.out.println();
    }
}
*/