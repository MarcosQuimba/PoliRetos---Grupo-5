import java.util.Scanner;

class Cadenas { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cadenas poli = new Cadenas();

        System.out.print("[C01] Escribe algo para contar vocales: ");
        poli.g5_c01(sc.nextLine());

        System.out.print("[C05] Escribe algo para invertirlo: ");
        poli.g5_c05(sc.nextLine());

        System.out.print("[C07] Escribe algo para borrarle la J: ");
        poli.g5_c07(sc.nextLine());

        System.out.print("[C09] Escribe algo para cambiar mayus/minus: ");
        poli.g5_c09(sc.nextLine());
    }

    // Métodos de Cadenas
    public void g5_c01(String frase) {
        int total = 0;
        for (int i = 0; i < frase.length(); i++) {
            char letra = Character.toLowerCase(frase.charAt(i));
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') total++;
        }
        System.out.println("Salida: tiene " + total + " vocales");
    }

    public void g5_c05(String frase) {
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

    public void g5_c07(String frase) {
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

    public void g5_c09(String frase) {
        String resultado = "";
        for (int i = 0; i < frase.length(); i++) {
            if (i % 2 == 0) resultado += Character.toUpperCase(frase.charAt(i));
            else resultado += Character.toLowerCase(frase.charAt(i));
        }
        System.out.println("Salida: " + resultado);
    }
}