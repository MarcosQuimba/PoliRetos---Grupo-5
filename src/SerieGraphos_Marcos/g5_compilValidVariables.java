package SerieGraphos_Marcos;

public class compilValidVariables {

    public boolean variableCorrecta(String VariableC) {
        System.out.println("Validando la variable: " + VariableC);
    int Estado = 0;
        for (int i = 0; i < VariableC.length(); i++) {
            char Simbolo = VariableC.charAt(i);
            switch (Estado) {
                case 0:
                    if (Simbolo == '_' || Simbolo == '$' || Character.isLetter(Simbolo)) {
                        Estado = 1;
                        break;
                    } else {
                        return false;
                    }
                case 1:
                    if (Simbolo == '_' || Simbolo == '$' || Character.isLetter(Simbolo) || Character.isDigit(Simbolo)) {
                        Estado = 1;
                        break;
                    }
                    if (Simbolo == ' ') {
                        Estado = 2;
                        break;
                    }
                    if (Simbolo == ';' || Simbolo == ',' || Simbolo == '=') {
                        Estado = 3;
                        break;
                    } else {
                    return false;
                    }
                case 2:
                    if (Simbolo == ',') {
                        Estado = 3;
                        break;
                    } else {
                        return false;
                    }
                case 3:
                default:
                    return false;
                    }

            }
            return Estado == 1 || Estado == 2 || Estado == 3;
        }
    }