package br.com.cnnovelty.felipeneaimeviagens.ui;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class MoedaUtil {

    public static final String PORTUGUES = "pt";
    public static final String BRASILEIRO = "br";

    public static String formataMoedaBrasileira(BigDecimal valor) {
        NumberFormat formatoBrasileiro = DecimalFormat.getCurrencyInstance(new Locale(PORTUGUES, BRASILEIRO));
        return formatoBrasileiro.format(valor);
    }

}
