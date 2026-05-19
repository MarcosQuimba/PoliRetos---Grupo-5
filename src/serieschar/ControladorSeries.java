package serieschar;


public class ControladorSeries {
        public void mostrarSeriesChar(){
        Letraa letra= new Letraa();
        Lineaa linea= new Lineaa();
        Masmenoss mas= new Masmenoss();

        letra.mostrarLetras();
        linea.crearSerie(10);
        mas.escribirMas(10);
    }
}
