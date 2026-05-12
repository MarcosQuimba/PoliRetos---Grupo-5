package clases;
import java.util.Scanner;
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
         
        // Ejercicio 2
        System.out.println("Ingrese un numero par: ");
        Letra lt = new Letra();
        int numero = cr.nextInt();
        while(numero % 2 != 0 || numero < 0){
            System.out.println("El numero debe ser par y positivo: ");
            numero = cr.nextInt();
        }
        lt.mostrarLetras(numero);


        // Ejercicio 3
        System.out.println("Ingrese la altura de la escalera: ");
        int altura = cr.nextInt();
        Grada gd = new Grada();
        gd.crearEscalera(altura);
         

        //Ejercicio 4
        Diagonal dg = new Diagonal();
        System.out.println("Ingrese un numero entero impar: ");
        int magnitud = cr.nextInt();
        while (magnitud %2 == 0 || magnitud <0){
            System.out.println("Numero invalido, ingrese nuevamente: ");
            magnitud = cr.nextInt();
        }
        dg.graficarMatriz(magnitud);
        

        //Ejercicio 5
        Masmenos ms = new Masmenos();
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
       Numero numeroo = new Numero();
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
       Potencia pt = new Potencia();
       pt.sacarPotencia(potencia, s, base);
       
      // Ejercicio 8
      System.out.println("Ingrese cuantos tipos de lineas le gustaria ver en su serie (1...): ");
      int linea = cr.nextInt();
      while(linea<=0){
        System.out.println("El numero debe ser mayor o igual a 1: ");
        linea = cr.nextInt();
      }
      Linea rd = new Linea();
      rd.crearSerie(linea);
      

      //Ejercicio 9
      System.out.println("Ingrese la magnitud del cuadrado (3 en adelante): ");
      int magnitudd = cr.nextInt();
      while(magnitudd<3){
        System.out.println("La magnitud debe ser de tres en adelante: ");
        magnitudd = cr.nextInt();

      }
      Cuadrado cj = new Cuadrado();
      cj.crearCuadrado(magnitudd);
      
     //Ejercicio 10
     System.out.println("Ingrese el numero de filas de su arbol (1....): ");
     int fila = cr.nextInt();
     while (fila<=0){
        System.out.println("El numero de filas debe ser de un en adelante: ");
        fila = cr.nextInt();
     }
     Arbol tree = new Arbol();
     tree.crearArbol(fila);
     


cr.close();
    }

}
