package clases;

public class Diagonal {
    public void graficarMatriz(int n){
       for (int i = 0; i < n ;i++){
        for (int j = 0; j < n; j++){
            if((j==i) ||(j+i==n-1)){
                if(i%2 ==0){
                    System.out.print("1 ");
                    
                } else {
                    System.out.print("0 ");
                }
            } else {
                System.out.print("  ");
            }

        }
        System.out.println();
       } 
    }
}


