
/*Indicador de carga desde 0  a 100% usar los signos \|/-| para simular un 
movimiento rotacional de carga 0% hasta 100%  */

import EjerciciosArrays.ContoladorArrays;
import EjerciciosLoading.ControladorLoading;

public class ControladorGeneral {

    public static void main(String[] args) throws InterruptedException {
        //Seccion 4
        ContoladorArrays contoladorArrays= new ContoladorArrays();
        contoladorArrays.mostrarArrays();
        //Seccion 5
        ControladorLoading controladorLoading= new ControladorLoading();
        controladorLoading.mostrarLoading();
    }
}
