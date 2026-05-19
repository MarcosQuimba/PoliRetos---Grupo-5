
import graficos_Ronald.controlador_grafico;
import java.util.Scanner;
import serieschar_Ronald.controlador_seriee;



public class Controlador_Ronald {
    public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);
        int opcion;
        do { 
            System.out.println("--Controlador de retos--");
            System.out.println("1. Ejecutar retos de graficas. ");
            System.out.println("2. Ejecutar retos de caracteres. ");
            System.out.println("3. Salir. ");
            System.out.println("Seleccione una opcion por favor: ");
            opcion = cr.nextInt();

            switch (opcion){
                case 1: System.out.println("--Ejercicios de graficos--");
                controlador_grafico.ejecutar();
                break;
                    case 2: System.out.println("--Ejericicios de series de caracteres--");
                    controlador_seriee.ejecutar();
                    break;
                        case 3:
                            System.out.println("Saliendo");
                default: System.out.println("La opcion es invalida, intenta de nuevo por favor.");
            }
            
        } while (opcion!=3);


        cr.close();
    }
}
