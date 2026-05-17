package clases;

public class Letraa {
    public void mostrarLetras(int n){
        char letra = 'a';
        
     for(int i = 2; i<=n; i+=2){ // i+=2 incrementa el numero de caracteres
        for (int j = 0; j<i; j++){
            System.out.print(letra);
        }
        letra++;
        System.out.print(" ");
     }
     System.out.println();
    }
}
