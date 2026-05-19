package graficos_Ronald;

public class g5_crearDiagonal2 {
    public void sumarSignos(int y){
        for (int i = 0; i<y; i++){
            for (int j = 0; j < y; j++){
                if ((j==i) || (j+i == y-1)){
                    if (i%2 == 0){
                        System.out.print("+ ");
                    } else {
                        System.out.print("- ");
                    }

                } else {
                    System.out.print("  ");
                }
                


            }
            System.out.println();
        }
    }


}
