package EjerciciosLoading;

public class LoadingEjercicios {
 
    public void Loading01(){
        for (int i = 0; i <= 100; i++) {
            
            if ((i%5)==1) {
                System.out.println('\\'+" "+i+"%");
            } 
            if ((i%5)==2) {
                System.out.println('|'+" "+i+"%");
            } 
            if ((i%5)==3) {
                System.out.println('/'+" "+i+"%");
            } 
            if ((i%5)==4) {
                System.out.println('-'+" "+i+"%");
            } 
            if ((i%5)==0) {
                System.out.println('|'+" "+i+"%");
            } 
            try {   
                Thread.sleep(300);
                } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
   public void Loading05() {

        int tamano = 20;

        for (int i = 0; i <= tamano; i++) {

            System.out.print("\r[");

            for (int j = 0; j < i; j++) {

                System.out.print("=");
            }

            if (i % 2 == 0) {

                System.out.print(">");

            } else {

                System.out.print("-");
            }

            for (int j = i; j < tamano; j++) {

                System.out.print(" ");
            }

            int porcentaje = (i * 100) / tamano;

            System.out.print("] " + porcentaje + "%");

            try {

                Thread.sleep(200);

            } catch (InterruptedException e) {

                System.out.println("Error en el delay");
            }
        }
        System.out.println();
    }
    public void Loading07() {

        int tamano = 20;

        char[] rotacion = {'\\', '|', '/', '-'};

        int indice = 0;

        for (int i = 0; i <= tamano; i++) {

            System.out.print("\r[");

            for (int j = 0; j < i; j++) {

                System.out.print("=");
            }

            System.out.print(rotacion[indice]);

            indice++;

            if (indice >= rotacion.length) {

                indice = 0;
            }

            for (int j = i; j < tamano; j++) {

                System.out.print(" ");
            }

            int porcentaje = (i * 100) / tamano;

            System.out.print("] " + porcentaje + "%");

            try {

                Thread.sleep(200);

            } catch (InterruptedException e) {

                System.out.println("Error en el delay");
            }
        }

        System.out.println();
    }

        public void Loading9() {

        String nombre = "Darwin Anderson Vega Yanza";

        String texto = nombre.replace(" ", "");

        int total = texto.length();

        int columnaPorcentaje = total + 5;

        for (int i = 0; i < total; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print(" ");
            }

            System.out.print(texto.charAt(i));

            int espacios = columnaPorcentaje - i;

            for (int j = 0; j < espacios; j++) {

                System.out.print(" ");
            }

            int porcentaje = ((i + 1) * 100) / total;

            System.out.println(porcentaje + "%");

            try {

                Thread.sleep(300);

            } catch (InterruptedException e) {

                System.out.println("Error");
            }
        }
    }
}


