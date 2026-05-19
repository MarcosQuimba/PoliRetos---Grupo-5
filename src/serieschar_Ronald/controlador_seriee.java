package serieschar_Ronald;
import java.util.Scanner;

public class controlador_seriee {
    public static void ejecutar (){

        Scanner lm = new Scanner(System.in);

        // Ejercicio 1

        g5_crearSerieletras rt = new g5_crearSerieletras();

        System.out.println("Ingrese un numero par: ");
      
        int numero = lm.nextInt();
        while(numero % 2 != 0 || numero < 0){
            System.out.println("El numero debe ser par y positivo: ");
            numero = lm.nextInt();
        }
        rt.mostrarLetras(numero);



        // Ejercicio 2
        g5_crearSerielineas fs = new g5_crearSerielineas();

        System.out.println("Ingrese cuantos tipos de lineas le gustaria ver en su serie (1...): ");
      int linea = lm.nextInt();
      while(linea<=0){
        System.out.println("El numero debe ser mayor o igual a 1: ");
        linea = lm.nextInt();
      }
      fs.crearSerie(linea);
     

        // Ejercicio 3
        g5_crearSeriemasmenos ef = new g5_crearSeriemasmenos();

      
        System.out.println("Digite un numero entero positivo: ");
        int h = lm.nextInt();
        while (h<=0){
            System.out.println("El numero debe ser mayor que cero: ");
            h = lm.nextInt();
        }
            ef.escribirMas(h);

    }
}
