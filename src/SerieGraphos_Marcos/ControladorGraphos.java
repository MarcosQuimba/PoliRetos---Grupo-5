package SerieGraphos_Marcos;

public class ControladorGraphos {
    public void main() {

        g5_Validacion_abc_1 validacion = new g5_Validacion_abc_1();
        String test1 = "bbbc"; // Válida
        String test2 = "aabbbc";   // Válida
        System.out.println("Test 1: " + validacion.validar_ABC(test1));
        System.out.println("Test 2: " + validacion.validar_ABC(test2));

        g5_compilValidVariables validacionVariables = new g5_compilValidVariables();
        String variable1 = "var1"; // Válida
        System.out.println("Variable 1: " + validacionVariables.variableCorrecta(variable1));

        g5_ValidadorClave validadorClave = new g5_ValidadorClave();
        String clave1 = "Abc123!"; // Válida
        System.out.println("Clave 1: " + validadorClave.ClaveValida(clave1));

    }
}
