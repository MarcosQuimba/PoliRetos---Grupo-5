package clases;

public class Masmenos {
    public void escribirMas (int j){
        for (int i = 0; i<j ;i++){
            if(i%2==0){
                System.out.print("+ ");
            } else {
                System.out.print("- ");
            }

        }
        System.out.println();

    }

}
