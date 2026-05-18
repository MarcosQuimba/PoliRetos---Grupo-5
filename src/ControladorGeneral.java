
/*Indicador de carga desde 0  a 100% usar los signos \|/-| para simular un 
movimiento rotacional de carga 0% hasta 100%  */

import EjerciciosArrays.ContoladorArrays;
import EjerciciosLoading.ControladorLoading;
import SerieEnum_Marcos.ContrladorEnum;
import SerieGraphos_Marcos.ControladorGraphos;
import java.util.concurrent.TimeUnit;

public class ControladorGeneral {

    public static void main() throws InterruptedException {

        System.out.println("Bienvenido, este es el programa hecho por el Grupo 5");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("Integrantes:");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ronald Sisa");
        System.out.println("Christian Trujillo");
        System.out.println("Darwin Vega");
        System.out.println("Marcos Quimba");
        TimeUnit.SECONDS.sleep(5);
        
        //Darwin Seccion 4
        ContoladorArrays contoladorArrays= new ContoladorArrays();
        contoladorArrays.mostrarArrays();
        //Darwin Seccion 5
        ControladorLoading controladorLoading= new ControladorLoading();
        controladorLoading.mostrarLoading();

        //Marcos Seccion 1
        ContrladorEnum contrladorEnum= new ContrladorEnum();
        contrladorEnum.ControlarEnum();
        //Marcos Seccion 2
        ControladorGraphos controladorGrafos = new ControladorGraphos();
        controladorGrafos.main();
        
    }

}
