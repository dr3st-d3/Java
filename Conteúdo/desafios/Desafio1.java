package desafios;

import java.util.Locale;

public class Desafio1 {
    public static void main(String[] args) {
        Locale currentLocale = Locale.getDefault();
        String idioma = currentLocale.getLanguage();
        System.out.println("Seu sistema está em " + idioma);
    }
}
