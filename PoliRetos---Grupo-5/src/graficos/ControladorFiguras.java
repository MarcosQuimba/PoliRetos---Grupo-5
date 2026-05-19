package graficos;

public class ControladorFiguras {

    public void mostrarFiguras(){

        Cuadradoo cuadrado= new Cuadradoo();
        Diagonall diagonall= new Diagonall();
        Gradaa gradaa= new Gradaa();
        Arboll arboll= new Arboll();
        Plusminus plusminus= new Plusminus();

        cuadrado.crearCuadrado(10);
        diagonall.graficarMatriz(10);
        gradaa.crearEscalera(10);
        arboll.crearArbol(10);
        plusminus.sumarSignos(10);
    }
}
