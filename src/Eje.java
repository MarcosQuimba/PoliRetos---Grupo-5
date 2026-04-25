import java.util.Scanner;

public  class Eje{
    public static void main(String[] args){
        Scanner nj = new Scanner(System.in);
        int num;
        System.out.println("--Resolucion de figuras geometricas--");
        System.out.println("1. Triangulos");
        System.out.println("2. Circulos");
        System.out.println("3. Trapecios");
        System.out.println("Ingrese con que figura quiere trabajar: ");
        num = nj.nextInt();
        nj.nextLine();
        switch (num) {
            case 1:
                System.out.println("Resultado del triangulo: "+resolverTriangulo(nj));  
                
                break;
            case 2:    
            System.out.println("Resultado del circulo: "+resolverCirculo(nj));
            break;
        case 3:
         System.out.println("Resultado del trapecio: "+revolverTrapecio(nj));
            break;
          
            default: System.out.println("El valor debe ser entre 1 y 3");
                break;
        }
        nj.close();
    } 

public static double resolverTriangulo(Scanner messi){
    System.out.println("--Menu de operaciones--");
    System.out.println("1. Area");
    System.out.println("2. Perimetro");
    System.out.println("Ingrese la operacion que desee realizar: ");
    int opcion = messi.nextInt();
    double res = 0;
    switch (opcion){
        case 1: System.out.println("Ingrese la altura: ");
        double altura= messi.nextDouble();
        System.out.println("Ingrese la base: ");
        double base= messi.nextDouble();
        res = (base*altura)/2;
        break;
        case 2: 
        System.out.println("Ingrese el lado 1: ");
        double lado1 = messi.nextDouble();
        System.out.println("Ingrese el lado 2: ");
        double lado2 = messi.nextDouble();
        System.out.println("Ingrese el lado 3: ");
        double lado3 = messi.nextDouble();
        res = lado1+lado2+lado3;
            break;
            default: System.out.println("Opcion no valida");
    }

return res;
}

public static double resolverCirculo(Scanner bicho){
    System.out.println("--Menu de operaciones--");
    System.out.println("1. Area");
    System.out.println("2. Perimetro");
    System.out.println("Ingrese la operacion que desee realizar: ");
    int literal = bicho.nextInt();
    double resp = 0;
    switch (literal){
        case 1: System.out.println("Ingrese el radio: ");
        double radio= bicho.nextDouble();
        resp = Math.PI * Math.pow(radio, 2);
        break;
        case 2: 
        System.out.println("Ingrese el radio: ");
        double radio2 = bicho.nextDouble();
        
        resp = 2 * Math.PI * radio2;
            break;
            default: System.out.println("Opcion no valida");
    }

return resp;
}

public static double revolverTrapecio(Scanner joya){
    System.out.println("--Menu de operaciones--");
    System.out.println("1. Area");
    System.out.println("2. Perimetro");
    System.out.println("Ingrese la operacion que desee realizar: ");
    int numero = joya.nextInt();
    double respu = 0;
    switch (numero){
        case 1: System.out.println("Ingrese la base mayor: ");
        double baseM= joya.nextDouble();
        System.out.println("Ingrese la base menor: ");
        double basem= joya.nextDouble();
        System.out.println("Ingrese la altura: ");
        double altura3 = joya.nextDouble();
        respu = ((baseM+basem)/2)*altura3;
        break;
        case 2:
        System.out.println("Ingrese el lado 1: ");
        double ladoo1 = joya.nextDouble();
        System.out.println("Ingrese el lado 2:  ");
        double ladoo2 = joya.nextDouble();
        System.out.println("Ingrese el lado 3: ");
        double ladoo3 = joya.nextDouble();
        System.out.println("Ingrese el lado 4: ");
        double ladoo4 = joya.nextDouble();
        respu = ladoo1 + ladoo2 + ladoo3 + ladoo4;
            break;
            default: System.out.println("Opcion no valida");
    }
return respu;
}

}
