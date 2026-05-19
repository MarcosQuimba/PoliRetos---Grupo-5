package graficos;

public class Gradaa {
    public void crearEscalera(int a){
        for (int i = 1; i<=a; i++){
            for (int j = 1; j <= (i*2)-3; j++){
                System.out.print(" ");

            }
            
            if (i==1){ // I valdra una sola vez uno entonces solo habra un "_"
                System.out.print("_");

            } else {
                System.out.print("|_"); //Lo demas de la escalera es "|_", tomando valores de i ya diferentes de 1
            }
            System.out.println();
        }
    }
    /*
 ___
    |___
        |___
            |___
                |___


     */
    



}
