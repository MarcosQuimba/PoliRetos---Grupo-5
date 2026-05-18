package EjerciciosArrays;

import java.util.Random;

public class NombreRandom {
        public void mostrarMatrizRandom() {
        String[] nombres={"Marmota20", "WTFsito", "Ronaldjs64","MarcosQuimba"};
   
        int tamArray=0;
    
        for (int i = 0; i < nombres.length; i++) {

            if (nombres[i].length() > tamArray) {

                tamArray = nombres[i].length();
            }
        }

        String[][] matRandom = new String[tamArray][tamArray];

        for (int i = 0; i < tamArray; i++) {

            for (int j = 0; j < tamArray; j++) {

                matRandom[i][j] = ".";
            }
        }

        Random randomUbi = new Random();

        for (int i = 0; i < nombres.length; i++) {
            int j=0;
            for ( j = 0; j < nombres[i].length(); j++) {
            
                char letra = nombres[i].charAt(j);
                int fila = randomUbi.nextInt(tamArray);
                int columna = randomUbi.nextInt(tamArray);
                int a=i;
                int b=j;

                if (!matRandom[fila][columna].equals(".")) {

                    matRandom[fila][columna] = "*";
                } else {

                    matRandom[fila][columna] = String.valueOf(letra);
                }
                
                System.out.println();

                for (a = 0; a < tamArray; a++) {

                    for (b = 0; b < tamArray; b++) {

                        System.out.print(matRandom[a][b] + " ");
                    }

                    System.out.println();
                }
                try {
                    Thread.sleep(300);
                    } catch (InterruptedException e) {
                    e.printStackTrace();
                }


             }
            }
        }
    }
        
