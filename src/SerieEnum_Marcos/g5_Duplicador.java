package SerieEnum_Marcos;

// con el for
public class g5_Duplicador {
    public void MostrarDup(int count) {
        int num = 1;
        System.out.println("Serie del Duplicador:");
        for (int i = 0; i < count; i++) {
            System.out.print(num + " ");
            num *= 2;
        }
        System.out.println();
    }
}

// con el while
/*
public class g5_Duplicador {
    public void MostrarDup(int count) {
        int num = 1;
        int i = 0;
        System.out.println("Serie del Duplicador:");
        while (i < count) {
            System.out.print(num + " ");
            num *= 2;
            i++;
        }
        System.out.println();
    }
}
*/

// con el do while
/*
public class g5_Duplicador {
    public void MostrarDup(int count) {
        int num = 1;
        int i = 0;
        System.out.println("Serie del Duplicador:");
        do {
            System.out.print(num + " ");
            num *= 2;
            i++;
        } while (i < count);
        System.out.println();
    }
}
*/
