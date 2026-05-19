package graficos_Ronald;

public class g5_crearArboll {
    public void crearArbol(int n){
        for (int i = n; i >= 1; i--){
            for (int j = 0; j < n -i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k< 2*i-1; k++){
                System.out.print("*");
            }
            System.out.println("");
        

        
        
    }

}

}



