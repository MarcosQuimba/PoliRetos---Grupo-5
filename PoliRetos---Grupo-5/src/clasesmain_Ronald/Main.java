package clasesmain_Ronald;


import graficos_Ronald.G5_Arboll;
import graficos_Ronald.G5_Cuadradoo;
import graficos_Ronald.G5_Diagonall;
import graficos_Ronald.G5_Gradaa;
import graficos_Ronald.G5_Plusminus;
import java.util.Scanner;

//Clase main
public class Main {
    public static void main (String [] args){
        Scanner cr = new Scanner(System.in);
        
         
        // Ejercicio 1

        System.out.println("Ingrese un numero par: ");
        G5_Letraa lt = new G5_Letraa();
        int numero = cr.nextInt();
        while(numero % 2 != 0 || numero < 0){
            System.out.println("El numero debe ser par y positivo: ");
            numero = cr.nextInt();
        }
        lt.mostrarLetras(numero);

 
        // Ejercicio 2

        System.out.println("Ingrese la altura de la escalera: ");
        int altura = cr.nextInt();
        Gradaa gd = new Gradaa();
        gd.crearEscalera(altura);
         

        //Ejercicio 3

        Diagonall dg = new Diagonall();
        System.out.println("Ingrese un numero entero impar: ");
        int magnitud = cr.nextInt();
        while (magnitud %2 == 0 || magnitud <0){
            System.out.println("Numero invalido, ingrese nuevamente: ");
            magnitud = cr.nextInt();
        }
        dg.graficarMatriz(magnitud);
        

        //Ejercicio 4

        Masmenoss ms = new Masmenoss();
        System.out.println("Digite un numero entero positivo: ");
        int h = cr.nextInt();
        while (h<=0){
            System.out.println("El numero debe ser mayor que cero: ");
            h = cr.nextInt();
        }
        ms.escribirMas(h);
        

       


       
      // Ejercicio 5

      System.out.println("Ingrese cuantos tipos de lineas le gustaria ver en su serie (1...): ");
      int linea = cr.nextInt();
      while(linea<=0){
        System.out.println("El numero debe ser mayor o igual a 1: ");
        linea = cr.nextInt();
      }
      Lineaa rd = new Lineaa();
      rd.crearSerie(linea);
      

      //Ejercicio 6

      System.out.println("Ingrese la magnitud del cuadrado (3 en adelante): ");
      int magnitudd = cr.nextInt();
      while(magnitudd<3){
        System.out.println("La magnitud debe ser de tres en adelante: ");
        magnitudd = cr.nextInt();

      }
      Cuadradoo cj = new Cuadradoo();
      cj.crearCuadrado(magnitudd);
      
     //Ejercicio 7
     
     System.out.println("Ingrese el numero de filas de su arbol (1....): ");
     int fila = cr.nextInt();
     while (fila<=0){
        System.out.println("El numero de filas debe ser de un en adelante: ");
        fila = cr.nextInt();
     }
     Arboll tree = new Arboll();
     tree.crearArbol(fila);
 
     // Ejercicio 8
     System.out.println("Digite un numero entero: ");
     int masmenos = cr.nextInt();

     while (masmenos <= 0){
        System.out.println("El numero debe ser mayor que cero: ");
        masmenos = cr.nextInt();
     }
     Plusminus sumaresta = new Plusminus();
     sumaresta.sumarSignos(masmenos);
     
     


     


cr.close();
    }

}
