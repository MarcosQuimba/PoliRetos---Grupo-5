

import java.util.Scanner;

public class Ejem{
    public static void main (String[] args){
        Scanner tilin = new Scanner(System.in);
        System.out.println("---Conversor de unidades---");
        System.out.println("1. De dolares a euros");
        System.out.println("2. De metros a kilometos");
        System.out.println("Ingrese la opcion que desee realizar: ");
        int opcion = tilin.nextInt();
        switch (opcion){
            case 1:
                System.out.println("El valor en euros es: "+convertirDolares(tilin));
                break;
            case 2: 
            System.out.println("El valor en kilometros es: "+convertirMetros(tilin));
            break;
            default:System.out.println("Numero fuera del rango");break;    
        }


    }
    public static double convertirDolares(Scanner juan){
        System.out.println("Ingrese el valor del dinero en dolares: ");
        double dolar = juan.nextDouble();
        return dolar * 0.92;

    }

    public static double convertirMetros(Scanner vs ){
        System.out.println("Ingrese el valor en metros: ");
        double metro = vs.nextDouble();
        return metro/1000;

    }
}