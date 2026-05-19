


import EjerciciosArrays_Darwin.ContoladorArrays;
import EjerciciosLoading_Darwin.ControladorLoading;
import SerieEnum_Marcos.ContrladorEnum;
import SerieGraphos_Marcos.ControladorGraphos;
import serieschar.ControladorSeries;
import graficos.ControladorFiguras;
import EjerciciosCadenas.ControladorCadenas;
import EjerciciosRecursion.ControladorRecursion;
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
        
        //Marcos Seccion 1
        ContrladorEnum contrladorEnum= new ContrladorEnum();
        contrladorEnum.ControlarEnum();

        //Seccion 2
        ControladorSeries controladorSeries = new ControladorSeries();
        controladorSeries.mostrarSeriesChar();

        //Seccion 3
        ControladorFiguras controladorFiguras= new ControladorFiguras();
        controladorFiguras.mostrarFiguras();
        //Seccion 4
        ControladorCadenas controladorCadenas= new ControladorCadenas();
        controladorCadenas.mostrarCadenas();


        //Darwin Seccion 5
        ContoladorArrays contoladorArrays= new ContoladorArrays();
        contoladorArrays.mostrarArrays();
        //Darwin Seccion 6
        ControladorLoading controladorLoading= new ControladorLoading();
        controladorLoading.mostrarLoading();

        //Seccion 7
        ControladorRecursion controladorRecursion= new ControladorRecursion();
        controladorRecursion.mostrarRecursion();

        //Marcos Seccion 8
        ControladorGraphos controladorGrafos = new ControladorGraphos();
        controladorGrafos.main();
        
    }

}
