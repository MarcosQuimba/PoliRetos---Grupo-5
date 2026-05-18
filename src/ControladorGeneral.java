
/*Indicador de carga desde 0  a 100% usar los signos \|/-| para simular un 
movimiento rotacional de carga 0% hasta 100%  */

import SerieEnum.ContrladorEnum;
import SerieGraphos.ControladorGraphos;

public class ControladorGeneral {

    public static void main() throws InterruptedException {
/*        
        //Darwin Seccion 4
        ContoladorArrays contoladorArrays= new ContoladorArrays();
        contoladorArrays.mostrarArrays();
        //Darwin Seccion 5
        ControladorLoading controladorLoading= new ControladorLoading();
        controladorLoading.mostrarLoading();
*/
        //Marcos Seccion 1
        ContrladorEnum contrladorEnum= new ContrladorEnum();
        contrladorEnum.ControlarEnum();
        //Marcos Seccion 2
        ControladorGraphos controladorGrafos = new ControladorGraphos();
        controladorGrafos.main();
        
    }

}
