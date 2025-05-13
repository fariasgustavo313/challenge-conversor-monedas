package org.example.model;

import java.util.List;

public class ConversorMoneda {

    private final List<Moneda> monedas;

    public ConversorMoneda(List<Moneda> monedas) {
        this.monedas = monedas;
    }

    public double convertir(String codigoOrigen, String codigoDestino, double monto) {
        double tasaOrigen = obtenerTasa(codigoOrigen);
        double tasaDestino = obtenerTasa(codigoDestino);

        if (tasaOrigen == -1 || tasaDestino == -1) {
            throw new IllegalArgumentException("Código de moneda inválido");
        }

        return (monto / tasaOrigen) * tasaDestino;
    }

    private double obtenerTasa(String codigo) {
        for (Moneda moneda : monedas) {
            if (moneda.getCodigo().equalsIgnoreCase(codigo)) {
                return moneda.getTasa();
            }
        }
        return -1;
    }
}
