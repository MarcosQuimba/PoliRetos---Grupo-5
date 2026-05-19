import EjerciciosArrays_Darwin.ContoladorArrays;
import EjerciciosCadenas_Christian.ControladorCadenas;
import EjerciciosLoading_Darwin.ControladorLoading;
import EjerciciosRecursion_Christian.ControladorRecursion;
import SerieEnum_Marcos.ContrladorEnum;
import SerieGraphos_Marcos.ControladorGraphos;
import graficos_Ronald.controlador_grafico;
import java.util.concurrent.TimeUnit;
import serieschar_Ronald.controlador_seriee;


public class ControladorGeneral {

    public static void main() throws InterruptedException {
        
        System.out.println("Bienvenido, este es el programa hecho por el Grupo 5");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Integrantes:");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ronald Sisa");
        System.out.println("Christian Trujillo");
        System.out.println("Darwin Vega");
        System.out.println("Marcos Quimba");
        TimeUnit.SECONDS.sleep(5);
        
        
        //Marcos Seccion 1
        ContrladorEnum controladorEnum= new ContrladorEnum();
        controladorEnum.ControlarEnum();

        //Ronald Seccion 2
        controlador_seriee controladorSeries = new controlador_seriee();
        controladorSeries.ejecutar();
    
        //Seccion 3
        controlador_grafico controladorFiguras= new controlador_grafico();
        controladorFiguras.ejecutar();
        
        //Christian Seccion 4
        ControladorCadenas controladorCadenas= new ControladorCadenas();
        controladorCadenas.mostrarCadenas();
        TimeUnit.SECONDS.sleep(2);

        //Darwin Seccion 5
        ContoladorArrays contoladorArrays= new ContoladorArrays();
        contoladorArrays.mostrarArrays();
        TimeUnit.SECONDS.sleep(2);

        //Darwin Seccion 6
        ControladorLoading controladorLoading= new ControladorLoading();
        controladorLoading.mostrarLoading();
        
        //Christian Seccion 7
        ControladorRecursion controladorRecursion= new ControladorRecursion();
        controladorRecursion.mostrarRecursion();

        //Marcos Seccion 8
        ControladorGraphos controladorGrafos = new ControladorGraphos();
        controladorGrafos.main();
        
    }

}
