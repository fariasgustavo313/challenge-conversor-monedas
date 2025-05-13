package org.example.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FiltroMonedas {

    private static final String[] CODIGOS_INTERES = {"ARS", "BOB", "BRL", "CLP", "COP", "USD"};

    public static List<Moneda> filtrarMonedas(Map<String, Double> tasas) {
        List<Moneda> monedasFiltradas = new ArrayList<>();

        for (String codigo : CODIGOS_INTERES) {
            if (tasas.containsKey(codigo)) {
                monedasFiltradas.add(new Moneda(codigo, tasas.get(codigo)));
            }
        }

        return monedasFiltradas;
    }
}
