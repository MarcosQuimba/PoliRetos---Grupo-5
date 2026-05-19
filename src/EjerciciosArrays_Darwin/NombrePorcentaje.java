package EjerciciosArrays_Darwin;

public class NombrePorcentaje {

    public static void main(String[] args) {
        
        String[] nombres={"Marmota20", "WTFsito", "Ronaldjs64","MarcosQuimba"};
        int[] porcentaje={100, 75, 50, 25};

        for (int i = 0; i < nombres.length; i++) {

             int letras = (nombres[i].length()*porcentaje[i]) / 100;

             if (letras < 1 && porcentaje[i]> 0) {
                letras = 1;
            }
            
            String parte = nombres[i].substring(0, letras);

            int bloques = porcentaje[i] / 10;

            System.out.print("[");

            for (int j = 0; j < bloques; j++) {
                System.out.print("=");
            }

            System.out.print(">");

            for (int j = bloques; j < 10; j++) {
                System.out.print(" ");
            }

            System.out.println("] " + porcentaje[i] + "% " + parte);

             
    


        }
    }   
}
