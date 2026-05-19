package SerieGraphos_Marcos;

public class g5_compilValidVariables {

// con el for
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

// con el while
/*
public class g5_compilValidVariables {
    public boolean variableCorrecta(String VariableC) {
        System.out.println("Validando la variable: " + VariableC);
        int Estado = 0;
        int i = 0;
        while (i < VariableC.length()) {
            char Simbolo = VariableC.charAt(i);
            switch (Estado) {
                case 0:
                    if (Simbolo == '_' || Simbolo == '$' || Character.isLetter(Simbolo)) {
                        Estado = 1;
                    } else {
                        return false;
                    }
                    break;
                case 1:
                    if (Simbolo == '_' || Simbolo == '$' || Character.isLetter(Simbolo) || Character.isDigit(Simbolo)) {
                        Estado = 1;
                    } else if (Simbolo == ' ') {
                        Estado = 2;
                    } else if (Simbolo == ';' || Simbolo == ',' || Simbolo == '=') {
                        Estado = 3;
                    } else {
                        return false;
                    }
                    break;
                case 2:
                    if (Simbolo == ',') {
                        Estado = 3;
                    } else {
                        return false;
                    }
                    break;
                case 3:
                default:
                    return false;
            }
            i++;
        }
        return Estado == 1 || Estado == 2 || Estado == 3;
    }
}
*/

// con el do while
/*
public class g5_compilValidVariables {
    public boolean variableCorrecta(String VariableC) {
        System.out.println("Validando la variable: " + VariableC);
        int Estado = 0;
        int i = 0;
        do {
            char Simbolo = VariableC.charAt(i);
            switch (Estado) {
                case 0:
                    if (Simbolo == '_' || Simbolo == '$' || Character.isLetter(Simbolo)) {
                        Estado = 1;
                    } else {
                        return false;
                    }
                    break;
                case 1:
                    if (Simbolo == '_' || Simbolo == '$' || Character.isLetter(Simbolo) || Character.isDigit(Simbolo)) {
                        Estado = 1;
                    } else if (Simbolo == ' ') {
                        Estado = 2;
                    } else if (Simbolo == ';' || Simbolo == ',' || Simbolo == '=') {
                        Estado = 3;
                    } else {
                        return false;
                    }
                    break;
                case 2:
                    if (Simbolo == ',') {
                        Estado = 3;
                    } else {
                        return false;
                    }
                    break;
                case 3:
                default:
                    return false;
            }
            i++;
        } while (i < VariableC.length());
        return Estado == 1 || Estado == 2 || Estado == 3;
    }
}
*/