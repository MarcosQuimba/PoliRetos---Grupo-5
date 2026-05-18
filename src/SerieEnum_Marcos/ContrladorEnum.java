package SerieEnum_Marcos;

public class ContrladorEnum {

    public void ControlarEnum(){
        
        g5_Duplicador duplicador = new g5_Duplicador();
        duplicador.MostrarDup();
        g5_Figonachi figonachi = new g5_Figonachi();
        figonachi.MostrarFigonachi();
        g5_MasTres masTres = new g5_MasTres();
        masTres.MostrarMasTres();
        g5_NumerosPrimos mostrarPrimos = new g5_NumerosPrimos();
        mostrarPrimos.MostrarPrimos();

    }
}
