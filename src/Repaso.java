import java.util.Scanner;
public class Repaso {
    public static void main (String [] args){
        Scanner md = new Scanner (System.in);
        //Delcaracion de arreglos: int[] edad = new int[4];
        /* 
        int numeros[] = new int[3];
        numeros[0] = 7;
        numeros[1] = 10;
        numeros[2] = 13;

        for (int i = 0; i < 3; i++){
            System.out.print(" "+numeros[i]);
        }
        System.out.println();
        */
       //Pedir datos en el arreglo
       System.out.println("Ingrese el numero de elementos que desee que tenga su arreglo: ");
       int elemento = md.nextInt();

       int matriz[] = new int[elemento];

       for (int i = 0; i < elemento; i++){
        System.out.print(i+1+". Digite los valores del arreglo: ");
        matriz[i] = md.nextInt();
       }    

       System.out.println("Los numeros ingresados fueron: ");
       for (int i = 0; i < elemento; i++){
        System.out.print(" "+matriz[i]);
       }
       System.out.println();

    }


}
