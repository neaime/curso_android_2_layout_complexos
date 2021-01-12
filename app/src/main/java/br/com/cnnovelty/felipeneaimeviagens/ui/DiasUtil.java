package br.com.cnnovelty.felipeneaimeviagens.ui;

import org.jetbrains.annotations.NotNull;

public class DiasUtil {

    public static final String PLURAL = " dias";
    public static final String SINGULAR = " dia";

    @NotNull
    public static String formataEmTexto(int quantidadeDeDias) {
        if (quantidadeDeDias > 1) {
            return quantidadeDeDias + PLURAL;
        }
        return quantidadeDeDias + SINGULAR;
    }

}
