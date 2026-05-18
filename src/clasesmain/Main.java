package clasesmain;


import graficos.Arboll;
import graficos.Cuadradoo;
import graficos.Diagonall;
import graficos.Gradaa;
import graficos.Plusminus;
import java.util.Scanner;

import serieschar.Lineaa;
import serieschar.Masmenoss;
import seriesnum.Numeroo;
import seriesnum.Potenciaa;
import seriesnum.Seriee;

//Clase main
public class Main {
    public static void main (String [] args){
        Scanner cr = new Scanner(System.in);
        

        // Ejercicio 1
       
        System.out.println("-- Serie de numeros naturales de tres en tres (1 4 7 ....)");
        System.out.println("Ingrese el numero hasta el cual quiere ver la serie: ");
        int num = cr.nextInt();
        while (num < 1){
            System.out.println("Ingrese un numero natural: ");
            num = cr.nextInt();
        }
        Seriee fg = new Seriee();
        fg.mostrarSerie(num);
        
         
        // Ejercicio 2

        System.out.println("Ingrese un numero par: ");
        
        int numero = cr.nextInt();
        while(numero % 2 != 0 || numero < 0){
            System.out.println("El numero debe ser par y positivo: ");
            numero = cr.nextInt();
        }
        

 
        // Ejercicio 3

        System.out.println("Ingrese la altura de la escalera: ");
        int altura = cr.nextInt();
        Gradaa gd = new Gradaa();
        gd.crearEscalera(altura);
         

        //Ejercicio 4

        Diagonall dg = new Diagonall();
        System.out.println("Ingrese un numero entero impar: ");
        int magnitud = cr.nextInt();
        while (magnitud %2 == 0 || magnitud <0){
            System.out.println("Numero invalido, ingrese nuevamente: ");
            magnitud = cr.nextInt();
        }
        dg.graficarMatriz(magnitud);
        

        //Ejercicio 5

        Masmenoss ms = new Masmenoss();
        System.out.println("Digite un numero entero positivo: ");
        int h = cr.nextInt();
        while (h<=0){
            System.out.println("El numero debe ser mayor que cero: ");
            h = cr.nextInt();
        }
        ms.escribirMas(h);
        
       //Ejercicio 6

       int x = 0;
       int w = 1;
       int z = 1;
       System.out.println("Digite el numero de elementos de la serie: ");
       int y = cr.nextInt();
       while (y<=0){
        System.out.println("El numero debe ser mayor que cero: ");
        y = cr.nextInt();
       }
       Numeroo numeroo = new Numeroo();
       numeroo.sumarNumero(y,x,w,z); 
       

       //Ejercicio 7

       double s = 0;
       double base = 2;
       System.out.println("Hasta que numero desea elevarle a numero 2 (0 - 20): ");
       int potencia = cr.nextInt();
       while (potencia <0 || potencia >20){
        System.out.println("La potencia debe ser un numero positivo entre 0 y 20: ");
        potencia = cr.nextInt();
       }
       Potenciaa pt = new Potenciaa();
       pt.sacarPotencia(potencia, s, base);
       
      // Ejercicio 8

      System.out.println("Ingrese cuantos tipos de lineas le gustaria ver en su serie (1...): ");
      int linea = cr.nextInt();
      while(linea<=0){
        System.out.println("El numero debe ser mayor o igual a 1: ");
        linea = cr.nextInt();
      }
      Lineaa rd = new Lineaa();
      rd.crearSerie(linea);
      

      //Ejercicio 9

      System.out.println("Ingrese la magnitud del cuadrado (3 en adelante): ");
      int magnitudd = cr.nextInt();
      while(magnitudd<3){
        System.out.println("La magnitud debe ser de tres en adelante: ");
        magnitudd = cr.nextInt();

      }
      Cuadradoo cj = new Cuadradoo();
      cj.crearCuadrado(magnitudd);
      
     //Ejercicio 10
     
     System.out.println("Ingrese el numero de filas de su arbol (1....): ");
     int fila = cr.nextInt();
     while (fila<=0){
        System.out.println("El numero de filas debe ser de un en adelante: ");
        fila = cr.nextInt();
     }
     Arboll tree = new Arboll();
     tree.crearArbol(fila);
 
     // Ejercicio 11
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
