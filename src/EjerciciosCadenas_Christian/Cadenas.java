package EjerciciosCadenas_Christian;

public class Cadenas { 

    // Métodos de Cadenas
        public void countVocales(String frase) {
            int total = 0;
            for (int i = 0; i < frase.length(); i++) {
                char letra = Character.toLowerCase(frase.charAt(i));
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') total++;
            }
        System.out.println("Salida: tiene " + total + " vocales");
        }


   /*public void contarVocalesWhile(String frase) {
    int total = 0;
    int i = 0;

    while (i < frase.length()) {
        char letra = Character.toLowerCase(frase.charAt(i));
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            total++;
        }
        i++;
    }
    System.out.println("Salida: tiene " + total + " vocales");
} */
    /*public void contarVocalesDoWhile(String frase) {
    int total = 0;
    int i = 0;

    if (frase.length() > 0) {
        do {
            char letra = Character.toLowerCase(frase.charAt(i));
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                total++;
            }
            i++;
        } while (i < frase.length());
    }
    System.out.println("Salida: tiene " + total + " vocales");
} */

    public void invertirFrase(String frase) {
        String resultado = "";
        int i = frase.length() - 1;
        while (i >= 0) {
            char l = frase.charAt(i);
            if ("aeiouAEIOU".indexOf(l) != -1) resultado += Character.toUpperCase(l);
            else resultado += Character.toLowerCase(l);
            i--;
        }
        System.out.println("Salida: " + resultado);
    }
    /*public void invertirFraseConFor(String frase) {
    String resultado = "";
    
    for (int i = frase.length() - 1; i >= 0; i--) {
        char l = frase.charAt(i);
        if ("aeiouAEIOU".indexOf(l) != -1) {
            resultado += Character.toUpperCase(l);
        } else {
            resultado += Character.toLowerCase(l);
        }
    }
    
    System.out.println("Salida: " + resultado);
}
    /* public void invertirFraseConDoWhile(String frase) {
    if (frase == null || frase.isEmpty()) {
        System.out.println("Salida: ");
        return;
    }

    String resultado = "";
    int i = frase.length() - 1;
    
    do {
        char l = frase.charAt(i);
        if ("aeiouAEIOU".indexOf(l) != -1) {
            resultado += Character.toUpperCase(l);
        } else {
            resultado += Character.toLowerCase(l);
        }
        i--;
    } while (i >= 0);
    
    System.out.println("Salida: " + resultado);
} */
    public void eliminarJota(String frase) {
        String resultado = "";
        int i = 0;
        if (!frase.isEmpty()) {
            do {
                char l = frase.charAt(i);
                if (l != 'j' && l != 'J') resultado += Character.toUpperCase(l);
                i++;
            } while (i < frase.length());
        }
        System.out.println("Salida: " + resultado);
    }
    /*public void eliminarJotaWhile(String frase) {
    String resultado = "";
    int i = 0;
    
    while (i < frase.length()) {
        char l = frase.charAt(i);
        if (l != 'j' && l != 'J') {
            resultado += Character.toUpperCase(l);
        }
        i++;
    }
    
    System.out.println("Salida: " + resultado);
}   
    /* public void eliminarJotaFor(String frase) {
    String resultado = "";
    
    for (int i = 0; i < frase.length(); i++) {
        char l = frase.charAt(i);
        if (l != 'j' && l != 'J') {
            resultado += Character.toUpperCase(l);
        }
    }
    
    System.out.println("Salida: " + resultado);
}*/
    public void invertirMin(String frase) {
        String resultado = "";
        for (int i = 0; i < frase.length(); i++) {
            if (i % 2 == 0) resultado += Character.toUpperCase(frase.charAt(i));
            else resultado += Character.toLowerCase(frase.charAt(i));
        }
        System.out.println("Salida: " + resultado);
    }
}

/*public void invertirMinWhile(String frase) {
    String resultado = "";
    int i = 0;

    while (i < frase.length()) {
        if (i % 2 == 0) {
            resultado += Character.toUpperCase(frase.charAt(i));
        } else {
            resultado += Character.toLowerCase(frase.charAt(i));
        }
        i++;
    }
    System.out.println("Salida: " + resultado);
} */