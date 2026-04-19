
import java.util.Scanner;

public class Serie {
    public static void main (String args[]){
    Scanner td = new Scanner(System.in);
    int num;
    System.out.println("Ingrese el numero: ");
    num = td.nextInt();
    for (int i = 0; i < num ; i++){
        if (i%2 == 0 ){
            System.out.print(" + ");
            
        } else {
            System.out.print(" - ");
        }
     
    }
System.out.println("");
    }
}