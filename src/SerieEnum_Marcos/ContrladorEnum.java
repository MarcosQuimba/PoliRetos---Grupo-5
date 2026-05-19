package SerieEnum_Marcos;

public class ContrladorEnum {

    public void ControlarEnum(){
        
        int contador = 7;
        g5_Duplicador duplicador = new g5_Duplicador();
        duplicador.MostrarDup(contador);
        g5_Figonachi figonachi = new g5_Figonachi();
        figonachi.MostrarFigonachi(contador);
        g5_MasTres masTres = new g5_MasTres();
        masTres.MostrarMasTres(contador);
        g5_NumerosPrimos mostrarPrimos = new g5_NumerosPrimos();
        mostrarPrimos.MostrarPrimos();
    }
}
