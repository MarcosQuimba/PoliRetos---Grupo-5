
package graficos_Ronald;
import java.util.Scanner;
public class controlador_grafico {
    public void ejecutar() {
        Scanner jt = new Scanner(System.in);

    // Ejercicio 1
        
        System.out.println("Ingrese el numero de filas de su arbol (1....): ");
     int fila = jt.nextInt();
     while (fila<=0){
        System.out.println("El numero de filas debe ser de un en adelante: ");
        fila = jt.nextInt();
     }
     g5_crearArboll tree = new g5_crearArboll();
     tree.crearArbol(fila);

     // Ejercicio 2

      System.out.println("Ingrese la magnitud del cuadrado (3 en adelante): ");
      int magnitud = jt.nextInt();
      while(magnitud<3){
        System.out.println("La magnitud debe ser de tres en adelante: ");
        magnitud = jt.nextInt();

      }
      g5_crearCuadrado cuadro = new g5_crearCuadrado();
      cuadro.crearCuadradoo(magnitud);

      // Ejercicio 3

      g5_crearDiagonal dg = new g5_crearDiagonal();
        System.out.println("Ingrese un numero entero impar: ");
        int mag = jt.nextInt();
        while (mag %2 == 0 || mag <0){
            System.out.println("Numero invalido, ingrese nuevamente: ");
            mag = jt.nextInt();
        }
        dg.crearMatriz(mag);

        // Ejercicio 4

        System.out.println("Ingrese la altura de la escalera: ");
        int altura = jt.nextInt();
        g5_crearEscalera gd = new g5_crearEscalera();
        gd.crearEscalera(altura);

        // Ejercicio 5

         g5_crearDiagonal2 hd = new g5_crearDiagonal2();
        System.out.println("Ingrese un numero entero impar: ");
        int magn = jt.nextInt();
        while (magn %2 == 0 || magn <0){
            System.out.println("Numero invalido, ingrese nuevamente: ");
            magn = jt.nextInt();
        }
        hd.sumarSignos(magn);
        
    }

}

