
import java.util.Scanner;

public class Ejemplo {
    public static void main (String[] args){
        Scanner lm = new Scanner(System.in); 
        int magnitudd;
        System.out.println("Ingrese la magnitud de la letra: ");
        magnitudd = lm.nextInt();
        int magnitud = magnitudd * 2 ;
        for (int i = 0 ; i < magnitud ; i++){
            for (int j = 0 ; j < magnitud ; j++){
                if ((j == 0 && i > 0)||(j > 0 && i == 0)|| (j < magnitud - 1 && i == magnitud/2)||(j == magnitud-1  && i < magnitud/2)||(i > magnitud/2 && j == i - magnitud/2+5)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
    }
}