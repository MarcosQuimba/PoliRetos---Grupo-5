package SerieGraphos_Marcos;

public class g5_Validacion_abc_1 {

// con el for
    public boolean validar_ABC(String Letters) {
        System.err.println("Validando la cadena: " + Letters);
        int estado = 0;

        for (int i = 0; i < Letters.length(); i++) {
            char actual = Letters.charAt(i);
            switch (estado) {
                case 0:
                    if (actual == 'a') {
                        estado = 0;
                    } else if (actual == 'b') {
                        estado = 1;
                    } else {
                        return false;
                    }
                    break;
                case 1:
                    if (actual == 'b') {
                        estado = 1;
                    } else if (actual == 'c') {
                        estado = 2;
                    } else {
                        return false;
                    }
                    break;
                case 2:
                    return false;
                default:
                    return false;
            }
        }
        return estado == 2;
    }
}

// con el while
/*
public class g5_Validacion_abc_1 {
    public boolean validar_ABC(String Letters) {
        System.err.println("Validando la cadena: " + Letters);
        int estado = 0;
        int i = 0;

        while (i < Letters.length()) {
            char actual = Letters.charAt(i);
            switch (estado) {
                case 0:
                    if (actual == 'a') {
                        estado = 0;
                    } else if (actual == 'b') {
                        estado = 1;
                    } else {
                        return false;
                    }
                    break;
                case 1:
                    if (actual == 'b') {
                        estado = 1;
                    } else if (actual == 'c') {
                        estado = 2;
                    } else {
                        return false;
                    }
                    break;
                case 2:
                    return false;
                default:
                    return false;
            }
            i++;
        }
        return estado == 2;
    }
}
*/

// con el do while
/*
public class g5_Validacion_abc_1 {
    public boolean validar_ABC(String Letters) {
        System.err.println("Validando la cadena: " + Letters);
        int estado = 0;
        int i = 0;

        do {
            if (i >= Letters.length()) break;
            char actual = Letters.charAt(i);
            switch (estado) {
                case 0:
                    if (actual == 'a') {
                        estado = 0;
                    } else if (actual == 'b') {
                        estado = 1;
                    } else {
                        return false;
                    }
                    break;
                case 1:
                    if (actual == 'b') {
                        estado = 1;
                    } else if (actual == 'c') {
                        estado = 2;
                    } else {
                        return false;
                    }
                    break;
                case 2:
                    return false;
                default:
                    return false;
            }
            i++;
        } while (true);
        return estado == 2;
    }
}
*/