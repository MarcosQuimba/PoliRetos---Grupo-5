package SerieGraphos_Marcos;

public class g5_ValidadorClave {

// con el for
    public boolean ClaveValida(String Clave) {
        System.out.println("Validando la clave: " + Clave);
        boolean minusValido = false;
        boolean MayusValido = false;
        boolean DigitoValido = false;
        boolean SimboloValido = false;

        for (int i = 0; i < Clave.length(); i++) {
            char Revisar = Clave.charAt(i);
            if (Character.isLowerCase(Revisar)) {
                minusValido = true;
            } else if (Character.isUpperCase(Revisar)) {
                MayusValido = true;
            } else if (Character.isDigit(Revisar)) {
                DigitoValido = true;
            } else if (Revisar == '!' || Revisar == '@' || Revisar == '#' || Revisar == '$' || Revisar == '%' || Revisar == '^' || Revisar == '&' || Revisar == '*' || Revisar == '(' || Revisar == ')' || Revisar == '-' || Revisar == '+') {
                SimboloValido = true;
            } else {
                return false;
            }
    }
    return minusValido && MayusValido && DigitoValido && SimboloValido;
    }
}

// con el while
/*
public class g5_ValidadorClave {
    public boolean ClaveValida(String Clave) {
        System.out.println("Validando la clave: " + Clave);
        boolean minusValido = false;
        boolean MayusValido = false;
        boolean DigitoValido = false;
        boolean SimboloValido = false;
        int i = 0;

        while (i < Clave.length()) {
            char Revisar = Clave.charAt(i);
            if (Character.isLowerCase(Revisar)) {
                minusValido = true;
            } else if (Character.isUpperCase(Revisar)) {
                MayusValido = true;
            } else if (Character.isDigit(Revisar)) {
                DigitoValido = true;
            } else if (Revisar == '!' || Revisar == '@' || Revisar == '#' || Revisar == '$' || Revisar == '%' || Revisar == '^' || Revisar == '&' || Revisar == '*' || Revisar == '(' || Revisar == ')' || Revisar == '-' || Revisar == '+') {
                SimboloValido = true;
            } else {
                return false;
            }
            i++;
        }
        return minusValido && MayusValido && DigitoValido && SimboloValido;
    }
}
*/

// con el do while
/*
public class g5_ValidadorClave {
    public boolean ClaveValida(String Clave) {
        System.out.println("Validando la clave: " + Clave);
        boolean minusValido = false;
        boolean MayusValido = false;
        boolean DigitoValido = false;
        boolean SimboloValido = false;
        int i = 0;

        do {
            if (i >= Clave.length()) break;
            char Revisar = Clave.charAt(i);
            if (Character.isLowerCase(Revisar)) {
                minusValido = true;
            } else if (Character.isUpperCase(Revisar)) {
                MayusValido = true;
            } else if (Character.isDigit(Revisar)) {
                DigitoValido = true;
            } else if (Revisar == '!' || Revisar == '@' || Revisar == '#' || Revisar == '$' || Revisar == '%' || Revisar == '^' || Revisar == '&' || Revisar == '*' || Revisar == '(' || Revisar == ')' || Revisar == '-' || Revisar == '+') {
                SimboloValido = true;
            } else {
                return false;
            }
            i++;
        } while (true);
        return minusValido && MayusValido && DigitoValido && SimboloValido;
    }
}
*/