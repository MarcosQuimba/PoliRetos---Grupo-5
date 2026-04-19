
import java.util.Scanner;

public class Rec{
    public static void main (String [] args){
        Scanner tp = new Scanner (System.in);
        int base;
        int altura;
        int area;
        System.out.println("Ingrese la base del rectangulo: ");
        base = tp.nextInt();
        System.out.println("Ingrese la altura del rectangulo: ");
        altura = tp.nextInt();
        area = base * altura;
        System.out.println("La base del rectangulo es: "+area);

    }
}