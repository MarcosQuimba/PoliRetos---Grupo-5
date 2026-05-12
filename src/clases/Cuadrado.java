package clases;

public class Cuadrado {
    public void crearCuadrado(int magnitud){
        for (int i = 0; i<magnitud; i++){
            for (int j = 0; j <magnitud; j++){
                if ((i==0)||(j==0)||(i==magnitud-1)||(j==magnitud-1)){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
               
            }
            System.out.println();
        }
        
        
    }

}
