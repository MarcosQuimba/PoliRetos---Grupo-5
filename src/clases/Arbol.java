package clases;

public class Arbol {
    public void crearArbol(int fila){
        for (int i = fila; i >= 1; i--){
            for (int j = 0; j < fila -i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k< 2*i-1; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
