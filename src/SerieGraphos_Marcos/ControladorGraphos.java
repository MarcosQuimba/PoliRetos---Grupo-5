package SerieGraphos_Marcos;

public class ControladorGraphos {
    public void main() {

        Validacion_abc_1 validacion = new Validacion_abc_1();
        String test1 = "bbbc"; // Válida
        String test2 = "aabbbc";   // Válida
        System.out.println("Test 1: " + validacion.validar_ABC(test1));
        System.out.println("Test 2: " + validacion.validar_ABC(test2));

        compilValidVariables validacionVariables = new compilValidVariables();
        String variable1 = "var1"; // Válida
        System.out.println("Variable 1: " + validacionVariables.variableCorrecta(variable1));

        ValidadorClave validadorClave = new ValidadorClave();
        String clave1 = "Abc123!"; // Válida
        System.out.println("Clave 1: " + validadorClave.ClaveValida(clave1));

    }
}
