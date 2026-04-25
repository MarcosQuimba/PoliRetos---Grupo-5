
import java.util.Scanner;

public  class Eje{
    public static void main(String[] Args){
        Scanner nj = new Scanner(System.in);
        int num1;
        int num2;
        int suma = 0;
        System.out.println("Ingrese un numero entero: ");
        num1 = nj.nextInt();
        System.out.println("Ingrese otro numero entero: ");
        num2 = nj.nextInt();
        suma = num1+num2;
        System.out.println("El resultado de la suma es: "+suma); 

    } 
}