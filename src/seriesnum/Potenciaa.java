package seriesnum;

public class Potenciaa {
    public void sacarPotencia(int d, double s, double base){
        for (int i = 0; i<=d; i++){
           double g= Math.pow(base, s);
           int entero =(int)g;
            System.out.print(" "+entero);
            s++;

        }
        System.out.println();

    }

}
