package serieschar;

public class Letraa {
<<<<<<< HEAD
    public void mostrarLetras(int n){
        char letra = 'a';
        
=======
    public void mostrarLetras(){
        char letra = 'a';
        int n=10;
>>>>>>> b665431b23876a1c3642b1908d996c1a9e9d8afa
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
