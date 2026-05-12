package clases;

public class Numero {
    public void sumarNumero(int f, int x, int y, int z){
       
        for (int i = 0; i<=f; i++){
            z = x + y;
            System.out.print(" "+z); //Imprime 1
            x = y;//1
            y = z;//1

        }
        System.out.println();
    }

} 
