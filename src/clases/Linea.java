package clases;

public class Linea {
    public void crearSerie(int linea){
    for (int i = 0; i < linea; i++){
        switch(i%5){
            //     \ | / - | \ | / - | \ | / - |....
            case 0: 
            System.out.print("\\ ");
            break;
            case 1:
                System.out.print(" |");
                break;
            case 2:
                System.out.print(" /");
                break;
            case 3: 
            System.out.print(" -");
            break;
            case 4:
            System.out.print(" | ");
             break;
                default: System.out.print("");break;

        }

    }
    System.out.println();

    }

}
